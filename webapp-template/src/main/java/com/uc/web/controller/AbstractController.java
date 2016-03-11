package com.uc.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

import com.uc.web.forms.PageCtrl;
import com.uc.web.forms.QueryForm;

public abstract class AbstractController<QueryFormType extends QueryForm, DetailType extends Object>
	extends ControllerBase<QueryFormType, DetailType> 
	implements AppController<QueryFormType, DetailType> {

	//----------------- get list -----------------------------------
	@Override
	public String getListPage(Model model){
		return onGetListPage(model);
	}
	
	//--------------post table ----------------------------------
	@Override
	public String postTablePage(
			QueryFormType queryInput,
			PageCtrl pageCtrl,
			Model model) {
		return onPostTablePage(queryInput, pageCtrl, model);
	}
	@Override
	public String postListPage(
			QueryFormType queryForm, 
			Model model){
		return onPostListPage(queryForm, model);
	}
	
    @Override
    public void exportFile(
    		QueryFormType queryForm, 
    		HttpServletRequest request, 
    		HttpServletResponse response,
    		String type) {
    	onExport(queryForm, request, response, type);
    }
    
	@Override
	public String getDetailPage(
			String action,
			String recordId, Model model) {
		return onGetDetailPage(action, recordId, model);
	}
		
	@Override
	public String postDetailPage(
			String action,
			DetailType detail) {
		return onPostDetailPage(action, detail);
	}

}
