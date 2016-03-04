package com.uc.web.forms;


public interface WebForm<QueryType extends Object, DataType extends Object> {
	QueryType getQuery();
	void setQuery(QueryType query);
	DataType getData();
	void setData(DataType data);
	IPageCtrl getPageCtrl();
	String getAction();
	void setAction(String action);
}
