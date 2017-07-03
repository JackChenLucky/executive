package cn.jack.executive.system.dao;

import java.util.List;

import org.beetl.sql.core.mapper.BaseMapper;

import cn.jack.executive.system.model.SysRoleRight;

public interface SysRoleRightDao extends BaseMapper<SysRoleRight>{
 
	List<SysRoleRight> findRightByRoleId(String roleid);
}
