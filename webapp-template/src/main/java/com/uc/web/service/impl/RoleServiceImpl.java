package com.uc.web.service.impl;

import com.uc.web.domain.system.RoleDetail;
import com.uc.web.domain.system.example.RoleDetailExample;
import com.uc.web.forms.system.RoleQueryForm;
import com.uc.web.persistence.system.RoleDetailMapper;
import com.uc.web.service.AbstractAppServiceImpl;
import com.uc.web.service.RoleService;

public class RoleServiceImpl extends AbstractAppServiceImpl<RoleQueryForm, RoleDetail, RoleDetailExample> implements RoleService {
	
	RoleDetailMapper getRoleDetailMapper(){
		if(getDetailMapper() instanceof RoleDetailMapper){
			return (RoleDetailMapper) getDetailMapper();
		}
		return null;
	}

	@Override
	protected boolean prepareExample(RoleQueryForm queryForm, RoleDetailExample example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected RoleDetailExample newExample() {
		return new RoleDetailExample();
	}
	
	@Override
	public RoleDetail selectById(String selectedId) {
		RoleDetail detail=super.selectById(selectedId);
		if(detail !=null && getRoleDetailMapper()!=null){
			detail.setFunctions(getRoleDetailMapper().selectRoleFunctions(selectedId));
		}
		return detail;
	}
	
	@Override
	public int insert(RoleDetail detail) {
		if(getRoleDetailMapper()!=null){
			getRoleDetailMapper().insertRoleFunctions(detail.getId(), detail.getFunctions());
		}
		return super.insert(detail);
	}
	
	@Override
	public int update(RoleDetail detail) {
		if(getRoleDetailMapper()!=null){
			getRoleDetailMapper().insertRoleFunctions(detail.getId(), detail.getFunctions());
		}		
		return super.update(detail);
	}

}
