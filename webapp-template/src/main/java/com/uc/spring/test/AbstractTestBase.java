package com.uc.spring.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public abstract class AbstractTestBase {
	private static final String PATH_MIDDLE="/src/main/webapp/WEB-INF/spring/";
	private static final String PATH_PREFIX="file:";
	protected ApplicationContext context;
	protected Logger logger;
	
	public AbstractTestBase() {
		logger=LoggerFactory.getLogger(this.getClass());
	}
	protected void onSetUp(){};
	protected void loadConfig(){
		String [] configFiles=onGetConfigFiles();
		List<String> files=new ArrayList<>();
		for(String config: configFiles){
			files.add(PATH_PREFIX + System.getProperty("user.dir") + PATH_MIDDLE + config);
		}
		configFiles=new String[files.size()];
		context=new FileSystemXmlApplicationContext(files.toArray(configFiles));
	}
	protected abstract String[] onGetConfigFiles();
	
	@Before
	public void setUp(){
		loadConfig();
		onSetUp();
	}
	
}
