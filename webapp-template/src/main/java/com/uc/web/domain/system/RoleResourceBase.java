package com.uc.web.domain.system;

public class RoleResourceBase implements RoleResource {
	private String roleId;
	private String uriPattern;
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getUriPattern() {
		return uriPattern;
	}
	public void setUriPattern(String uriPattern) {
		this.uriPattern = uriPattern;
	}
}
