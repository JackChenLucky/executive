package cn.jack.executive.instructions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.controller.BaseController;

@Controller
@RequestMapping("/appriaisal")
public class AppriaisalController extends BaseController {
	
	@RequestMapping("/view.htm")
	public ModelAndView view(){
		ModelAndView view = new ModelAndView("/instructions/appraisal/appriaisal_view.html");
		
		return view;
	}
}
