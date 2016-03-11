package com.uc.web.controller.system.proxy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uc.web.controller.ControllerProxyBase;
import com.uc.web.domain.system.OrgnizationDetail;
import com.uc.web.forms.system.OrgnizationQueryForm;

@Controller
@RequestMapping("/system/org")
public class OrgnizationControllerProxy extends ControllerProxyBase<OrgnizationQueryForm, OrgnizationDetail> {
	private static final String DEFAULT_CONTROLLER_BEAN_NAME="orgnizationControllerImpl";
	private static final String DEFAULT_CONTROLLER_BASE_URL="/system/org";

	@Override
	protected String getDefaultControllerBeanName() {
		return DEFAULT_CONTROLLER_BEAN_NAME;
	}

	@Override
	protected String getDefaultBaseUrl() {
		return DEFAULT_CONTROLLER_BASE_URL;
	}

}
