package com.uc.web.forms.system;

import java.util.List;

public class UserBase implements User {
	@Override
	public String getId() {
		return userId;
	}
	@Override
	public void setId(String userId) {
		this.userId = userId;
	}
	@Override
	public String getName() {
		return nickName;
	}
	@Override
	public void setName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public List<Role> getRoles() {
		return roles;
	}
	@Override
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@Override
	public boolean isValid() {
		return valid;
	}
	@Override
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	private String userId;
	private String nickName;
	private String password;
	private String description;
	private boolean valid;
	private List<Role> roles;	
}
