package com.uc.web.controller.system.proxy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uc.web.controller.ControllerProxyBase;
import com.uc.web.domain.system.FunctionDetail;
import com.uc.web.forms.system.FunctionQueryForm;

@Controller
@RequestMapping("/system/func")
public class FunctionControllerProxy extends ControllerProxyBase<FunctionQueryForm, FunctionDetail> {
	private static final String DEFAULT_CONTROLLER_BEAN_NAME="functionControllerImpl";
	private static final String DEFAULT_CONTROLLER_BASE_URL="/system/func";

	@Override
	protected String getDefaultControllerBeanName() {
		return DEFAULT_CONTROLLER_BEAN_NAME;
	}

	@Override
	protected String getDefaultBaseUrl() {
		return DEFAULT_CONTROLLER_BASE_URL;
	}

}
