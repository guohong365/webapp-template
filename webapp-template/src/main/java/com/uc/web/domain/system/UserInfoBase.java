package com.uc.web.domain.system;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.uc.utils.TreeItem;
import com.uc.web.forms.MenuItem;

public class UserInfoBase extends UserBase implements UserInfo {
	private static final long serialVersionUID = 5375835512650609806L;
	private Collection<GrantedAuthority> authorities;
	private TreeItem<? extends MenuItem> menuTree;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		synchronized (UserInfoBase.class) {
			if(authorities==null){
				authorities=new ArrayList<>();
				for(Role role : getRoles()){
					authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getId()));
				}
			}
		}
		return authorities;
	}

	@Override
	public String getUsername() {
		return getId();
	}

	@Override
	public boolean isAccountNonExpired() {
		return isValid();
	}

	@Override
	public boolean isAccountNonLocked() {
		return isValid();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return isValid();
	}

	@Override
	public boolean isEnabled() {
		return isValid();
	}

	@Override
	public TreeItem<? extends MenuItem> getMenu() {
		return menuTree;
	}

	@Override
	public void setMenu(TreeItem<? extends MenuItem> menu) {
		this.menuTree=menu;
	}

}
