package com.uc.web.domain.system;

public interface Orgnization {

	void setValid(boolean valid);

	boolean isValid();

	void setDescription(String description);

	String getDescription();

	void setName(String name);

	String getName();

	void setParentId(String parentId);

	String getParentId();

	void setId(String id);

	String getId();

}
