package com.uc.web.forms;

public class MenuItemImpl implements MenuItem {
	
	private String id;
	private String parentId;
	private String menuText;
	private String uri;
	private String iconClass;
	private int order;
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id=id;
	}

	@Override
	public String getParentId() {
		return parentId;
	}

	@Override
	public void setParentId(String parentId) {
		this.parentId=parentId;
	}

	@Override
	public String getMenuText() {
		return menuText;
	}

	@Override
	public void setMenuText(String text) {
		this.menuText=text;		
	}

	@Override
	public String getURI() {
		return uri;
	}

	@Override
	public void setURI(String uri) {
		this.uri=uri;
	}

	@Override
	public String getIconClass() {
		return iconClass;
	}

	@Override
	public void setIconClass(String icon) {
		this.iconClass=icon;
	}

	@Override
	public int getOrder() {
		return order;
	}

	@Override
	public void setOrder(int order) {
		this.order=order;
	}

}
