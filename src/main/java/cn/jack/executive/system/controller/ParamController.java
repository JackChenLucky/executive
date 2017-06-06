package cn.jack.executive.system.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.beetl.sql.core.db.KeyHolder;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.constants.DwzConstants;
import cn.jack.executive.common.controller.BaseController;
import cn.jack.executive.common.model.DwzResult;
import cn.jack.executive.system.model.SysDept;
import cn.jack.executive.system.model.SysParam;
import cn.jack.executive.system.model.vo.ParamSearchVo;
import cn.jack.executive.system.model.vo.SysDeptVo;
import cn.jack.executive.system.service.SysParamService;

/**
 * 系统参数管理
 * @author JackChen
 *
 */
@Controller
@RequestMapping("/param")
public class ParamController extends BaseController{
	
	@Autowired
	private SysParamService sysParamService;
	
	/**
	 * 
	 * @param paramSearchVo
	 * @return
	 */
	@RequestMapping("/view.htm")
	public ModelAndView paramList(ParamSearchVo paramSearchVo){
		ModelAndView view = new ModelAndView("system/param/param_view.html");
		view.addObject("paramlist", sysParamService.selectSysParams(paramSearchVo));
		return view;
	}
	
	/**
	 * 新增或编辑保存
	 * @param param
	 * @throws IOException
	 */
	@RequestMapping("/save")
	public @ResponseBody DwzResult save(SysParam param){
		sysParamService.addParam(param);
		DwzResult result = new DwzResult();
		result.setStatusCode(DwzConstants.DWZ_STATUS_OK);
		result.setCallbackType(DwzConstants.DWZ_CALLBACKTYPE_CLOSECURRENT);
		return result;
	}
	
	/**
	 * 新增或编辑页面
	 * @param param
	 * @return
	 */
	@RequestMapping("/edit.htm")
	public ModelAndView edit(String id){
		ModelAndView view = new ModelAndView("system/param/param_edit.html");
		view.addObject("parm", sysParamService.findSysParamById(id));
		return view;
	}
	
	@RequestMapping("/updparam.htm")
	public ModelAndView updParamById(SysParam param){
		
		int i = sysParamService.updParamById(param);
		ModelAndView view = new ModelAndView("system/param/ajaxDoneUpdPage.html");
		view.addObject("paramlist", sysParamService.selectSysParams(null));
		return view;
	}
	
	/**
	 * 删除
	 * @param uid
	 * @return
	 */
	@RequestMapping("/delparam.htm")
	public ModelAndView delparam(String id){
		ModelAndView view = new ModelAndView("system/param/ajaxDoneUpdPage2.html");
		sysParamService.delParamById(id);
		return view;
	}
}
