package com.uc.web.forms;

import java.util.List;

public interface ColumnsController {
	List<Column> getColumns();
	void show(String column);
	void hide(String column);
	void show(int index);
	void hide(int index);
	
	Column[] toArray();
	
}
