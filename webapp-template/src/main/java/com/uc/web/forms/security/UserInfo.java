package com.uc.web.forms.security;

import org.springframework.security.core.userdetails.UserDetails;

import com.uc.utils.TreeItem;
import com.uc.web.forms.MenuItem;

public interface UserInfo extends UserDetails {
	TreeItem<MenuItem> getMenu();
	void setMenu(TreeItem<MenuItem> menu); 
}
