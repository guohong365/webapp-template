package com.uc.web.persistence.security;

import java.util.List;

import com.uc.web.domain.system.Role;
import com.uc.web.domain.system.RoleResource;
import com.uc.web.domain.system.UserInfo;
import com.uc.web.forms.MenuItem;

public interface UserInfoMapper {

	UserInfo selectById(String userId);

	List<RoleResource> selectResources();

	List<MenuItem> selectMenuItems(String userId);
	
	List<Role> selectRolesByUser(String userId);

}
