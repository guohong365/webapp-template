package com.uc.web.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.uc.web.domain.system.UserInfo;
import com.uc.web.service.SecurityService;

public class MyUserDetailsService implements UserDetailsService {

	private SecurityService securityService;
	
	public void setSecurityService(SecurityService securityService) {
		this.securityService = securityService;
	}

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		UserInfo userInfo=securityService.selectUserInfo(userId);
		if(userInfo!=null){
			return userInfo;
		}
		throw new UsernameNotFoundException("user:" + userId);
	}
	
	

}
