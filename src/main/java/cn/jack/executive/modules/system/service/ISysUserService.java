package cn.jack.executive.modules.system.service;

import cn.jack.executive.modules.system.model.SysUser;
import cn.jack.executive.modules.system.model.vo.SysUserVo;
import cn.jack.executive.modules.system.model.vo.UserSearchVo;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Jackchen
 * @since 2017-07-07
 */
public interface ISysUserService extends IService<SysUser> {

	SysUser findUserByLoginName(String account);

	SysUser findUserById(String id);

	void saveUser(SysUser sysuser);

	Page<SysUserVo> findUserByPage(Page<SysUserVo> page, UserSearchVo userSearchVo);

	void deleteByKey(String uid);

	boolean resetPassword(Integer uid);

}
