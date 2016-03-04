package com.uc.web.forms;

import com.uc.utils.TreeItem;

public class MenuTree extends TreeItem<MenuItem> {
	public MenuTree(MenuItem data) {
		super(data);
		if(data!=null){
			setId(data.getId());
			setText(data.getMenuText());
		} else {
			setId("");
			setText("");			
		}
	}
}
