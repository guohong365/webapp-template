package com.uc.web;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContextHelper implements ApplicationContextAware {

	private static ApplicationContext appContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		appContext=applicationContext;
	}
	
	public static ApplicationContext getApplicationContext() {
		return appContext;		
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String beanName) throws BeansException {
		return (T) appContext.getBean(beanName);
	}

}
