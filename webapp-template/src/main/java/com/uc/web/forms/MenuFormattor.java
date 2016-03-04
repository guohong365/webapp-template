package com.uc.web.forms;

import com.uc.utils.LoggerSupportorImpl;
import com.uc.utils.TreeItem;

public class MenuFormattor extends LoggerSupportorImpl {
	
	static final String ROOT_HEADER="<ul class=\"nav nav-list\">";
	static final String ROOT_TAIL="</ul>";
	
	
	static final String SUBMENU_HEADER=
	          "<li>"
	        + "  <a class=\"dropdown-toggle\" href=\"#\">"
	        + "    <i class=\"menu-icon %s\"></i>"
	        + "    <span class=\"menu-text\">%s</span>"
	        + "    <b class=\"arrow fa fa-angle-down\"></b>"
	        + "  </a>"
	        + "  <b class=\"arrow\"></b>"
	        + "  <ul class=\"submenu\">";
	
	static final String SUBMENU_TAIL=
			  "  </ul>"
			+ "</li>";
	
	static final String MENUITEM=
			  "<li>"
			+ "  <a href=\"#%s\" data-url=\"%s\">"
			+ "    <i class=\"ace-icon %s\"></i>"
			+ "    <span class=\"menu-text\">%s</span>"
			+ "  </a>"
			+ "  <b class=\"arrow\"></b>"
			+ "</li>";

	void formatItem(TreeItem<MenuItem> item, StringBuilder builder){
		if(item==null){
			return;
		}
		getLoggger().trace("----- format item: " + (item.getData()==null ? "ROOT" : item.getData().toString()));
		formatHeader(item, builder);
		formatSubItem(item, builder);
		formatTail(item, builder);
	}
	boolean isRoot(TreeItem<MenuItem> item){
		return item.getData()==null &&
				(item.getChildren()!=null || !item.getChildren().isEmpty());
	}
	boolean isSubMenu(TreeItem<MenuItem> item){
		return item.getChildren()!=null && !item.getChildren().isEmpty();
	}
	boolean isMenuItem(TreeItem<MenuItem> item){
		MenuItem menuItem=item.getData();		
		return menuItem.getURI()!=null && (item.getChildren()==null || item.getChildren().isEmpty());
	}
	
	void formatHeader(TreeItem<MenuItem> item, StringBuilder builder){
		if(isRoot(item)){
			getLoggger().trace("----ROOT BEGIN-----");
			builder.append(ROOT_HEADER);			
		} else if(isSubMenu(item)) {
			getLoggger().trace("----SUB ITEM :" + item.getData().getMenuText() + "-----");
			builder.append(String.format(SUBMENU_HEADER, item.getData().getIconClass(), item.getData().getMenuText()));
			
		} else if(isMenuItem(item)) {
			getLoggger().trace("---ITEM :" + item.getData().getMenuText() + "------");
			builder.append(String.format(MENUITEM, item.getData().getURI(), item.getData().getURI(), item.getData().getIconClass(), item.getData().getMenuText()));
		} else {
			getLoggger().trace("empty subitem found:" + item.getData().toString());
		}
	}
	void formatTail(TreeItem<MenuItem> item, StringBuilder builder){
		if(isRoot(item)){
			builder.append(ROOT_TAIL);
		} else if(isSubMenu(item)) {
			builder.append(SUBMENU_TAIL);
		}		
	}
	
	void formatSubItem(TreeItem<MenuItem> item, StringBuilder builder){
		if(item.getChildren()!=null){
			for(TreeItem<MenuItem> subitem: item.getChildren()){
				formatItem(subitem, builder);
			}
		}
	}
	
	public String format(Object menuRoot) {
		if(menuRoot instanceof TreeItem<?>){
			@SuppressWarnings("unchecked")
			TreeItem<MenuItem> menuTree=(TreeItem<MenuItem>)menuRoot;
			StringBuilder builder=new StringBuilder();
			formatItem(menuTree, builder);
			return builder.toString();
		}
		return "";
	}
}
