package com.uc.web.controller.system.proxy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uc.web.controller.ControllerProxyBase;
import com.uc.web.domain.system.UserDetail;
import com.uc.web.forms.system.UserQueryForm;

@Controller
@RequestMapping("/system/user")
public class UserControllerProxy extends ControllerProxyBase<UserQueryForm, UserDetail> {
    private String DEFAULT_BASE_URL="/system/user";
    private String DEFAULT_CONTROLLER_BEAN_NAME="userControllerImpl";

    //TODO: use a initializer bean class to load all beanName mapping
    
	@Override
	protected String getDefaultBaseUrl() {
		return DEFAULT_BASE_URL;
	}

	@Override
	protected String getDefaultControllerBeanName() {
		return DEFAULT_CONTROLLER_BEAN_NAME;
	}
}
