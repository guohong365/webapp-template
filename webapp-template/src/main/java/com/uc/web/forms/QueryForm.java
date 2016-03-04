package com.uc.web.forms;

import java.util.Map;

import com.uc.web.domain.system.User;

public interface QueryForm {

	String getQueryOrder();

	String getQueryOrderBy();

	User getQueryUser();

	void setQueryUser(User queryUser);

	String getOrderByClause();

	void addLimits(String name, Object item);

	void addLimits(Map<String, ? extends Object> map);

	Object getLimits(String name);

	void clearLimits();

}