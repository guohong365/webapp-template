package com.uc.web.controller.root;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uc.web.controller.ControllerSupport;
import com.uc.web.domain.system.UserDetail;
import com.uc.web.domain.system.UserInfo;
import com.uc.web.service.UserService;

@Controller
public class UserCenter extends ControllerSupport {	
	private static final String PARAM_NAME_PASSWORD = "password";
	private static final String PARAM_NAME_NEW_PASSWORD="newPassword";
	
	@Resource(name="userService")
	UserService userService;

	@RequestMapping(value="/changePwd", method=RequestMethod.POST, produces="text/html;charset=UTF-8")	
	public @ResponseBody String doChangePwd(
			@RequestParam(value=PARAM_NAME_PASSWORD, required=true) String oldPwd,
			@RequestParam(value=PARAM_NAME_NEW_PASSWORD, required=true) String newPwd){
		UserInfo userInfo=getUserInfo();
		UserDetail user=userService.selectById(userInfo.getUsername());
		if(user!=null && user.getPassword().equals(oldPwd)){
			user=new UserDetail();
			user.setId(userInfo.getUsername());
			user.setPassword(newPwd);
			userService.update(user);
			getLoggger().info("update pwd as:" + newPwd);
			return "OK";
		} else{
			return "旧密码有误，修改失败！";
		}
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){
		return "/login";
	}
}
