package com.uc.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uc.web.forms.QueryForm;

public class ServiceBase {

	protected Logger logger;

	public static final int ERR_SYSTEM_ERR = -1;	
	public static final int ERR_DUPLICATE_ID=-2;
	
	public String getErrorMessage(int code){
		switch (code) {
		case ERR_SYSTEM_ERR:
			return "系统错误！";
		case ERR_DUPLICATE_ID:
			return "重复记录";
		default:
			return "未知错误！";
		}
	}
	public ServiceBase(){
		logger=LoggerFactory.getLogger(this.getClass());
	}
	
	protected boolean isOrderBy(QueryForm queryForm){
		return queryForm.getOrderByClause()!=null && !queryForm.getOrderByClause().isEmpty();
	}
	
	

}
