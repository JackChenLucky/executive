package cn.jack.executive.system.dao;

import java.util.List;

import org.beetl.sql.core.mapper.BaseMapper;

import cn.jack.executive.system.model.MenuTree;
import cn.jack.executive.system.model.SysMenu;
import cn.jack.executive.system.model.vo.MenuSearchVo;

public interface SysMenuDao extends BaseMapper<SysMenu> {

	List<SysMenu> findMenuBy(MenuSearchVo deptSearchVo);

	List<MenuTree> findMenuByPid(Integer pid);
}
