package com.uc.web.service.impl;

import java.util.List;

import com.uc.utils.TreeItem;
import com.uc.web.domain.system.Role;
import com.uc.web.domain.system.RoleResource;
import com.uc.web.domain.system.UserInfo;
import com.uc.web.domain.system.UserInfoBase;
import com.uc.web.forms.MenuItem;
import com.uc.web.forms.MenuTree;
import com.uc.web.persistence.security.UserInfoMapper;
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
		UserInfoBase userInfo=(UserInfoBase) getUserInfoMapper().selectById(userId);
		List<? extends Role> roles=getUserInfoMapper().selectRolesByUser(userId);
		TreeItem<? extends MenuItem> menu=selectMenu(userId);
		userInfo.setRoles(roles);
		userInfo.setMenu(menu);
		return userInfo;
	}

	@Override
	public List<? extends RoleResource> selectRoleRresources() {
		return getUserInfoMapper().selectResources();
	}

	@Override
	public TreeItem<? extends MenuItem> selectMenu(String userId) {
		List<? extends MenuItem> items=getUserInfoMapper().selectMenuItems(userId);
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
