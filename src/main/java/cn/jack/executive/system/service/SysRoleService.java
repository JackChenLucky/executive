package cn.jack.executive.system.service;

import org.beetl.sql.core.engine.PageQuery;

import cn.jack.executive.system.model.SysRole;
import cn.jack.executive.system.model.vo.RoleSearchVo;
import cn.jack.executive.system.model.vo.SysRoleVo;

public interface SysRoleService {

	void saveRole(SysRole sysRole);

	PageQuery<SysRoleVo> findRoleByPage(RoleSearchVo roleSearchVo);

	SysRole findRoleById(String id);

}
