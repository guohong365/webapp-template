package com.uc.web.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ConfigManager implements ApplicationContextAware {

	
	private static ApplicationConfig applicationConfig;
	private static ApplicationContext applicationContext;
	
	protected ConfigManager(){		
	}
	
	private static ConfigManager instance=new ConfigManager();
	
	static ConfigManager getInstance(){
		return instance;
	}
	
	public static ApplicationConfig getApplicationConfig(){
		synchronized (ConfigManager.class) {
			if(applicationConfig==null){
				return new DefaultApplicationConfig();
			}
		}
		return applicationConfig;
	}
	
	public void setApplicationConfig(ApplicationConfig appConfig){
		applicationConfig=appConfig;
	}
	
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ConfigManager.applicationContext=applicationContext;
	}

}
