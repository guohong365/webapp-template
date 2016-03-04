package com.uc.web.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import com.uc.web.forms.security.RoleResource;
import com.uc.web.service.SecurityService;

public class SecurityMetadataSourceFactoryBean extends LinkedHashMap<RequestMatcher, Collection<ConfigAttribute>>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7114425880761707681L;
	
	private static final Logger logger=LoggerFactory.getLogger(SecurityMetadataSourceFactoryBean.class);

	private SecurityService securityService;
	
	public SecurityService getSecurityService() {
		return securityService;
	}

	public void setSecurityService(SecurityService securityService) {
		this.securityService = securityService;
	}

	@PostConstruct
	public void loadResourceDefine(){
		List<RoleResource> list = securityService.selectRoleRresources();
		RequestMatcher matcher=null;
		String pattern=null;
		Collection<ConfigAttribute> configAttributes=null;
		for (RoleResource resource : list) {
			if(!resource.getUriPattern().equals(pattern)){ //新的pattern				
				if(configAttributes!=null && !configAttributes.isEmpty()){					
					this.put(matcher, configAttributes); //保存之前的configAttributes
				}
				//新建 matcher和 configAttributes
				pattern=resource.getUriPattern();
				matcher=new AntPathRequestMatcher(pattern);
				configAttributes = new HashSet<ConfigAttribute>();
			}
			ConfigAttribute configAttribute = new SecurityConfig("ROLE_" + resource.getRoleId());
			logger.debug("add role to list ["+pattern+"]:" + "ROLE_" + resource.getRoleId());
			configAttributes.add(configAttribute);
		}
		if(matcher!=null && configAttributes!=null && !configAttributes.isEmpty()){
			put(matcher, configAttributes);
		}
	}
}
