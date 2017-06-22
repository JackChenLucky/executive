package cn.jack.executive.system.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.constants.DwzConstants;
import cn.jack.executive.common.controller.BaseController;
import cn.jack.executive.common.model.DwzResult;
import cn.jack.executive.system.model.SysDept;
import cn.jack.executive.system.model.SysRole;
import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.model.vo.RoleSearchVo;
import cn.jack.executive.system.model.vo.SysDeptVo;
import cn.jack.executive.system.model.vo.SysRoleVo;
import cn.jack.executive.system.service.SysRoleService;
import cn.jack.executive.system.service.SysUserRoleService;

/**
 * 角色管理
 * @author JackChen
 *
 */
@Controller
@RequestMapping("/role")
public class RoleController extends BaseController{

	@Autowired
	private SysRoleService sysRoleService;
	
	@Autowired
	private SysUserRoleService sysUserRoleService;
	
	@RequestMapping("/view.htm")
	public ModelAndView view(RoleSearchVo roleSearchVo){
		ModelAndView view = new ModelAndView("system/role/role_view.html");
		PageQuery<SysRoleVo> query = sysRoleService.findRoleByPage(roleSearchVo);
		view.addObject("totPage",query.getTotalPage());
		view.addObject("totRow",query.getTotalRow());
		view.addObject("pageNumber",query.getPageNumber());
		view.addObject("roleList", query.getList());
		view.addObject("SearchCondition", roleSearchVo);
		return view;
	}
	
	@RequestMapping("/edit.htm")
	public ModelAndView edit(String id){
		ModelAndView view = new ModelAndView("system/role/role_edit.html");
		if(StringUtils.isNotBlank(id)){
			SysRole role = sysRoleService.findRoleById(id);
			view.addObject("role", role);
		}
		return view;
	}
	
	@RequestMapping("/userlist.htm")
	public ModelAndView userList(String id){
		ModelAndView view = new ModelAndView("system/role/role_user.html");
		if(StringUtils.isNotBlank(id)){
			List<SysUser> users = sysUserRoleService.findUserByRole(id);
			view.addObject("users", users);
		}
		return view;
	}
	
	
	@RequestMapping("/save")
	public @ResponseBody DwzResult save(SysRole sysRole){
		sysRoleService.saveRole(sysRole);
		DwzResult result = new DwzResult();
		result.setStatusCode(DwzConstants.DWZ_STATUS_OK);
		result.setCallbackType(DwzConstants.DWZ_CALLBACKTYPE_CLOSECURRENT);
		return result;
	}
}
