package com.uc.web.service;

import java.util.List;

import com.uc.web.forms.QueryForm;
import com.uc.web.forms.WebListFormBase;

public interface AppService<QueryFormType extends QueryForm, DetailType extends Object> {

	void select(WebListFormBase<QueryFormType, DetailType> webForm);

	List<DetailType> selectForExport(QueryFormType queryForm);

	DetailType selectById(String selectedId);

	void insert(DetailType detail);

	void update(DetailType detail);

	void cancelateById(DetailType detail);

	void deleteById(DetailType detail);

	void activeById(DetailType detail);

}
