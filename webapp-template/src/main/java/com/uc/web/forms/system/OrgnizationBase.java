package com.uc.web.forms.system;

public class OrgnizationBase implements Orgnization {
@Override
public String getId() {
		return id;
	}
	@Override
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String getParentId() {
		return parentId;
	}
	@Override
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
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
private String id;
private String parentId;
private String name;
private String description;
private boolean valid;
}
