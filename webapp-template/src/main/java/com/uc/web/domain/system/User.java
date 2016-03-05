package com.uc.web.domain.system;

import java.util.List;

public interface User {

	void setRoles(List<? extends Role> roles);

	List<? extends Role> getRoles();

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

	void setOrgId(String orgId);

	String getOrgId(); 
}
