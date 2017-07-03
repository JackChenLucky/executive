package cn.jack.executive.system.service;

import java.util.List;

import cn.jack.executive.system.model.vo.SysRightVo;

/**
 * 角色权限关联服务
 * @author JackChen
 *
 */
public interface SysRoleRightService {
	/**
	 * 根据角色ID查询当前角色所拥有的权限
	 * @param roleid
	 * @return
	 */
	List<SysRightVo> getRightsByRole(String roleid);
	
}
