package com.uc.web.service;

import java.util.List;

import com.uc.utils.TreeItem;
import com.uc.web.forms.MenuItem;
import com.uc.web.forms.security.RoleResource;
import com.uc.web.forms.security.UserInfo;

public interface SecurityService {

	UserInfo selectUserInfo(String userId);

	List<RoleResource> selectRoleRresources();

	TreeItem<MenuItem> selectMenu(String userId);
}
