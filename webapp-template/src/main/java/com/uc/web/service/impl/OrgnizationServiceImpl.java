package com.uc.web.service.impl;

import org.springframework.util.StringUtils;

import com.uc.web.domain.system.OrgnizationDetail;
import com.uc.web.domain.system.example.OrgnizationDetailExample;
import com.uc.web.forms.system.OrgnizationQueryForm;
import com.uc.web.service.AbstractAppServiceImpl;
import com.uc.web.service.OrgnizationService;

public class OrgnizationServiceImpl extends AbstractAppServiceImpl<OrgnizationQueryForm, OrgnizationDetail, OrgnizationDetailExample> implements OrgnizationService {

	@Override
	protected boolean prepareExample(OrgnizationQueryForm queryForm, OrgnizationDetailExample example) {
		OrgnizationDetailExample.Criteria criteria=example.or();
		if(!StringUtils.isEmpty(queryForm.getQueryOrgId())){
			criteria.andOrgIdLike("%"+queryForm.getQueryOrgId()+"%");
		}
		if(!StringUtils.isEmpty(queryForm.getQueryOrgName())){
			criteria.andOrgNameLike("%"+queryForm.getQueryOrgName()+"%");
		}
		if(!StringUtils.isEmpty(queryForm.getQueryOrgParentName())){
			criteria.andParentOrgNameLike("%"+queryForm.getQueryOrgParentName()+"%");			
		}
		if(!queryForm.isAll()){
			criteria.andOrgDelFlagEqualTo(false);
		}
		return false;
	}

	@Override
	protected OrgnizationDetailExample newExample() {
		return new OrgnizationDetailExample();
	}

}
