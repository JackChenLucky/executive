package cn.jack.executive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.model.vo.DictItemSearchVo;
import cn.jack.executive.service.SysDictTypeService;

@Controller
public class SystemController {
	
	@Autowired
	private SysDictTypeService sysDictTypeService;
	
	@RequestMapping("/users.htm")
	public ModelAndView users(){
		ModelAndView view = new ModelAndView("system/users");
		
		return view;
	}
	
	@RequestMapping("/menus.htm")
	public ModelAndView menus(){
		ModelAndView view = new ModelAndView("system/menus");
		
		return view;
	}
	
	@RequestMapping("/sysdicts.htm")
	public ModelAndView sysDicts(){
		ModelAndView view = new ModelAndView("system/sysdicts");
		view.addObject("dicttypelist", sysDictTypeService.allSysDictType());
		return view;
	}
	
	@RequestMapping("/dictitems.htm")
	public ModelAndView sysDictItems(DictItemSearchVo dictItemSearchVo){
		ModelAndView view = new ModelAndView("system/dictitems");
		System.out.println(dictItemSearchVo.getSearchCondition());
		System.out.println("@@@");
		return view;
	}
	
	@RequestMapping("/sysparams.htm")
	public ModelAndView sysParams(){
		ModelAndView view = new ModelAndView("system/sysparams");
		
		return view;
	}
}
