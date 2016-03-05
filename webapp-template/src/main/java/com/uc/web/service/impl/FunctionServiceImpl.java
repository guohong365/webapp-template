package com.uc.web.service.impl;

import com.uc.web.domain.system.FunctionDetail;
import com.uc.web.domain.system.example.FunctionDetailExample;
import com.uc.web.forms.system.FunctionQueryForm;
import com.uc.web.service.AbstractAppServiceImpl;
import com.uc.web.service.FunctionService;

public class FunctionServiceImpl extends AbstractAppServiceImpl<FunctionQueryForm, FunctionDetail, FunctionDetailExample> implements FunctionService {

	@Override
	protected boolean prepareExample(FunctionQueryForm queryForm, FunctionDetailExample example) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected FunctionDetailExample newExample() {
		return new FunctionDetailExample();
	}
}
