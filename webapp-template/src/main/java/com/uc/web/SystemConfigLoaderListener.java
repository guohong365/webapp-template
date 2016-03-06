package com.uc.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SystemConfigLoaderListener implements ServletContextListener {
	public static final String WEB_APP_CONFIG_NAME="webappConfigLocation";
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("-----------------------------");
		ServletContext context = sce.getServletContext();
		String path= context.getInitParameter(WEB_APP_CONFIG_NAME);
		String realPath=context.getRealPath(path);
		SystemConfig.load(realPath);
		System.out.println("----system config loaded----");		
		System.out.println("-----------------------------");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

}
