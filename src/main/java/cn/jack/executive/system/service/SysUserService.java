package cn.jack.executive.system.service;

import java.util.List;

import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.model.vo.UserSearchVo;

public interface SysUserService {
	public List<SysUser> findUserBy(UserSearchVo userSearchVo);
}
