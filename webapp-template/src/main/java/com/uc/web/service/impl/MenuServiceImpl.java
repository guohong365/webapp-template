package com.uc.web.service.impl;

import com.uc.web.domain.system.MenuDetail;
import com.uc.web.domain.system.example.MenuDetailExample;
import com.uc.web.forms.system.MenuQueryForm;
import com.uc.web.service.AbstractAppServiceImpl;
import com.uc.web.service.MenuService;

public class MenuServiceImpl extends AbstractAppServiceImpl<MenuQueryForm, MenuDetail, MenuDetailExample> implements MenuService {

	@Override
	protected boolean prepareExample(MenuQueryForm queryForm, MenuDetailExample example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected MenuDetailExample newExample() {
		return null;
	}

}
