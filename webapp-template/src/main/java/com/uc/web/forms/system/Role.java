package com.uc.web.forms.system;

public interface Role {

	void setValid(boolean valid);

	boolean isValid();

	void setDescription(String description);

	String getDescription();

	void setName(String roleName);

	String getName();

	void setId(String roleId);

	String getId();

}
