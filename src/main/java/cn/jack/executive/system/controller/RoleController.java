package cn.jack.executive.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.controller.BaseController;

/**
 * 角色管理
 * @author JackChen
 *
 */
@Controller
@RequestMapping("/role")
public class RoleController extends BaseController{

	@RequestMapping("/view.htm")
	public ModelAndView view(){
		ModelAndView view = new ModelAndView("system/role/roleview");
		return view;
	}
}
