package cn.jack.executive.system.controller;

import org.apache.commons.lang3.StringUtils;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.constants.DwzConstants;
import cn.jack.executive.common.controller.BaseController;
import cn.jack.executive.common.model.DwzResult;
import cn.jack.executive.system.model.DeptTree;
import cn.jack.executive.system.model.MenuTree;
import cn.jack.executive.system.model.SysDept;
import cn.jack.executive.system.model.SysMenu;
import cn.jack.executive.system.model.vo.MenuSearchVo;
import cn.jack.executive.system.model.vo.SysDeptVo;
import cn.jack.executive.system.model.vo.SysMenuVo;
import cn.jack.executive.system.service.SysMenuService;

@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController{
	
	@Autowired
	private SysMenuService sysMenuService;
	
	@RequestMapping("/view.htm")
	public ModelAndView view(MenuSearchVo menuSearchVo){
		ModelAndView view = new ModelAndView("system/menu/menu_view.html");
		PageQuery<SysMenu> query = sysMenuService.findMenuByPage(menuSearchVo);
		view.addObject("totPage",query.getTotalPage());
		view.addObject("totRow",query.getTotalRow());
		view.addObject("pageNumber",query.getPageNumber());
		view.addObject("menuList", query.getList());
		view.addObject("SearchCondition",menuSearchVo);
		MenuTree menu = sysMenuService.getAllTreeMenu();
		view.addObject("menuHtml", "<ul class=\"tree treeFolder expand\">"+getMenuHtml(menu)+"</ul>");
		return view;
	}
	
	private String getMenuHtml(MenuTree menuTree){
		StringBuffer sb = new StringBuffer();
		if(menuTree.getSubMenus().size()>0){
			sb.append("<li><a href=\"javascript:\" onclick=\"$.bringBack({id:'").append(menuTree.getId()).append("', menuName:'").append(menuTree.getName()).append("'})\">").append(menuTree.getName()).append("</a>");
			sb.append("<ul>");
			for(MenuTree menu:menuTree.getSubMenus()){
				sb.append(getMenuHtml(menu));
			}
			sb.append("</ul></li>");
		}else{
			sb.append("<li><a href=\"javascript:\" onclick=\"$.bringBack({id:'").append(menuTree.getId()).append("', menuName:'").append(menuTree.getName()).append("'})\">").append(menuTree.getName()).append("</a></li>");
		}
		return sb.toString();
	}
	
	@RequestMapping("/edit.htm")
	public ModelAndView edit(String id){
		ModelAndView view = new ModelAndView("system/menu/menu_edit.html");
		if(StringUtils.isNotBlank(id)){
			SysMenu menu = sysMenuService.findMenuById(id);
			view.addObject("menu", menu);
			if(menu.getPid()!=0){
				SysMenu pMenu = sysMenuService.findMenuById(menu.getPid()+"");
				if(pMenu!=null){
					view.addObject("pmenuname",pMenu.getName());
				}
			}else{
				view.addObject("pmenuname","系统菜单");
			}
		}
		return view;
	}
	
	@RequestMapping("/lookup.htm")
	public ModelAndView lookup(@RequestParam String id){
		ModelAndView view = new ModelAndView("system/menu/menu_lookup.html");
		MenuTree menu = sysMenuService.getAllTreeMenu();
		view.addObject("menuHtml", "<ul class=\"tree treeFolder expand\">"+getMenuHtml(menu)+"</ul>");
		return view;
	}
	
	@RequestMapping("/save")
	public @ResponseBody DwzResult save(SysMenuVo sysMenuVo){
		SysMenu sysMenu = new SysMenu();
		BeanUtils.copyProperties(sysMenuVo, sysMenu);
		sysMenuService.saveDept(sysMenu);
		DwzResult result = new DwzResult();
		result.setStatusCode(DwzConstants.DWZ_STATUS_OK);
		result.setCallbackType(DwzConstants.DWZ_CALLBACKTYPE_CLOSECURRENT);
		return result;
	}
}
