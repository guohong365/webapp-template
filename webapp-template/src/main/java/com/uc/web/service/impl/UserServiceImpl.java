package com.uc.web.service.impl;

import org.springframework.util.StringUtils;

import com.uc.web.domain.system.UserDetail;
import com.uc.web.domain.system.example.UserDetailExample;
import com.uc.web.forms.system.UserQueryForm;
import com.uc.web.persistence.system.UserDetailMapper;
import com.uc.web.service.AbstractAppServiceImpl;
import com.uc.web.service.UserService;


public class UserServiceImpl extends AbstractAppServiceImpl<UserQueryForm, UserDetail, UserDetailExample> implements UserService {
	
	protected UserDetailMapper getUserDetailMapper(){
		if(getDetailMapper() instanceof UserDetailMapper){
			return (UserDetailMapper) getDetailMapper();
		}
		return null;
	}
	
	@Override
	protected boolean prepareExample(UserQueryForm queryForm, UserDetailExample example) {
		if(queryForm==null)
			return true;
		UserDetailExample.Criteria criteria=example.or();
		if(!StringUtils.isEmpty(queryForm.getQueryUserId())){
			criteria.andUserIdLike("%"+queryForm.getQueryUserId()+"%");			
		}
		if(!StringUtils.isEmpty(queryForm.getQueryUserName())){
			criteria.andUserNameLike("%" + queryForm.getQueryUserName() + "%");
		}
		if(!queryForm.isQueryAll()){
			criteria.andValidEqualTo(true);
		}		
		return true;
	}

	@Override
	protected UserDetailExample newExample() {
		return new UserDetailExample();
	}
	
	@Override
	public UserDetail selectById(String selectedId) {
		UserDetail detail=super.selectById(selectedId);
		if(detail!=null && getUserDetailMapper()!=null){
			detail.setRoles(getUserDetailMapper().selectUserRoles(selectedId));
		}
		return detail;
	}
	
	@Override
	public int update(UserDetail detail) {
		if(getUserDetailMapper()!=null){
			getUserDetailMapper().insetUserRoles(detail.getId(), detail.getRoles());
		}
		return super.update(detail);
	}
	
	@Override
	public int cancelateById(UserDetail detail) {
		return super.cancelateById(detail);
	}
	
	@Override
	public int activeById(UserDetail detail) {
		detail.setCancelator(null);
		detail.setCancelTime(null);
		return super.update(detail);
	}
	
	@Override
	public int deleteById(UserDetail detail) {
		return 0;
	}
}
