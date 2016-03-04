package com.uc.web.domain.system;

public class RoleBase implements Role {
	@Override
	public String getId() {
		return roleId;
	}
	@Override
	public void setId(String roleId) {
		this.roleId = roleId;
	}
	@Override
	public String getName() {
		return roleName;
	}
	@Override
	public void setName(String roleName) {
		this.roleName = roleName;
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
	public boolean isValid() {
		return valid;
	}
	@Override
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	private String roleId;
	private String roleName;
	private String description;
	private boolean valid;

}
