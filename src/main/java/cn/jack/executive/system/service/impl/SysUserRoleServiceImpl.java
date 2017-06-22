package cn.jack.executive.system.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jack.executive.system.dao.SysUserRoleDao;
import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.service.SysUserRoleService;

@Service
public class SysUserRoleServiceImpl implements SysUserRoleService{

	@Autowired
	private SysUserRoleDao sysUserRoleDao;

	@Autowired
	private SQLManager sqlManager;
	
	@Override
	public List<SysUser> findUserByRole(String id) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("id", id);
		return sysUserRoleDao.findUserByRole(map);
	}

}
