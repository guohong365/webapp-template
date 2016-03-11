package com.uc.web.controller.system.impl;

import com.uc.web.controller.AbstractController;
import com.uc.web.controller.ControllerInfo;
import com.uc.web.controller.ControllerInfoBase;
import com.uc.web.domain.system.FunctionDetail;
import com.uc.web.forms.system.FunctionQueryForm;

public class FunctionControllerImpl extends AbstractController<FunctionQueryForm, FunctionDetail> {
	
	private static final String DEFAULT_BASE_PATH="/system/func";
	private static final String DEFAULT_ENTITY_NAME="功能";
	private static final String DEFAULT_TITLE="功能管理";

	private ControllerInfo controllerInfo=new ControllerInfoBase(DEFAULT_BASE_PATH, DEFAULT_ENTITY_NAME, DEFAULT_TITLE);
	
	@Override
	protected ControllerInfo getDefaultControlerInto() {
		return controllerInfo;
	}

	@Override
	protected FunctionQueryForm onCreateNewQueryForm() {
		return new FunctionQueryForm();
	}

	@Override
	protected FunctionDetail onCreateNewDetail() {
		return new FunctionDetail();
	}

}
