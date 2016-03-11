package com.uc.web.controller.system.impl;

import com.uc.web.controller.AbstractController;
import com.uc.web.controller.ControllerInfo;
import com.uc.web.controller.ControllerInfoBase;
import com.uc.web.domain.system.MenuDetail;
import com.uc.web.forms.system.MenuQueryForm;

public class MenuControllerImpl extends AbstractController<MenuQueryForm, MenuDetail> {
	
	private static final String DEFAULT_BASE_PATH="/system/menu";
	private static final String DEFAULT_ENTITY_NAME="菜单";
	private static final String DEFAULT_TITLE="菜单管理";

	private ControllerInfo controllerInfo=new ControllerInfoBase(DEFAULT_BASE_PATH, DEFAULT_ENTITY_NAME, DEFAULT_TITLE);
	
	@Override
	protected ControllerInfo getDefaultControlerInto() {
		return controllerInfo;
	}

	@Override
	protected MenuQueryForm onCreateNewQueryForm() {
		return new MenuQueryForm();
	}

	@Override
	protected MenuDetail onCreateNewDetail() {
		return new MenuDetail();
	}

}
