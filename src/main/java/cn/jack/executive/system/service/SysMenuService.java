package cn.jack.executive.system.service;

import org.beetl.sql.core.engine.PageQuery;

import cn.jack.executive.system.model.MenuTree;
import cn.jack.executive.system.model.SysMenu;
import cn.jack.executive.system.model.vo.MenuSearchVo;

public interface SysMenuService {

	PageQuery<SysMenu> findMenuByPage(MenuSearchVo menuSearchVo);

	MenuTree getAllTreeMenu();

	SysMenu findMenuById(String id);

	void saveDept(SysMenu sysMenu);

}
