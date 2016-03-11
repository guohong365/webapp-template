package com.uc.web.service;

import java.util.List;

import com.uc.utils.TreeItem;
import com.uc.web.domain.system.RoleResource;
import com.uc.web.domain.system.UserInfo;
import com.uc.web.forms.MenuItem;

public interface SecurityService {

	UserInfo selectUserInfo(String userId);

	List<? extends RoleResource> selectRoleRresources();

	TreeItem<? extends MenuItem> selectMenu(String userId);
}
