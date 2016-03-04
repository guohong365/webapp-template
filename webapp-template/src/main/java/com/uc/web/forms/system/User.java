package com.uc.web.forms.system;

import java.util.List;

public interface User {

	void setRoles(List<Role> roles);

	List<Role> getRoles();

	void setDescription(String description);

	String getDescription();

	void setPassword(String password);

	String getPassword();

	void setName(String nickName);

	String getName();

	void setId(String userId);

	String getId();

	void setValid(boolean valid);

	boolean isValid(); 
}
