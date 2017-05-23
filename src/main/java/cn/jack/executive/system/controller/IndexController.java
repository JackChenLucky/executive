package cn.jack.executive.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.controller.BaseController;

@Controller
public class IndexController extends BaseController{
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public ModelAndView login(){
		logger.info("-------------------------这是日志测试输出-----------------------");
		ModelAndView view = new ModelAndView("login.html");
		return view;
	}
	@RequestMapping(path="/index.htm",method=RequestMethod.GET)
	public ModelAndView index(){
		logger.info("-------------------------这是日志测试输出-----------------------");
		ModelAndView view = new ModelAndView("index.html");
		
		return view;
	}
	@RequestMapping(path="/logout.htm",method=RequestMethod.GET)
	public ModelAndView logout(){
		ModelAndView view = new ModelAndView("/");
		
		return view;
	}
}
