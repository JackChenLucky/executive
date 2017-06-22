package cn.jack.executive.system.dao;

import java.util.List;
import java.util.Map;

import org.beetl.sql.core.mapper.BaseMapper;

import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.model.SysUserRole;

public interface SysUserRoleDao extends BaseMapper<SysUserRole>{

	List<SysUser> findUserByRole(Map<String,String> pParm);

}
