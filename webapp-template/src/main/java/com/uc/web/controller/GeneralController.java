package com.uc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

import com.uc.web.forms.PageCtrl;
import com.uc.web.forms.QueryForm;

public interface GeneralController<QueryFormType extends QueryForm, DetailType extends Object> {
	public static final String PARAM_NAME_ACTION = "action";
	public static final String PARAM_NAME_DETAIL = "detailInput";
	public static final String PARAM_NAME_RECORDS = "records";
	public static final String PARAM_NAME_QUERY_INPUT = "queryInput";
	public static final String PARAM_NAME_PAGE_CTRL = "pageCtrl";
	public static final String PARAM_NAME_ACTION_NAME = "actionName";
	public static final String PARAM_NAME_MODEL_TITLE = "modelTitle";
	public static final String PARAM_NAME_SELECTED_ID = "selectedId";
	public static final String PARAM_NAME_EXPORT_TYPE = "exportType";
	public static final String PARAM_NAME_BASE_URL="baseUrl";
	
	public static final String URI_PATH_LIST = "/list";
	public static final String URI_PATH_TABLE = "/table";
	public static final String URI_PATH_DETAIL = "/detail";
	public static final String URI_PATH_EXPORT = "/export";
	
	String getModelTitle();
	String getListPage(Model model);
	String postTablePage(QueryFormType queryInput, PageCtrl pageCtrl, Model model);
	String postListPage(QueryFormType queryForm, Model model);
	void exportFile(QueryFormType queryForm, HttpServletRequest request, HttpServletResponse response, String type);
	String getDetailPage(String action, String recordId, Model model);
	String postDetailPage(String action, DetailType detail);

}
