package cn.jack.executive.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.controller.BaseController;
import cn.jack.executive.system.model.bean.User;

/**
 * Created by Administrator on 2017/5/8.
 */
@Controller
public class IndexController extends BaseController{
	@RequestMapping(path="/",method=RequestMethod.GET)
	public ModelAndView login(){
		logger.info("-------------------------这是日志测试输出-----------------------");
		ModelAndView view = new ModelAndView("login");
		return view;
	}
	@RequestMapping(path="/index",method=RequestMethod.GET)
	public ModelAndView index(){
		logger.info("-------------------------这是日志测试输出-----------------------");
		ModelAndView view = new ModelAndView("index");
		User user = new User();
		user.setId("11");
		user.setName("系统管理员");
		view.addObject("user", user);
		return view;
	}
}
