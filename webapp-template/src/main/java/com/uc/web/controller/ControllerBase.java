package com.uc.web.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

import com.uc.utils.exportor.Exportor;
import com.uc.web.domain.system.CodeTable;
import com.uc.web.domain.system.UserInfo;
import com.uc.web.forms.IPageCtrl;
import com.uc.web.forms.PageCtrl;
import com.uc.web.forms.QueryForm;
import com.uc.web.forms.WebListFormBase;
import com.uc.web.service.AppService;

public abstract class ControllerBase<QueryFormType extends QueryForm, DetailType extends Object> extends ControllerSupport implements ControllerInfo{

	protected static final String PAGE_LIST = "/list";
	protected static final String PAGE_TABLE = "/table";
	protected static final String PAGE_VIEW = "/view";
	protected static final String PAGE_MODIFY = "/modify";
	protected static final String PAGE_DELETE = "/delete";
	protected static final String PAGE_NEW = "/new";
	protected static final String PAGE_CANCELATE = "/cancelate";
	protected static final String PAGE_DISABLE = "/disable";
	protected static final String PAGE_REACTIVE = "/reactive";
	
	protected abstract ControllerInfo getDefaultControlerInto();
	
	private ControllerInfo controllerInfo;
	
	public void setControllerInfo(ControllerInfo controllerInfo) {
		this.controllerInfo = controllerInfo;
	}
	
	public ControllerBase() {
		controllerInfo=getDefaultControlerInto();
	}
	
	protected ControllerInfo getControllerInfo() {
		return controllerInfo;
	}
	@Override
	public String getBasePath() {
		return getControllerInfo().getBasePath();
	}
	
	@Override
	public String getEntityName() {
		return getControllerInfo().getEntityName();
	}
	
	@Override
	public String getTitle() {
		return getControllerInfo().getTitle();
	}
	
	protected String getListPageName() {
		return getBasePath() + PAGE_LIST;
	}

	protected String getTablePageName() {
		return getBasePath() + PAGE_TABLE;
	}

	protected String getViewPageName() {
		return getBasePath() + PAGE_VIEW;
	}

	protected String getModifyPageName() {
		return getBasePath() + PAGE_MODIFY;
	}

	protected String getDeletePageName() {
		return getBasePath() + PAGE_DELETE;
	}

	protected String getNewPageName() {
		return getBasePath() + PAGE_NEW;
	}
	
	AppService<QueryFormType, DetailType> appService;

	protected AppService<QueryFormType, DetailType> getAppService(){
		return appService;
	};
	
	public void setAppService(AppService<QueryFormType, DetailType> appService) {
		this.appService = appService;
	}

	private void commonSetQueryForm(UserInfo user, QueryFormType queryForm) {
		queryForm.setQueryUser(user);
		queryForm.addLimits(onGetUserQueryLimits(user));
	}

	//TODO: to create instance from Parameterized Type
	protected abstract QueryFormType onCreateNewQueryForm();

	protected Map<String,Object> onGetUserQueryLimits(UserInfo user) {
		return new HashMap<String, Object>();
	}

	protected QueryFormType onPrepareInitQueryForm(UserInfo user) {
		QueryFormType queryForm= onCreateNewQueryForm();
		commonSetQueryForm(user, queryForm);
		return queryForm;
	}

	protected Map<String, List<CodeTable>> onGetListPageCodes(UserInfo user) {
		return new HashMap<>();
	}

	protected void aferListSelected(WebListFormBase<QueryFormType, DetailType> webForm) {
	}

	protected void onSetListModel(UserInfo user, Model model) {
	}

	protected String onGetListPage(Model model) {
		UserInfo user=getUserInfo();
		WebListFormBase<QueryFormType, DetailType> webForm=new WebListFormBase<>();
		//准备无条件queryFrom		
		QueryFormType queryForm=onPrepareInitQueryForm(user);
		webForm.setQuery(queryForm);
		getAppService().select(webForm);
		addWebListFromToModel(webForm, model);
		aferListSelected(webForm);
		Map<String, List<CodeTable>> codes=onGetListPageCodes(user);
		if(codes!=null && !codes.isEmpty()){
			model.addAllAttributes(codes);
		}		
		onSetListModel(user, model);
		String pageName=getListPageName();
		return pageName;
	}

	protected void onBeforeSelectPagationList(UserInfo user, QueryFormType queryForm, IPageCtrl pageCtrl) {
		commonSetQueryForm(user, queryForm);
	}

	protected String onPostTablePage(QueryFormType queryForm, PageCtrl pageCtrl, Model model) {
		UserInfo user=getUserInfo();
		WebListFormBase<QueryFormType, DetailType> webForm=new WebListFormBase<>();
		onBeforeSelectPagationList(user, queryForm, pageCtrl);
		webForm.setQuery(queryForm);
		webForm.setPageCtrl(pageCtrl);
		getAppService().select(webForm);
		aferListSelected(webForm);
		addWebListFromToModel(webForm, model);		
		onSetListModel(user, model);
		String pageName=getTablePageName();
		return pageName;
	}

	protected void onBeforeSelectPostList(UserInfo user, QueryFormType queryForm) {
		commonSetQueryForm(user, queryForm);
	}

	protected String onPostListPage(QueryFormType queryForm, Model model) {
		UserInfo user=getUserInfo();
		WebListFormBase<QueryFormType, DetailType> webForm=new WebListFormBase<>();
		onBeforeSelectPostList(user, queryForm);
		webForm.setQuery(queryForm);		
		getAppService().select(webForm);
		aferListSelected(webForm);
		addWebListFromToModel(webForm, model);
		onSetListModel(user, model);
		String pageName=getTablePageName();
		return pageName;
	}

