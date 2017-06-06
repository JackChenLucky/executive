package cn.jack.executive.system.service;

import java.util.List;

import org.beetl.sql.core.engine.PageQuery;

import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.model.vo.SysUserVo;
import cn.jack.executive.system.model.vo.UserSearchVo;

public interface SysUserService {
	
	public PageQuery<SysUserVo> findUserByPage(UserSearchVo userSearchVo);

	/**
	 * 根据主间查找用户4
	 * @param uid
	 * @return
	 */
	public SysUser findUserById(String uid);

	/**
	 * 根据主键删除用户
	 * @param uid
	 * @return
	 */
	public boolean deleteByKey(String id);

	/**
	 * 保存用户信息
	 * @param user
	 * @return
	 */
	public void saveUser(SysUser user);
}
