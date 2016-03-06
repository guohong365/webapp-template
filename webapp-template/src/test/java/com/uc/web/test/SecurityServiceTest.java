package com.uc.web.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.uc.utils.TreeItem;
import com.uc.web.domain.system.RoleResource;
import com.uc.web.domain.system.UserInfo;
import com.uc.web.forms.MenuItem;
import com.uc.web.service.SecurityService;
import com.uc.web.service.impl.SecurityServiceImpl;


public class SecurityServiceTest extends TestBase {
	
	SecurityService service;
	
	@Test
	public void testSelectAdmin(){
		UserInfo userInfo = service.selectUserInfo("admin");
		assertNotNull(userInfo);
	}
	
	@Test
	public void testSelectMenu(){
	   TreeItem<MenuItem> menu=service.selectMenu("admin");
	   assertNotNull(menu);
	}
	
	@Test
	public void testSelectRoleResources(){
		List<? extends RoleResource> resources=service.selectRoleRresources();
		for(RoleResource resource : resources){
			logger.info("ROLE:" + resource.getRoleId() + " has resource:" + resource.getUriPattern());
		}
	}

	@Before
	public void onSetUp() {
		service=context.getBean(SecurityServiceImpl.class);
	}


}
