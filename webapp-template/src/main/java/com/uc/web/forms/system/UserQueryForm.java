package com.uc.web.forms.system;

import java.util.Map;

import com.uc.web.forms.QueryFormBase;

public class UserQueryForm extends QueryFormBase {
	private static final String ORDER_BY_COLUMN_NAME_USER_ID="用户ID";
	private static final String ORDER_BY_COLUMN_NAME_USER_NAME="用户姓名";
	private static final String ORDER_BY_COLUMN_NAME_USER_ORG_NAME="所属机构";
	
	@Override
	protected void buildOrderByColumnMap() {
		Map<String, String> map=getColumnMap();
		map.put(ORDER_BY_COLUMN_NAME_USER_ID, "USER_ID");
		map.put(ORDER_BY_COLUMN_NAME_USER_NAME, "USER_NAME");
		map.put(ORDER_BY_COLUMN_NAME_USER_ORG_NAME, "ORG_NAME");
	}
	
	private String queryUserId;
	private String queryUserName;
	private String queryUserOrgId;
	private boolean queryAll;

	public String getQueryUserId() {
		return queryUserId;
	}
	public void setQueryUserId(String queryUserId) {
		this.queryUserId = queryUserId;
	}
	public String getQueryUserName() {
		return queryUserName;
	}
	public void setQueryUserName(String queryUserName) {
		this.queryUserName = queryUserName;
	}
	public String getQueryUserOrgId() {
		return queryUserOrgId;
	}
	public void setQueryUserOrgId(String queryUserOrgId) {
		this.queryUserOrgId = queryUserOrgId;
	}
	public boolean isQueryAll() {
		return queryAll;
	}
	public void setQueryAll(boolean queryAll) {
		this.queryAll = queryAll;
	}
	
	

}
