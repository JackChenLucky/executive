package cn.jack.executive.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.controller.BaseController;
import cn.jack.executive.system.model.vo.DictItemSearchVo;
import cn.jack.executive.system.service.SysDicttypeService;

/**
 * 系统字典控制层
 * @author JackChen
 *
 */
@Controller
@RequestMapping("/dict")
public class DictController extends BaseController{
	
	@Autowired
	private SysDicttypeService sysDicttypeService;
	
	@RequestMapping("/view.htm")
	public ModelAndView view(){
		ModelAndView view = new ModelAndView("system/dict/dict_view.html");
		view.addObject("dicttypelist", sysDicttypeService.allSysDictType());
		return view;
	}
	
	@RequestMapping("/dictitems.htm")
	public ModelAndView dictItemsList(DictItemSearchVo dictItemSearchVo){
		ModelAndView view = new ModelAndView("system/dict/dictitems.html");
		System.out.println(dictItemSearchVo.getSearchCondition());
		return view;
	}
}
