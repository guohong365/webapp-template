package com.uc.web.domain.system;

public class RoleDetail extends RoleBase {
	private Boolean isInternal;

	public Boolean getIsInternal() {
		return isInternal;
	}

	public void setIsInternal(Boolean isInternal) {
		this.isInternal = isInternal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder
		.append("[RoleDetail ")
		.append(super.toString())
		.append("[内部角色=").append(getIsInternal()?"是":"否").append("]")
		.append("]");
		return builder.toString();
	}

}
