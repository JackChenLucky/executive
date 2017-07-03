package cn.jack.executive.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.jack.executive.common.controller.BaseController;
import cn.jack.executive.core.shiro.ShiroKit;
import cn.jack.executive.system.service.SysMenuService;

@Controller
public class IndexController extends BaseController{
	
	@Autowired
	private SysMenuService sysMenuService;
	
	 /**
     * 跳转到登录页面
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        if (ShiroKit.isAuthenticated() || ShiroKit.getUser() != null) {
        	logger.info("---跳转到首页-");
            return REDIRECT + "/index";
        } else {
        	logger.info("---跳转到登录页----");
            return "/login.html";
        }
    }
    
    /**
     * 跳转到主页
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "/index.html";
    }
	
	@RequestMapping(path="/index.htm",method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView view = new ModelAndView("index.html");
		//获取菜单
		view.addObject("menuTree", sysMenuService.getAllTreeMenu());
		return view;
	}
	@RequestMapping(path="/logout",method=RequestMethod.GET)
	public ModelAndView logout(){
		ModelAndView view = new ModelAndView("/login.html");
		
		return view;
	}
}
