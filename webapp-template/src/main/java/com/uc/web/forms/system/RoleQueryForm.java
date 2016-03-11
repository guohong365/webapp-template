package com.uc.web.forms.system;

import java.util.Map;

import com.uc.web.forms.QueryFormBase;

public class RoleQueryForm extends QueryFormBase {
	
	private static final String ORDERBY_COLUMN_NAME_ROLE_ID="角色ID";
	private static final String ORDERBY_COLUMN_NAME_ROLE_NAME="角色名称";
	private static final String ORDERBY_COLUMN_NAME_ROLE_DESC="角色描述";
	private static final String ORDERBY_COLUMN_NAME_ROLE_VALID="有效";
	
	private String queryRoleId;
	private String queryRoleName;
	private boolean all;

	public String getQueryRoleId() {
		return queryRoleId;
	}

	public void setQueryRoleId(String queryRoleId) {
		this.queryRoleId = queryRoleId;
	}

	public String getQueryRoleName() {
		return queryRoleName;
	}

	public void setQueryRoleName(String queryRoleName) {
		this.queryRoleName = queryRoleName;
	}

	public boolean isAll() {
		return all;
	}

	public void setAll(boolean all) {
		this.all = all;
	}

	@Override
	protected void buildOrderByColumnMap() {
		Map<String, String> map=getColumnMap();
		map.put(ORDERBY_COLUMN_NAME_ROLE_ID, "ROLE_ID");
		map.put(ORDERBY_COLUMN_NAME_ROLE_NAME, "ROLE_NAME");
		map.put(ORDERBY_COLUMN_NAME_ROLE_DESC, "ROLE_DESC");
		map.put(ORDERBY_COLUMN_NAME_ROLE_VALID, "VALID");
		
	}

}
