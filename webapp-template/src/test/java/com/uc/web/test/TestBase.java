package com.uc.web.test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/root-beans.xml"
})
@Transactional(value="transactionManager")
public abstract class TestBase {
	@Autowired
	protected ApplicationContext context;
	protected Logger logger;
	
	public TestBase() {
		logger=LoggerFactory.getLogger(this.getClass());		
	}
}
