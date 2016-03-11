package com.uc.web.config;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class ApplicationConfigLoaderListener implements ServletContextListener {
	public static final String WEB_APP_CONFIG_NAME="webappConfigLocation";
	public static final String WEB_APP_CONFIG_CLASS="webappConfigClass";
	public static final String DEFAULT_CONFIG_FILE_NAME="classpath:app.properties";
	
	private Logger logger=LoggerFactory.getLogger(getClass());
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.debug("loading application configuration.........");
		ServletContext context = sce.getServletContext();
		String className=context.getInitParameter(WEB_APP_CONFIG_CLASS);		
		ApplicationConfig config=null;
		if(StringUtils.isEmpty(className)){
			logger.warn("no configure class set, use default.....");
			config=new DefaultApplicationConfig();
		} else {
			logger.info("configure class was set as [" + className +"], try to create instance....");
		try {
			Class<?> configClass=Class.forName(className);
			Object instance= configClass.newInstance();
			if(instance instanceof ApplicationConfig){
				config=(ApplicationConfig)instance;
				logger.info("configure class instance created....");
			} else {
				logger.warn("configure class is not ApplicationConfig implimented class, use default ....");
				config=new DefaultApplicationConfig();
			}
		}catch(Exception e){
			logger.error("load configure class error. use default....", e);
			config=new DefaultApplicationConfig();
		}		
		}
		String path= context.getInitParameter(WEB_APP_CONFIG_NAME);
		logger.info("configure file was set as [" + path + "], try to load it....");
		String realPath=context.getRealPath(path);
		File file=new File(realPath);
		boolean loaded=false;		
		if(file.exists()){
			if(file.isDirectory()){
				logger.error("configured file name is a directory. \n no configure file loaded....");
				return;
			}
			if(!file.canRead()){
				logger.error("configured file is unreadable. \n no confiure file loaded....");
				return;
			}
			loaded=config.load(realPath);			
		} else {
			System.out.println("no configure file name be set. load default....");
			loaded=config.load(DEFAULT_CONFIG_FILE_NAME);
		}
		if(loaded){
			logger.info("---- application config loaded----");
		} else {
			logger.error("----- applicatoin config loaded failed ------");
		}
		ConfigManager.getInstance().setApplicationConfig(config);
		logger.debug("-----------------------------");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

}
