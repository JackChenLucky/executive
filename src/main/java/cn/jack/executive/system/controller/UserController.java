package cn.jack.executive.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.controller.BaseController;
import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.model.vo.UserSearchVo;
import cn.jack.executive.system.service.SysUserService;

/**
 * 用户管理
 * @author JackChen
 *
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
    
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/view.htm")
	public ModelAndView view(UserSearchVo userSearchVo){
		ModelAndView view = new ModelAndView("system/user/user_view.html");
		List<SysUser> userList = sysUserService.findUserBy(userSearchVo);
		view.addObject("userList", userList);
		return view;
	}
}
