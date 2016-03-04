package com.uc.web.forms;

import java.util.Map;

import com.uc.web.domain.system.UserInfo;

public interface QueryForm {

	String getQueryOrder();

	String getQueryOrderBy();

	UserInfo getQueryUser();

	void setQueryUser(UserInfo queryUser);

	String getOrderByClause();

	void addLimits(String name, Object item);

	void addLimits(Map<String, ? extends Object> map);

	Object getLimits(String name);

	void clearLimits();

}