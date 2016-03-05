package com.uc.web.domain.system;

public interface Function {

	String getId();

	void setId(String funcId);

	String getName();

	void setName(String funcName);

	String getUri();

	void setUri(String funcUri);

	String getDescription();

	void setDescription(String funcDesc);

	boolean isValid();

	void setValid(boolean valid);

	String getUriPattern();

	void setUriPattern(String funcUriPattern);

}