package com.uc.web.forms;

public interface IPageCtrl {
	int getCurrent();
	void setCurrent(int page);
	int getPageSize();
	void setPageSize(int pageSize);
	int getPageCount();
	void setPageCount(int count);
	int getTotal();
	void setTotal(int total);
	int getOffset();
	void setOffset(int start);
	boolean hasNext();
	boolean hasPrior();
	IPageCtrl nextPage();
	IPageCtrl priorPage();
	boolean isLast();
	boolean isFirst();
}