	protected String getDetaultExportFileName() {
		return "";
	}

	protected Exportor onGetExportor(QueryFormType queryForm, List<? extends DetailType> data, String type) {
		return null;
	}

	protected void onBeforeSelectExportList(UserInfo user, QueryFormType queryForm) {
		commonSetQueryForm(user, queryForm);
	}

	protected void onAferExportListSelected(QueryFormType queryForm, List<? extends DetailType> details) {		
	}

	protected void onExport(QueryFormType queryForm, HttpServletRequest request, HttpServletResponse response, String type) {
		UserInfo user=getUserInfo();		
		
		onBeforeSelectExportList(user, queryForm);		
		List<? extends DetailType> data=getAppService().selectForExport(queryForm);
		
		onAferExportListSelected(queryForm, data);
		
		Exportor exportor=onGetExportor(queryForm, data, type);
				
		if(exportor!=null){
			try {
				exportor.Export(request, response);
			} catch (IOException e) {
				getLoggger().error(e.toString());
				e.printStackTrace();
			}
		} else {
			getLoggger().error("---- no export found-----");
		}
		
	}

	protected abstract DetailType onCreateNewDetail();

	protected Map<String, List<CodeTable>> onGetNewCodes(UserInfo user) {
		return new HashMap<>();
	}

	protected Map<String, List<CodeTable>> onGetModifyCodes(UserInfo user, DetailType detail) {
		return new HashMap<>();
	}

	protected void onAfterSelectDetail(UserInfo user, String action, DetailType detail) {		
	}

	protected String onGetDetailPage(String action, String selectedId, Model model) {
		UserInfo user=getUserInfo();
		DetailType detail=null;
		Map<String, List<CodeTable>> codes;		
		String pageName="";		
	
		switch(action){
		case WebAction.NEW:
			detail=onCreateNewDetail();
			addDetailToModel(action, detail, model);
			codes=onGetNewCodes(user);
			model.addAllAttributes(codes);			
			pageName=getNewPageName();
			break;
		case WebAction.MODIFY:
			detail=getAppService().selectById(selectedId);
			codes=onGetModifyCodes(user, detail);			
			model.addAllAttributes(codes);			
			pageName=getModifyPageName();
			break;
		case WebAction.CANCELATE:
			detail=getAppService().selectById(selectedId);
			pageName=getCancelatePageName();
			break;
		case WebAction.DELETE:
			detail=getAppService().selectById(selectedId);
			pageName=getDeletePageName();
			break;
		case WebAction.DISABLE:
			detail=getAppService().selectById(selectedId);
			pageName=getDisablePageName();
			break;
		case WebAction.REACTIVE:
			detail=getAppService().selectById(selectedId);	
			codes=onGetReactiveCodes(user, detail);
			model.addAllAttributes(codes);
			pageName=getReactivePageName();
			break;			
		case WebAction.VIEW:
			detail=getAppService().selectById(selectedId);			
			pageName=getViewPageName();
			break;
		default:
			getLoggger().error("---- unknown action[" + action + "]-----");			
			break;
		}		

		onAfterSelectDetail(user, action, detail);
		
		addDetailToModel(action, detail, model);

		return pageName;
	}

	protected String getReactivePageName() {
		return PAGE_REACTIVE;
	}

	protected String getDisablePageName() {
		return PAGE_DISABLE;
	}

	protected String getCancelatePageName() {
		return PAGE_CANCELATE;
	}

	protected void onBeforSaveDetail(UserInfo user, String action, DetailType detail) throws Exception {
		
	}

	protected String onPostDetailPage(String action, DetailType detail) {
		UserInfo user =getUserInfo();
		
		try {
			onBeforSaveDetail(user, action, detail);
	
			switch (action) {
			case WebAction.NEW:
				getAppService().insert(detail);
				break;
			case WebAction.MODIFY:
				getAppService().update(detail);
				break;
			case WebAction.CANCELATE:
				getAppService().cancelateById(detail);
				break;
			case WebAction.DELETE:
				getAppService().deleteById(detail);
				break;
			case WebAction.DISABLE:
				getAppService().cancelateById(detail);
				break;
			case WebAction.VIEW:
				break;
			case WebAction.REACTIVE:
				getAppService().activeById(detail);
				break;
			default:
				getLoggger().error("-----unknown action-----");
				assert false;
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
			getLoggger().error("-------保存失败-------");
			getLoggger().error(e.toString());
			getLoggger().error("-------------------");
			return "FAILED";
		}
		return "OK";
	}

	protected void addDetailToModel(String action, DetailType detail, Model model) {
		setAction(action, model);
		setDetail(detail, model);		
	}

	protected void addWebListFromToModel(WebListFormBase<QueryFormType, DetailType> webListFormBase, Model model) {
		
		model.addAttribute(GeneralController.PARAM_NAME_QUERY_INPUT, webListFormBase.getQuery());
		model.addAttribute(GeneralController.PARAM_NAME_RECORDS, webListFormBase.getData());
		model.addAttribute(GeneralController.PARAM_NAME_PAGE_CTRL,webListFormBase.getPageCtrl());
	}

	protected void setAction(String action, Model model) {
		model.addAttribute(GeneralController.PARAM_NAME_ACTION, action);
		model.addAttribute(GeneralController.PARAM_NAME_ACTION_NAME, WebAction.getActoinName(action)+getEntityName());
	}

	protected void setDetail(Object detail, Model model) {
		model.addAttribute(GeneralController.PARAM_NAME_DETAIL, detail);
	}

	protected Map<String, List<CodeTable>> onGetReactiveCodes(UserInfo user, DetailType detail) {
		return new HashMap<>();
	}


}
