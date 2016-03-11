package com.uc.web.service;

import java.util.List;

import com.uc.web.forms.QueryForm;
import com.uc.web.forms.WebListFormBase;

public interface AppService<QueryFormType extends QueryForm, DetailType extends Object> {

	void select(WebListFormBase<QueryFormType, DetailType> webForm);

	List<? extends DetailType> selectForExport(QueryFormType queryForm);

	DetailType selectById(String selectedId);

	int insert(DetailType detail);

	int update(DetailType detail);

	int cancelateById(DetailType detail);

	int deleteById(DetailType detail);

	int activeById(DetailType detail);

}
