package com.uc.web.controller;

import org.springframework.security.core.context.SecurityContextHolder;

import com.uc.utils.LoggerSupportorImpl;
import com.uc.web.domain.system.UserInfo;
import com.uc.web.service.SystemService;

public class ControllerSupport extends LoggerSupportorImpl {
	
	public UserInfo getUserInfo(){
		Object principal=SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(principal instanceof UserInfo){
			return (UserInfo) principal;
		}
		return null;
	}
	private SystemService systemService;
	public void setSystemService(SystemService systemService) {
		this.systemService = systemService;
	}
	protected SystemService getSystemService() {
		return systemService;
	}
}
