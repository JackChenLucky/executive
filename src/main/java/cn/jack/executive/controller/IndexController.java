package cn.jack.executive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.model.bean.User;

/**
 * Created by Administrator on 2017/5/8.
 */
@Controller
public class IndexController {
	@RequestMapping(path="/index",method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView view = new ModelAndView("index");
		User user = new User();
		user.setId("11");
		user.setName("系统管理员");
		view.addObject("user", user);
		return view;
	}
}
