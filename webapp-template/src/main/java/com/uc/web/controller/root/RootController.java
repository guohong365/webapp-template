package com.uc.web.controller.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uc.web.controller.ControllerSupport;
import com.uc.web.domain.system.UserInfo;
import com.uc.web.forms.MenuFormattor;

@Controller
public class RootController extends ControllerSupport {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String root(Model model){
		UserInfo userInfo=getUserInfo();
		if(userInfo!=null){
			MenuFormattor formattor=new MenuFormattor();
			String menus=formattor.format(userInfo.getMenu());
			getLoggger().debug("user info:" + menus);
			model.addAttribute("menus", menus);
			model.addAttribute("userName", userInfo.getName());			
			return "/ajax";
		} 
		return "redirect:/login";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcome(Model model){
		getLoggger().info("load WELCOM PAGE");
		
		return "/welcome";
	}
	
	@RequestMapping(value="/403", method=RequestMethod.GET)
	public String page403(){
		return "/errors/403";
	}
	@RequestMapping(value="/404", method=RequestMethod.GET)
	public String page404(){
		return "/errors/404";
	}
	
	@RequestMapping(value="/500", method=RequestMethod.GET)
	public String page500(){
		return "/errors/500";
	}

}
