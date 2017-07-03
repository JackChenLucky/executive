package cn.jack.executive.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jack.executive.system.dao.SysRoleRightDao;
import cn.jack.executive.system.model.SysRoleRight;
import cn.jack.executive.system.model.vo.SysRightVo;
import cn.jack.executive.system.service.SysFuncService;
import cn.jack.executive.system.service.SysMenuService;
import cn.jack.executive.system.service.SysRoleRightService;

@Service
public class SysRoleRightServiceImpl implements SysRoleRightService {

	@Autowired
	SysRoleRightDao sysRoleRightDao;
	
	@Autowired
	SysMenuService sysMenuService;
	
	@Autowired
	SysFuncService sysFuncService;
	/**
	 * 根据角色获取当前角色的权限
	 */
	@Override
	public List<SysRightVo> getRightsByRole(String roleid) {
		List<SysRightVo>  rights = new ArrayList<SysRightVo>();
		List<SysRoleRight>  roleRights = sysRoleRightDao.findRightByRoleId(roleid);
		for(SysRoleRight roleright:roleRights){
			SysRightVo right = new SysRightVo();
			right.setMenus(sysMenuService.findMenuById(roleright.getMenuid()+""));
			right.setFuncs(sysFuncService.findFuncById(roleright.getFuncid()+""));
			rights.add(right);
		}
		return rights;
	}

}
