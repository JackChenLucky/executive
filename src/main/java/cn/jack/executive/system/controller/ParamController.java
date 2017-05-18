package cn.jack.executive.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.controller.BaseController;

/**
 * 系统参数管理
 * @author JackChen
 *
 */
@Controller
@RequestMapping("/param")
public class ParamController extends BaseController{
	
	@RequestMapping("/view.htm")
	public ModelAndView view(){
		ModelAndView view = new ModelAndView("system/param/paramview");
		return view;
	}
}
