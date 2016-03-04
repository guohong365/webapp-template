package com.uc.web.forms;

public interface MenuItem  {
	String getId();
	void setId(String id);
	String getParentId();
	void setParentId(String parentId);
	String getMenuText();
	void setMenuText(String text);
	String getURI();
	void setURI(String uri);
	String getIconClass();
	void setIconClass(String icon);
	int getOrder();
	void setOrder(int order);
}
