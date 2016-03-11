package com.uc.web.forms.system;

import java.util.Map;

import com.uc.web.forms.QueryFormBase;

public class FunctionQueryForm extends QueryFormBase {
	private static final String ORDERBY_COLUMN_NAME_FUNC_ID="功能编号";
	private static final String ORDERBY_COLUMN_NAME_FUNC_NAME="功能名称";
	private static final String ORDERBY_COLUMN_NAME_FUNC_URI="功能入口";
	private static final String ORDERBY_COLUMN_NAME_FUNC_URI_PATTERN="模块路径";
	private static final String ORDERBY_COLUMN_NAME_FUNC_VALID="有效";
	public String getQueryFuncId() {
		return queryFuncId;
	}

	public void setQueryFuncId(String queryFuncId) {
		this.queryFuncId = queryFuncId;
	}

	public String getQueryFuncName() {
		return queryFuncName;
	}

	public void setQueryFuncName(String queryFuncName) {
		this.queryFuncName = queryFuncName;
	}

	public boolean isAll() {
		return all;
	}

	public void setAll(boolean all) {
		this.all = all;
	}

	public String getQueryFuncUri() {
		return queryFuncUri;
	}

	public void setQueryFuncUri(String queryFuncUri) {
		this.queryFuncUri = queryFuncUri;
	}

	private String queryFuncId;
	private String queryFuncName;
	private String queryFuncUri;
	private boolean all;

	@Override
	protected void buildOrderByColumnMap() {
		Map<String, String> map=getColumnMap();
		map.put(ORDERBY_COLUMN_NAME_FUNC_ID, "FUNC_ID");
		map.put(ORDERBY_COLUMN_NAME_FUNC_NAME, "FUNC_NAME");
		map.put(ORDERBY_COLUMN_NAME_FUNC_URI, "FUNC_URI");
		map.put(ORDERBY_COLUMN_NAME_FUNC_URI_PATTERN, "FUNC_URI_PATTERN");
		map.put(ORDERBY_COLUMN_NAME_FUNC_VALID, "ENABLE_FLAG");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder		
		.append("[FunctionQueryForm")
		.append(super.toString())
		.append(" [ID=").append(getQueryFuncId()).append("]")
		.append("[名称=").append(getQueryFuncName()).append("]")
		.append("[入口URI").append(getQueryFuncUri()).append("]")
		.append("[所有=").append(isAll()?"是":"否").append("]")
		.append("]");
		return builder.toString();
	}

}
