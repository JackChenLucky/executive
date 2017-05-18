package cn.jack.executive.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 权限管理
 * @author JackChen
 *
 */
@Controller
@RequestMapping("right")
public class RightController {

	@RequestMapping("/view.html")
	public ModelAndView view(){
		ModelAndView view = new ModelAndView("system/right/rightview");
		return view;
	}
}
