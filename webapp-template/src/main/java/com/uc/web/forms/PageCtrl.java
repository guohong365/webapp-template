package com.uc.web.forms;

public class PageCtrl implements IPageCtrl {
	@Override
	public String toString() {
		return "PageCtrl [current=" + current + ", pageCount=" + pageCount + ", total=" + total
				+ ", offset=" + offset + "]";
	}

	private int current;
	private int pageCount;
	private int total;	
	private int offset;
	private int pageSize;
	
	public static void initPageCtrl(IPageCtrl pageCtrl, int total){
		pageCtrl.setTotal(total);
		pageCtrl.setCurrent(0);
		pageCtrl.setOffset(0);
		pageCtrl.setPageCount(total/pageCtrl.getPageSize()+(total%pageCtrl.getPageSize()==0? 0:1));
	}
	
	public PageCtrl(){
		offset=0;
		current=1;
		total=-1;
		pageCount=-1;
	}
	
	@Override
	public IPageCtrl nextPage() {
		if(offset + pageSize >0){
			offset +=pageSize;
			current ++;
			return this;
		}
		return null;
	}

	@Override
	public IPageCtrl priorPage() {
		if(offset > 0){
			if(offset - pageSize >0){
				offset -=pageSize;
				current--;
			} else {
				offset=0;
				current=1;
			}
			return this;
		}
		return null;
	}

	@Override
	public boolean hasNext() {		
		return offset + pageSize < total;
	}

	@Override
	public boolean hasPrior() {		
		return offset>0;
	}

	@Override
	public boolean isLast() {
		return current==1;
	}

	@Override
	public boolean isFirst() {		
		return current==pageCount;
	}

	@Override
	public int getCurrent() {
		return this.current;
	}

	@Override
	public void setCurrent(int page) {
		this.current=page;
	}

	@Override
	public int getPageSize() {
		return pageSize;
	}

	@Override
	public void setPageSize(int pageSize) {
		this.pageSize=pageSize;
	}

	@Override
	public int getPageCount() {
		return this.pageCount;
	}

	@Override
	public void setPageCount(int count) {
		this.pageCount=count;
	}

	@Override
	public int getTotal() {
		return this.total;
	}

	@Override
	public void setTotal(int totalCount) {
		this.total=totalCount;		
	}

	@Override
	public int getOffset() {
		return this.offset;
	}

	@Override
	public void setOffset(int start) {
		this.offset=start;
	}

}
