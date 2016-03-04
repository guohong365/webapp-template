package com.uc.web.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uc.utils.exportor.ExportType;
import com.uc.web.forms.PageCtrl;
import com.uc.web.forms.QueryForm;

public abstract class ControllerProxyBase<QueryFormType extends QueryForm, DetailType extends Object> 
	implements ControllerProxy<QueryFormType, DetailType>, GeneralController<QueryFormType, DetailType>{

	@Override
	@ModelAttribute(value=PARAM_NAME_MODEL_TITLE)
	public String getModelTitle() {
		return getControler().getModelTitle();
	}
	
	@Override
	@ModelAttribute(value=PARAM_NAME_BASE_URL)
	public String getBaseUrl(){
		return onGetBaseUrl();
	}

	protected abstract String onGetBaseUrl();

	@Override
	@RequestMapping(value=URI_PATH_LIST, method=RequestMethod.GET)
	public String getListPage(Model model) {
		return getControler().getListPage(model);
	}

	@Override
	@RequestMapping(value=URI_PATH_TABLE, method=RequestMethod.POST)
	public String postTablePage(
			@ModelAttribute(value=PARAM_NAME_QUERY_INPUT)
			QueryFormType queryInput,
			@ModelAttribute(value=PARAM_NAME_PAGE_CTRL)
			PageCtrl pageCtrl, 
			Model model) {
		return getControler().postTablePage(queryInput, pageCtrl, model);
	}	

	@Override
	@RequestMapping(value=URI_PATH_LIST, method=RequestMethod.POST)
	public String postListPage(
			@ModelAttribute(value=PARAM_NAME_QUERY_INPUT)
			QueryFormType queryForm, 
			Model model) {
		return getControler().postListPage(queryForm, model);
	}

	@Override
	@RequestMapping(value=URI_PATH_EXPORT, method=RequestMethod.POST)
	public void exportFile(
			@ModelAttribute(value=PARAM_NAME_QUERY_INPUT)
			QueryFormType queryForm, 
			HttpServletRequest request, 
			HttpServletResponse response,
			@RequestParam(value=PARAM_NAME_EXPORT_TYPE, required=false, defaultValue=ExportType.TYPE_EXCEL)
			String type) {
		getControler().exportFile(queryForm, request, response, type);
	}

	@Override
	@RequestMapping(value=URI_PATH_DETAIL, method=RequestMethod.GET)
	public String getDetailPage(
			@RequestParam(value=PARAM_NAME_ACTION, required=false, defaultValue=WebAction.NEW)
			String action,
			@RequestParam(value=PARAM_NAME_SELECTED_ID, required=false, defaultValue="")
			String recordId, 
			Model model) {
		return getControler().getDetailPage(action, recordId, model);
	}

	@Override
	@RequestMapping(value=URI_PATH_DETAIL, method=RequestMethod.POST)
	@ResponseBody
	public String postDetailPage(
			@RequestParam(value=PARAM_NAME_ACTION)
			String action,
			@ModelAttribute(value=PARAM_NAME_DETAIL)
			DetailType detail) {
		return getControler().postDetailPage(action, detail);
	}
	
	@InitBinder(PARAM_NAME_QUERY_INPUT)
	protected void initBinderQueryForm(WebDataBinder binder) {
		binder.setFieldDefaultPrefix(PARAM_NAME_QUERY_INPUT + ".");
	}

	@InitBinder(PARAM_NAME_PAGE_CTRL)
	protected void iniBinderPageCtrl(WebDataBinder binder) {
		binder.setFieldDefaultPrefix(PARAM_NAME_PAGE_CTRL + ".");
	}

	@InitBinder
	protected void initBinderDateType(WebDataBinder binder) {
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true) );		
	}
}
