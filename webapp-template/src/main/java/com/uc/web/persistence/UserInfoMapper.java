package com.uc.web.persistence;

import java.util.List;

import com.uc.web.forms.MenuItem;
import com.uc.web.forms.security.RoleResource;
import com.uc.web.forms.security.UserInfo;

public interface UserInfoMapper {

	UserInfo selectById(String userId);

	List<RoleResource> selectResources();

	List<MenuItem> selectMenuItems(String userId);

}
