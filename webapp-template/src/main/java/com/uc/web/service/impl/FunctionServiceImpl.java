package com.uc.web.service.impl;

import org.springframework.util.StringUtils;

import com.uc.web.domain.system.FunctionDetail;
import com.uc.web.domain.system.example.FunctionDetailExample;
import com.uc.web.forms.system.FunctionQueryForm;
import com.uc.web.service.AbstractAppServiceImpl;
import com.uc.web.service.FunctionService;

public class FunctionServiceImpl extends AbstractAppServiceImpl<FunctionQueryForm, FunctionDetail, FunctionDetailExample> implements FunctionService {

	@Override
	protected boolean prepareExample(FunctionQueryForm queryForm, FunctionDetailExample example) {
		FunctionDetailExample.Criteria criteria=example.or();
		if(!StringUtils.isEmpty(queryForm.getQueryFuncId())){
			criteria.andFuncIdLike("%"+queryForm.getQueryFuncId()+"%");			
		}
		if(!StringUtils.isEmpty(queryForm.getQueryFuncName())){
			criteria.andFuncNameLike("%"+queryForm.getQueryFuncName()+"%");
		}
		if(!StringUtils.isEmpty(queryForm.getQueryFuncUri())){
			criteria.andFuncUriLike("%"+queryForm.getQueryFuncUri()+"%");
		}
		if(!queryForm.isAll()){
			criteria.andEnableFlagEqualTo(true);
		}
		return true;
	}

	@Override
	protected FunctionDetailExample newExample() {
		return new FunctionDetailExample();
	}
	
	@Override
	public int cancelateById(FunctionDetail detail) {
		detail.setValid(false);
		return super.cancelateById(detail);
	}
	
	@Override
	public int activeById(FunctionDetail detail) {
		detail.setValid(true);
		return super.activeById(detail);
	}
}
