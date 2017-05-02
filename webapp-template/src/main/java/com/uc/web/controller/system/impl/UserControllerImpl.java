package com.uc.web.controller.system.impl;

import com.uc.web.controller.AbstractController;
import com.uc.web.controller.ControllerInfo;
import com.uc.web.controller.ControllerInfoBase;
import com.uc.web.domain.system.UserDetail;
import com.uc.web.forms.system.UserQueryForm;

public class UserControllerImpl extends AbstractController<UserQueryForm, UserDetail> {
	private static final String DEFAULT_BASE_PATH="system/user";
	private static final String DEFAULT_MODEL_TITLE="用户管理";
	private static final String DEFAULT_ENTITY_NAME="用户";
	
	private ControllerInfo defaultControlInfo;
			
	
	@Override
	protected UserQueryForm onCreateNewQueryForm() {
		return new UserQueryForm();
	}

	@Override
	protected UserDetail onCreateNewDetail() {
		return new UserDetail();
	}

	@Override
	protected ControllerInfo getDefaultControlerInto() {
		if(defaultControlInfo==null){
			defaultControlInfo=new ControllerInfoBase(DEFAULT_BASE_PATH, DEFAULT_ENTITY_NAME, DEFAULT_MODEL_TITLE);
		}
		return defaultControlInfo;
	}

}
