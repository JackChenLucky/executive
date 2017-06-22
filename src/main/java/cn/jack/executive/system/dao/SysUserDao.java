package cn.jack.executive.system.dao;

import java.util.List;

import org.beetl.sql.core.mapper.BaseMapper;

import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.model.vo.UserSearchVo;

public interface SysUserDao extends BaseMapper<SysUser> {

	List<SysUser> findUserByRole(UserSearchVo userSearchVo);
}
