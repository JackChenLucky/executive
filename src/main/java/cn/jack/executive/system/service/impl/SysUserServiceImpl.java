package cn.jack.executive.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jack.executive.system.dao.SysUserDao;
import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.model.vo.UserSearchVo;
import cn.jack.executive.system.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Autowired
	private SysUserDao sysUserDao;
	
	@Override
	public List<SysUser> findUserBy(UserSearchVo userSearchVo) {
		return sysUserDao.findUserBy(userSearchVo);
	}

}
