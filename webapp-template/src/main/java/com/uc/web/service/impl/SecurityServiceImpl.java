package com.uc.web.service.impl;

import java.util.List;

import com.uc.utils.TreeItem;
import com.uc.web.forms.MenuItem;
import com.uc.web.forms.MenuTree;
import com.uc.web.forms.security.RoleResource;
import com.uc.web.forms.security.UserInfo;
import com.uc.web.persistence.UserInfoMapper;
import com.uc.web.service.SecurityService;

public class SecurityServiceImpl implements SecurityService {
	
	private UserInfoMapper userInfoMapper;
	
	public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
		this.userInfoMapper = userInfoMapper;
	}
	
	protected UserInfoMapper getUserInfoMapper() {
		return userInfoMapper;
	}
	
	@Override
	public UserInfo selectUserInfo(String userId) {		
		return getUserInfoMapper().selectById(userId);
	}

	@Override
	public List<RoleResource> selectRoleRresources() {
		return getUserInfoMapper().selectResources();
	}

	@Override
	public TreeItem<MenuItem> selectMenu(String userId) {
		List<MenuItem> items=getUserInfoMapper().selectMenuItems(userId);
		MenuTree root=new MenuTree(null);
		for(MenuItem menuItem:items){
			TreeItem<MenuItem> item=new TreeItem<MenuItem>(menuItem);
			item.setId(menuItem.getId());
			item.setParentId(menuItem.getParentId());
			item.setText(menuItem.getMenuText());
			if(item.getParentId()==null){
				root.add(item);
			}
			else {
				root.add(item.getParentId(), item);
			}
		}
		return root;
	}
}
