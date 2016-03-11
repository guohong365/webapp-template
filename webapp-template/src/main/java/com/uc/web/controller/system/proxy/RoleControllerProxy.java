package com.uc.web.controller.system.proxy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uc.web.controller.ControllerProxyBase;
import com.uc.web.domain.system.RoleDetail;
import com.uc.web.forms.system.RoleQueryForm;

@Controller
@RequestMapping("/system/role")
public class RoleControllerProxy extends ControllerProxyBase<RoleQueryForm, RoleDetail> {
	private static final String DEFAULT_CONTROLLER_BEAN_NAME="roleControllerImpl";
	private static final String DEFAULT_CONTROLLER_BASE_URL="/system/role";

	@Override
	protected String getDefaultControllerBeanName() {
		return DEFAULT_CONTROLLER_BEAN_NAME;
	}

	@Override
	protected String getDefaultBaseUrl() {
		return DEFAULT_CONTROLLER_BASE_URL;
	}

}
