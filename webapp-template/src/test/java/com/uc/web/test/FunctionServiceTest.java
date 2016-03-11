package com.uc.web.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.uc.web.domain.system.FunctionDetail;
import com.uc.web.forms.WebListFormBase;
import com.uc.web.forms.system.FunctionQueryForm;
import com.uc.web.service.FunctionService;
import com.uc.web.service.impl.FunctionServiceImpl;

public class FunctionServiceTest extends TestBase{
	
	FunctionService functionService;

	@Before
	public void setUp() throws Exception {
		functionService= context.getBean(FunctionServiceImpl.class);
	}

	@Test
	public void testSelect() {
		WebListFormBase<FunctionQueryForm, FunctionDetail> webForm=new WebListFormBase<>();
		webForm.setQuery(new FunctionQueryForm());
		functionService.select(webForm);;
	}

	@Test
	public void testSelectForExport() {
		List<? extends FunctionDetail> list=functionService.selectForExport(new FunctionQueryForm());
		for(FunctionDetail func : list){
			System.out.println(func.toString());
		}
	}

	@Test
	public void testSelectById() {
		FunctionDetail detail=functionService.selectById("001");
		assertNotNull(detail);
		assertTrue(detail.getId().equals("001"));
	}

	@Test
	public void testInsert() {
		FunctionDetail detail=new FunctionDetail();
		detail.setId("999");
		detail.setName("测试");
		detail.setUri("/test");
		detail.setUriPattern("/test/**");
		detail.setValid(true);
		functionService.insert(detail);
		detail=null;
		detail=functionService.selectById("999");
		assertNotNull(detail);
		assertTrue(detail.getId().equals("999"));
	}

	@Test
	public void testUpdate() {
		FunctionDetail detail=new FunctionDetail();
		detail = functionService.selectById("002");
		detail.setDescription("改描述了");
		functionService.update(detail);
		detail=null;
		detail=functionService.selectById("002");
		assertNotNull(detail);
		System.out.println(detail.toString());
		assertTrue(detail.getDescription().equals("改描述了"));
	}

	@Test
	public void testCancelateById() {
		FunctionDetail detail=new FunctionDetail();
		detail.setId("002");
		functionService.cancelateById(detail);
		detail=null;
		detail=functionService.selectById("002");
		assertNotNull(detail);
		System.out.println(detail.toString());
		assertTrue(detail.isValid()==false);
	}

	@Test
	public void testDeleteById() {
		FunctionDetail detail=new FunctionDetail();
		detail.setId("002");
		functionService.deleteById(detail);
		detail=functionService.selectById("002");
		assertTrue(detail==null);
	}

	@Test
	public void testActiveById() {
		FunctionDetail detail=new FunctionDetail();
		detail.setId("004");
		functionService.activeById(detail);
		detail=null;
		detail=functionService.selectById("004");
		assertNotNull(detail);
		System.out.println(detail.toString());
		assertTrue(detail.isValid());
		
	}

}
