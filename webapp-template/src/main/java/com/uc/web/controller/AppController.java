package com.uc.web.controller;

import com.uc.web.forms.QueryForm;

public interface AppController<QueryFormType extends QueryForm, DetailType> extends GeneralController<QueryFormType, DetailType>, ControllerInfo {

}
