package com.uc.web.forms.system;

import java.util.Map;

import com.uc.web.forms.QueryFormBase;

public class OrgnizationQueryForm extends QueryFormBase {
	private static final String ORDERBY_COLUMN_NAME_ORG_ID="机构ID";
	private static final String ORDERBY_COLUMN_NAME_ORG_NAME="机构名称";
	private static final String ORDERBY_COLUMN_NAME_ORG_PARENT_NAME="上级机构名称";
	private static final String ORDERBY_COLUMN_NAME_ORG_DESC="机构描述";
	private static final String ORDERBY_COLUMN_NAME_ORG_VALID="有效";
	private String queryOrgId;
	
	public String getQueryOrgId() {
		return queryOrgId;
	}


	public void setQueryOrgId(String queryOrgId) {
		this.queryOrgId = queryOrgId;
	}


	public String getQueryOrgName() {
		return queryOrgName;
	}


	public void setQueryOrgName(String queryOrgName) {
		this.queryOrgName = queryOrgName;
	}


	public String getQueryOrgParentName() {
		return queryOrgParentName;
	}


	public void setQueryOrgParentName(String queryOrgParentName) {
		this.queryOrgParentName = queryOrgParentName;
	}

	private String queryOrgName;
	private String queryOrgParentName;
	private boolean queryAll;
	
	
	@Override
	protected void buildOrderByColumnMap() {
		Map<String, String> map=getColumnMap();
		map.put(ORDERBY_COLUMN_NAME_ORG_ID, "ORG_ID");
		map.put(ORDERBY_COLUMN_NAME_ORG_NAME, "ORG_NAME");
		map.put(ORDERBY_COLUMN_NAME_ORG_PARENT_NAME, "PARENT_ORG_NAME");
		map.put(ORDERBY_COLUMN_NAME_ORG_VALID, "ORG_DEL_FLAG");
		map.put(ORDERBY_COLUMN_NAME_ORG_DESC, "ORG_DESC");
	}


	public boolean isQueryAll() {
		return queryAll;
	}


	public void setQueryAll(boolean queryAll) {
		this.queryAll = queryAll;
	}

}
