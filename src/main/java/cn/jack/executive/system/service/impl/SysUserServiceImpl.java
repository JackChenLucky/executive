package cn.jack.executive.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jack.executive.system.dao.SysUserDao;
import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.model.vo.UserSearchVo;
import cn.jack.executive.system.service.SysUserService;

/**
 * 用户管理模块服务实现类
 * @author JackChen
 *
 */
@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Autowired
	private SysUserDao sysUserDao;
	
	/**
	 * 根据条件查询用户列表
	 */
	@Override
	public List<SysUser> findUserBy(UserSearchVo userSearchVo) {
		return sysUserDao.findUserBy(userSearchVo);
	}

	/**
	 * 根据用户ID查询指定用户信息
	 */
	@Override
	public SysUser findUserById(String uid) {
		return sysUserDao.single(uid);
	}

	/**
	 * 根据用户ID，作废用户
	 */
	@Override
	public boolean deleteByKey(String id) {
		SysUser user = new SysUser();
		user.setId(Integer.parseInt(id));
		user.setStatus("-1");
		return sysUserDao.updateById(user)>0;
	}

	@Override
	public void saveUser(SysUser user) {
		if(user.getId()==null){
			sysUserDao.insert(user);
		}else{
			sysUserDao.updateById(user);
		}
	}

}
