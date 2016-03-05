package com.uc.web.service.impl;

import com.uc.web.domain.system.OrgnizationDetail;
import com.uc.web.domain.system.example.OrgnizationDetailExample;
import com.uc.web.forms.system.OrgnizationQueryForm;
import com.uc.web.service.AbstractAppServiceImpl;
import com.uc.web.service.OrgnizationService;

public class OrgnizationServiceImpl extends AbstractAppServiceImpl<OrgnizationQueryForm, OrgnizationDetail, OrgnizationDetailExample> implements OrgnizationService {

	@Override
	protected boolean prepareExample(OrgnizationQueryForm queryForm, OrgnizationDetailExample example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected OrgnizationDetailExample newExample() {
		// TODO Auto-generated method stub
		return null;
	}

}
