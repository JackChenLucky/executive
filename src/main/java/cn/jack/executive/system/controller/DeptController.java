package cn.jack.executive.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.controller.BaseController;

@Controller
@RequestMapping("/dept")
public class DeptController extends BaseController{

	@RequestMapping("/view.htm")
	public ModelAndView view(){
		ModelAndView view = new ModelAndView("/system/dept/dept_view.html");
		return view;
	}
}
