package com.uc.web.domain.system;

import java.util.Date;

public class OrgnizationDetail extends OrgnizationBase {

	private String orgType;
	private String orgArea;
	private String orgAddr;
	private String orgTele;
	private String orgLinkman;
	private String orgCity;
	private String creator;
	private Date createTime;
	private String parentOrgName;
	private String cityName;
	private String areaName;

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getOrgArea() {
		return orgArea;
	}

	public void setOrgArea(String orgArea) {
		this.orgArea = orgArea;
	}

	public String getOrgAddr() {
		return orgAddr;
	}

	public void setOrgAddr(String orgAddr) {
		this.orgAddr = orgAddr;
	}

	public String getOrgTele() {
		return orgTele;
	}

	public void setOrgTele(String orgTele) {
		this.orgTele = orgTele;
	}

	public String getOrgLinkman() {
		return orgLinkman;
	}

	public void setOrgLinkman(String orgLinkman) {
		this.orgLinkman = orgLinkman;
	}

	public String getOrgCity() {
		return orgCity;
	}

	public void setOrgCity(String orgCity) {
		this.orgCity = orgCity;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getParentOrgName() {
		return parentOrgName;
	}

	public void setParentOrgName(String parentOrgName) {
		this.parentOrgName = parentOrgName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
}