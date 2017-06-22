package cn.jack.executive.system.service;

import java.util.List;

import cn.jack.executive.system.model.SysUser;

public interface SysUserRoleService {

	List<SysUser> findUserByRole(String id);

}
