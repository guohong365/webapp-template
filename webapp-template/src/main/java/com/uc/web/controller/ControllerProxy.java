package com.uc.web.controller;

import com.uc.web.forms.QueryForm;

public interface ControllerProxy<QueryFormType extends QueryForm, DetailType extends Object>{	
	GeneralController<QueryFormType, DetailType> getControler();
	String getBaseUrl();
}
