package com.uc.web.forms;

import java.util.Collection;

public class ListColumnImpl extends ColumnBase {

	public ListColumnImpl(String title){	
		this(title, false);
	}
	
	public ListColumnImpl(String title, boolean sortable){
		this(title, 1, 1, true, sortable);
	}
	
	public ListColumnImpl(String title, boolean show, boolean sortable){
		this(title, 1, 1, show, sortable);
	}
	
	public ListColumnImpl(String title, int colSpan, int rowSpan, boolean show, boolean sortable){
		super(title, colSpan, rowSpan, show, sortable);
	}
	

	
	public static String getArrayString(Collection<Column> columns){
		StringBuilder builder=new StringBuilder();
		for (Column column:columns) {
			builder.append(column.isShow()? "1":"0");
		}
		return builder.toString();
	}
	
}
