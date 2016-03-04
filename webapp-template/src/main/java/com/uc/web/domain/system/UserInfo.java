package com.uc.web.domain.system;

import org.springframework.security.core.userdetails.UserDetails;

import com.uc.utils.TreeItem;
import com.uc.web.forms.MenuItem;

public interface UserInfo extends UserDetails, User {
	TreeItem<MenuItem> getMenu();
	void setMenu(TreeItem<MenuItem> menu); 
}
