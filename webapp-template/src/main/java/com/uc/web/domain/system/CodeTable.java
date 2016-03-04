package com.uc.web.domain.system;

public interface CodeTable {

	void setValue(String value);

	void setValid(Boolean valid);

	void setCode(String code);

	String getValue();

	Boolean getValid();

	String getCode();
}
