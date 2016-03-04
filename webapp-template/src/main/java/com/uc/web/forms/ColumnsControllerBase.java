package com.uc.web.forms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.uc.utils.LoggerSupportorImpl;

public abstract class ColumnsControllerBase extends LoggerSupportorImpl implements ColumnsController {
	
	List<Column> columns;
	
	public ColumnsControllerBase() {
		columns=new ArrayList<>();
		columns.addAll(getDefaultColumns());
	}
	
	@Override
	public List<Column> getColumns() {
		return columns;
	}
	
	protected void setColumnShow(String col, boolean show){
		for(Column column:getColumns()){
			if(column.getTitle().equals(col)){
				column.setShow(show);
			}
		}		
	}

	@Override
	public void show(String column) {
		setColumnShow(column, true);
	}

	@Override
	public void hide(String column) {
		setColumnShow(column, false);
	}

	protected void setColumnShow(int index, boolean show){
		for(Column column:getColumns()){
			if(column.getIndex()==index){
				column.setShow(true);
			}
		}
	}
	
	@Override
	public void show(int index) {
		setColumnShow(index, true);
	}

	@Override
	public void hide(int index) {
		setColumnShow(index, false);
	}
	
	public void setColumnsShowFromString(String showConfig){
		char[] flags=showConfig.toCharArray();
		int i=0;
		for (Iterator<Column> iterator = getColumns().iterator(); iterator.hasNext();) {
			Column column =iterator.next();
			if(i< flags.length){
				column.setShow(flags[i]!='0');
			} else {				
				column.setShow(false);
			}
			i++;
		}
	}
	
	public String getColumnsShowString(){
		StringBuilder builder=new StringBuilder();
		for(Column column:getColumns()){
			builder.append(column.isShow() ? "1": "0");
		}
		return builder.toString();
	}
	
	@Override
	public Column[] toArray() {
		
		Column [] columns=getColumns().toArray(new Column[getColumns().size()]);
		return columns;
	}
	
	protected abstract List<Column> getDefaultColumns();

}
