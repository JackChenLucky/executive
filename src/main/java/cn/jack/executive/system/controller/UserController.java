package cn.jack.executive.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.controller.BaseController;

/**
 * 用户管理
 * @author JackChen
 *
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
    
	@RequestMapping("/view.htm")
	public ModelAndView view(){
		ModelAndView view = new ModelAndView("system/user/userview");
		
		return view;
	}
}
