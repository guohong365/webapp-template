package com.uc.web.domain.system;

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
	@Override
	public String getOrgId() {
		return orgId;
	}
	@Override
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder
		.append("UserBase:")
		.append("[用户ID=").append(getId()).append("]")
		.append("[用户名称=").append(getName()).append("]")
		.append("[密码=").append(getPassword()).append("]")
		.append("[描述=").append(getDescription()).append("]")
		.append("[有效=").append(isValid()?"是":"否").append("]")
		.append("[所属机构=").append(getOrgId()).append("]")
		.append("[角色=").append(getRoles()).append("]");
		return builder.toString();
	}



	private String userId;
	private String nickName;
	private String password;
	private String description;
	private String orgId;
	private boolean valid;
	private List<Role> roles;	
}
