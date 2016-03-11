package com.uc.web.controller;

import com.uc.web.forms.QueryForm;

public interface ControllerProxy<QueryFormType extends QueryForm, DetailType extends Object>{	
	AppController<QueryFormType, DetailType> getController();
	String getBaseUrl();
	void setBaseUrl(String baseUrl);
	String getControllerBeanName();
	void setControllerBeanName(String beanName);
	
}
