package com.uc.web.controller.system.impl;

import com.uc.web.controller.AbstractController;
import com.uc.web.controller.ControllerInfo;
import com.uc.web.controller.ControllerInfoBase;
import com.uc.web.domain.system.RoleDetail;
import com.uc.web.forms.system.RoleQueryForm;

public class RoleControllerImpl extends AbstractController<RoleQueryForm, RoleDetail> {
	
	private static final String DEFAULT_BASE_PATH="/system/role";
	private static final String DEFAULT_ENTITY_NAME="角色";
	private static final String DEFAULT_TITLE="角色管理";

	private ControllerInfo controllerInfo=new ControllerInfoBase(DEFAULT_BASE_PATH, DEFAULT_ENTITY_NAME, DEFAULT_TITLE);
	
	@Override
	protected ControllerInfo getDefaultControlerInto() {
		return controllerInfo;
	}

	@Override
	protected RoleQueryForm onCreateNewQueryForm() {
		return new RoleQueryForm();
	}

	@Override
	protected RoleDetail onCreateNewDetail() {
		return new RoleDetail();
	}

}
