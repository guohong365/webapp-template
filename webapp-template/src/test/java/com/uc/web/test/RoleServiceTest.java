package com.uc.web.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.uc.web.domain.system.RoleDetail;
import com.uc.web.service.RoleService;
import com.uc.web.service.impl.RoleServiceImpl;

public class RoleServiceTest  extends TestBase{
	
	RoleService service;
	RoleDetail detail;
	@Before
	public void setUp() throws Exception {
		service=context.getBean(RoleServiceImpl.class);
	}

	@Test
	public void testSelectByIdString() {
		detail=service.selectById("ADMIN");
		assertNotNull(detail);		
		System.out.println(detail);
	}

	@Test
	public void testInsertRoleDetail() {
		detail=new RoleDetail();
		detail.setId("TEST");
		detail.setName("testRole");
		detail.setDescription("test role");
		detail.setValid(true);
		detail.setIsInternal(false);
		service.insert(detail);
		detail=null;
		detail=service.selectById("TEST");
		assertNotNull(detail);
		assertTrue(detail.getId().equals("TEST"));
		System.out.println(detail);
	}

	@Test
	public void testUpdateRoleDetail() {
		detail=service.selectById("ADMIN");
		detail.setDescription("admin");
		service.update(detail);
		detail=null;
		detail=service.selectById("ADMIN");
		assertNotNull(detail);
		assertTrue(detail.getDescription().equals("admin"));
	}

	@Test
	public void testCancelateByIdRoleDetail() {
		detail=new RoleDetail();
		detail.setId("ADMIN");
		service.cancelateById(detail);
		detail=null;
		detail=service.selectById("ADMIN");
		assertTrue(detail.isValid()==false);
	}

	@Test
	public void testActiveByIdRoleDetail() {
		detail=new RoleDetail();
		detail.setId("ADMIN");
		service.activeById(detail);
		detail=null;
		detail=service.selectById("ADMIN");
		assertNotNull(detail);
		assertTrue(detail.isValid());
	}

}
