package cn.jack.executive.modules.system.dao;

import cn.jack.executive.modules.system.model.SysUser;
import cn.jack.executive.modules.system.model.vo.SysUserVo;
import cn.jack.executive.modules.system.model.vo.UserSearchVo;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author Jackchen
 * @since 2017-07-07
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

	List<SysUserVo> findUserByPage(Page<SysUserVo> page, UserSearchVo userSearchVo);

}