package com.uc.web.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.uc.utils.LoggerSupportorImpl;
import com.uc.web.domain.system.UserInfo;
import com.uc.web.service.SecurityService;

public class MyUserDetailsService extends LoggerSupportorImpl implements UserDetailsService {

	private SecurityService securityService;
	
	public void setSecurityService(SecurityService securityService) {
		this.securityService = securityService;
	}

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		UserInfo userInfo=securityService.selectUserInfo(userId);
		if(userInfo!=null){
			getLoggger().debug("current login user:" + userInfo.toString());
			return userInfo;
		}
		throw new UsernameNotFoundException("user:" + userId);
	}
	
	

}
