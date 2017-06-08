package cn.jack.executive.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.controller.BaseController;
import cn.jack.executive.system.model.vo.RoleSearchVo;

/**
 * 角色管理
 * @author JackChen
 *
 */
@Controller
@RequestMapping("/role")
public class RoleController extends BaseController{

	@RequestMapping("/view.htm")
	public ModelAndView view(RoleSearchVo roleSearchVo){
		ModelAndView view = new ModelAndView("system/role/role_view.html");
		
		view.addObject("SearchCondition", roleSearchVo);
		return view;
	}
}
