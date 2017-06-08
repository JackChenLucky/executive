package cn.jack.executive.system.service.impl;

import java.util.List;

import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jack.executive.system.dao.SysMenuDao;
import cn.jack.executive.system.model.MenuTree;
import cn.jack.executive.system.model.SysDept;
import cn.jack.executive.system.model.SysMenu;
import cn.jack.executive.system.model.vo.MenuSearchVo;
import cn.jack.executive.system.service.SysMenuService;

@Service
public class SysMenuServiceImpl implements SysMenuService {

	@Autowired
	private SysMenuDao sysMenuDao;
	
	@Autowired
	private SQLManager sqlManager;
	
	
	@Override
	public PageQuery<SysMenu> findMenuByPage(MenuSearchVo menuSearchVo) {
		PageQuery<SysMenu> query = new PageQuery<SysMenu>();
		query.setPageNumber(menuSearchVo.getPageNum());
		query.setPageSize(menuSearchVo.getNumPerPage());
		query.setParas(menuSearchVo);
		sqlManager.pageQuery("sysMenu.findMenuBy", SysDept.class, query);
		return query;
	}

	@Override
	public MenuTree getAllTreeMenu() {
		MenuTree menuTree = new MenuTree();
		menuTree.setId(0);
		menuTree.setName("系统菜单");
		//1、查询当前节点的下级节点
		FillSubMenus(menuTree);
		return menuTree;
	}
	
	private void FillSubMenus(MenuTree menuTree){
		List<MenuTree> subMenuList = sqlManager.select("sysMenu.findMenuByPid", MenuTree.class, menuTree);
		for(MenuTree menu:subMenuList){
			FillSubMenus(menu);
			menuTree.getSubMenus().add(menu);
		}
	}

	@Override
	public SysMenu findMenuById(String id) {
		return sysMenuDao.single(id);
	}

	@Override
	public void saveDept(SysMenu sysMenu) {
		if(sysMenu.getId()==null){
			sysMenuDao.insert(sysMenu);
		}else{
			sysMenuDao.updateById(sysMenu);
		}
	}
}
