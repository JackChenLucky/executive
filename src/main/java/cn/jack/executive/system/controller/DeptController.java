package cn.jack.executive.system.controller;

import java.sql.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.constants.DwzConstants;
import cn.jack.executive.common.controller.BaseController;
import cn.jack.executive.common.model.DwzResult;
import cn.jack.executive.system.model.SysDept;
import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.model.vo.DeptSearchVo;
import cn.jack.executive.system.model.vo.SysDeptVo;
import cn.jack.executive.system.model.vo.SysUserVo;
import cn.jack.executive.system.service.SysDeptService;

/**
 * 组织机构(部门)管理
 * @author JackChen
 *
 */
@Controller
@RequestMapping("/dept")
public class DeptController extends BaseController {

	@Autowired
	private SysDeptService sysDeptService;
	
	@RequestMapping("/view.htm")
	public ModelAndView view(DeptSearchVo deptSearchVo){
		ModelAndView view = new ModelAndView("system/dept/dept_view.html");
		PageQuery<SysDept> query = sysDeptService.findDeptByPage(deptSearchVo);
		view.addObject("totPage",query.getTotalPage());
		view.addObject("totRow",query.getTotalRow());
		view.addObject("pageNumber",query.getPageNumber());
		view.addObject("deptList", query.getList());
		view.addObject("SearchCondition",deptSearchVo);
		return view;
	}
	
	@RequestMapping("/edit.htm")
	public ModelAndView edit(String id){
		ModelAndView view = new ModelAndView("system/dept/dept_edit.html");
		if(StringUtils.isNotBlank(id)){
			SysDept dept = sysDeptService.findDeptById(id);
			view.addObject("dept", dept);
		}
		return view;
	}
	
	@RequestMapping("/lookup.htm")
	public ModelAndView edit(){
		ModelAndView view = new ModelAndView("system/dept/dept_lookup.html");
		List<SysDept> dept = sysDeptService.getAllTreeDept();
		view.addObject("dept", dept);
		return view;
	}
	
	@RequestMapping("/save")
	public @ResponseBody DwzResult save(SysDeptVo sysDeptVo){
		SysDept sysdept = new SysDept();
		BeanUtils.copyProperties(sysDeptVo, sysdept);
		sysDeptService.saveDept(sysdept);
		DwzResult result = new DwzResult();
		result.setStatusCode(DwzConstants.DWZ_STATUS_OK);
		result.setCallbackType(DwzConstants.DWZ_CALLBACKTYPE_CLOSECURRENT);
		return result;
	}
	
}
