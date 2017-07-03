package cn.jack.executive.modules.system.service.impl;

import cn.jack.executive.modules.system.model.SysUser;
import cn.jack.executive.modules.system.model.vo.SysUserVo;
import cn.jack.executive.modules.system.model.vo.UserSearchVo;
import cn.jack.executive.core.shiro.ShiroKit;
import cn.jack.executive.modules.system.dao.SysUserMapper;
import cn.jack.executive.modules.system.service.ISysUserService;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jackchen
 * @since 2017-07-07
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public SysUser findUserByLoginName(String account) {
		SysUser user = new SysUser();
		user.setLoginname(account);
		return super.selectOne(new EntityWrapper<SysUser>(user));
	}

	@Override
	public SysUser findUserById(String id) {
		return sysUserMapper.selectById(id);
	}

	@Override
	public void saveUser(SysUser sysuser) {
		sysUserMapper.updateById(sysuser);
	}

	@Override
	public Page<SysUserVo> findUserByPage(Page<SysUserVo> page,UserSearchVo userSearchVo) {
		page.setRecords(sysUserMapper.findUserByPage(page,userSearchVo));
        return page;
	}

	@Override
	public void deleteByKey(String uid) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 *重置用户的密码 为1
	 */
	@Override
	public boolean resetPassword(Integer uid) {
		SysUser user = new SysUser();
		user.setId(uid);
		user.setPassword(ShiroKit.md5("1", "jackchen"));
		return sysUserMapper.updateById(user)>0;
	}
	
}
