package cn.jack.executive.system.controller;

import java.sql.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import cn.jack.executive.common.constants.DwzConstants;
import cn.jack.executive.common.controller.BaseController;
import cn.jack.executive.common.model.AjaxResult;
import cn.jack.executive.common.model.DwzResult;
import cn.jack.executive.system.model.SysUser;
import cn.jack.executive.system.model.vo.SysUserVo;
import cn.jack.executive.system.model.vo.UserSearchVo;
import cn.jack.executive.system.service.SysUserService;

/**
 * 用户管理
 * @author JackChen
 *
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
    
	@Autowired
	private SysUserService sysUserService;
	
	/**
	 * 用户列表页，附带用户查询条件
	 * @param userSearchVo
	 * @return
	 */
	@RequestMapping("/view.htm")
	public ModelAndView view(UserSearchVo userSearchVo){
		ModelAndView view = new ModelAndView("system/user/user_view.html");
		List<SysUser> userList = sysUserService.findUserBy(userSearchVo);
		view.addObject("userList", userList);
		view.addObject("SearchCondition",userSearchVo);
		return view;
	}
	
	@RequestMapping("/edit.htm")
	public ModelAndView edit(String id){
		ModelAndView view = new ModelAndView("system/user/user_edit.html");
		if(StringUtils.isNotBlank(id)){
			SysUser user = sysUserService.findUserById(id);
			view.addObject("user", user);
		}
		return view;
	}
	
	
	@RequestMapping("/save")
	public @ResponseBody DwzResult save(SysUserVo puser){
		if(StringUtils.isNotBlank(puser.getBirthday_str())){
			puser.setBirthday(Date.valueOf(puser.getBirthday_str()));
		}
		
		if(StringUtils.isNotBlank(puser.getExpiredate_str())){
			puser.setExpiredate(Date.valueOf(puser.getExpiredate_str()));
		}
		SysUser sysuser = new SysUser();
		BeanUtils.copyProperties(puser, sysuser);
		sysUserService.saveUser(sysuser);
		DwzResult result = new DwzResult();
		result.setStatusCode(DwzConstants.DWZ_STATUS_OK);
		result.setCallbackType(DwzConstants.DWZ_CALLBACKTYPE_CLOSECURRENT);
		return result;
	}
	/**
	 * 删除指定的用户，（不做物理删除，直接作废）
	 * @param uid
	 * @return
	 */
	@RequestMapping("/delete/{uid}")
	public @ResponseBody AjaxResult delete(@PathVariable String uid){
		AjaxResult result = new AjaxResult();
		sysUserService.deleteByKey(uid);
		return result;
	}
}
