package com.uc.web.controller.system.impl;

import com.uc.web.controller.AbstractController;
import com.uc.web.controller.ControllerInfo;
import com.uc.web.controller.ControllerInfoBase;
import com.uc.web.domain.system.OrgnizationDetail;
import com.uc.web.forms.system.OrgnizationQueryForm;

public class OrnizationControllerImpl extends AbstractController<OrgnizationQueryForm, OrgnizationDetail> {
	private static final String DEFAULT_BASE_PATH="system/org";
	private static final String DEFAULT_MODEL_TITLE="机构管理";
	private static final String DEFAULT_ENTITY_NAME="机构";
	
	private ControllerInfo defaultControllerInfo;
	
	@Override
	protected ControllerInfo getDefaultControlerInto() {
		if(defaultControllerInfo==null){
			defaultControllerInfo=new ControllerInfoBase(DEFAULT_BASE_PATH, DEFAULT_ENTITY_NAME, DEFAULT_MODEL_TITLE);
		}
		return defaultControllerInfo;
	}
	@Override
	protected OrgnizationQueryForm onCreateNewQueryForm() {
		return new OrgnizationQueryForm();
	}
	@Override
	protected OrgnizationDetail onCreateNewDetail() {
		return new OrgnizationDetail();
	}
	
	@Override
	protected String getNewPageName() {
		return super.getModifyPageName();
	}
	
}
