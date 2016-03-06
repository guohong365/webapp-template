package com.uc.web.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import com.uc.web.domain.system.UserDetail;
import com.uc.web.forms.WebListFormBase;
import com.uc.web.forms.system.UserQueryForm;
import com.uc.web.service.UserService;
import com.uc.web.service.impl.UserServiceImpl;

public class UserServiceTest extends TestBase {
	
	UserService userService;
	
	@Before
	public void setUp(){
		userService=context.getBean(UserServiceImpl.class);
	}

	@Test
	public void testSelect() {
		WebListFormBase<UserQueryForm, UserDetail> webForm=new WebListFormBase<UserQueryForm, UserDetail>();
		UserQueryForm query=new UserQueryForm();
		query.setQueryUserId("admin");
		webForm.setQuery(query);
		webForm.getPageCtrl().setPageSize(10);
		userService.select(webForm);
		assertEquals(webForm.getData().size(), 1);
	}

	@Test
	public void testSelectForExport() {
		UserQueryForm queryForm =new UserQueryForm();
		queryForm.setQueryUserId("admin");
		logger.info(queryForm.toString());		
		List<UserDetail> list = userService.selectForExport(queryForm);
		logger.info("select list" + list);
	}

	@Test
	public void testSelectById() {
		UserDetail detail=userService.selectById("admin");
		logger.info(detail.toString());
		assertNotNull(detail);		
	}

	@Test
	@Rollback(true)
	public void testInsert() {
		UserDetail detail=userService.selectById("wh1");
		detail.setId("wh2");
		detail.setCancelator(null);
		detail.setCancelTime(null);
		detail.setDescription("wh2 test");
		userService.insert(detail);
		detail.setId(null);		
		detail=userService.selectById("wh2");
		assertTrue(detail.getId().equals("wh2"));
	}

	@Test
	@Rollback(true)
	public void testUpdate() {
		UserDetail detail=userService.selectById("wh1");
		assertNotNull(detail);
		detail.setRoles(null);
		detail.setTele("1234567890");
		userService.update(detail);
		UserDetail detail2=userService.selectById("wh1");
		assertEquals(detail.getTele(), detail2.getTele());
		assertEquals(detail2.getRoles().size(), 0);
	}

	@Test
	@Rollback(true)
	public void testCancelateById() {
		UserDetail detail=new UserDetail();
		detail.setId("wh1");
		detail.setCancelator("admin");
		detail.setCancelTime(new Date());
		userService.cancelateById(detail);
		UserDetail detail2=userService.selectById("wh1");
		assertFalse(detail2.isValid());
	}

	@Test
	@Rollback(true)
	public void testActiveById() {
		UserDetail detail=userService.selectById("wh1");
		detail.setCancelator(null);
		detail.setCancelTime(null);
		userService.activeById(detail);
	}

}
