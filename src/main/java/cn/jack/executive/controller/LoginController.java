package cn.jack.executive.controller;

import cn.jack.executive.model.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/8.
 */
@Controller
public class LoginController {

    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String loginIndex(Model model){
        ModelAndView view = new ModelAndView("login");
        Map user = new HashMap();
        user.put("id", 1);
        user.put("name", "曹操");
        user.put("description", "一代枭雄");
        model.addAttribute("user",user);
        return "login";
    }
    
    @RequestMapping("/logout")
    public String logout(){
    	return "redirect:/";
    }
}
