package com.uc.web.controller;

public class ControllerInfoBase implements ControllerInfo {
	private String basePath;
	private String entityName;
	private String title;
	
	public ControllerInfoBase(String basePath, String entityName, String title) {
		this.basePath=basePath;
		this.entityName=entityName;
		this.title=title;
	}

	@Override
	public String getBasePath() {
		return basePath;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getEntityName() {
		return entityName;
	}
	
	
}
