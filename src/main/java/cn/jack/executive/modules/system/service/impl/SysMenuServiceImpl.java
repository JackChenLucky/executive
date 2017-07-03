package cn.jack.executive.modules.system.service.impl;

import cn.jack.executive.modules.system.model.MenuTree;
import cn.jack.executive.modules.system.model.SysMenu;
import cn.jack.executive.modules.system.dao.SysMenuMapper;
import cn.jack.executive.modules.system.service.ISysMenuService;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jackchen
 * @since 2017-07-06
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements ISysMenuService {

	@Autowired
	private SysMenuMapper sysMenuMapper;
	
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
		
		List<MenuTree> subMenuList = sysMenuMapper.findMenuByPid(menuTree.getId());
		for(MenuTree menu:subMenuList){
			FillSubMenus(menu);
			menuTree.getSubMenus().add(menu);
		}
	}
	
}
