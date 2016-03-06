package com.uc.web.forms;

import java.util.HashMap;
import java.util.Map;

import com.uc.web.domain.system.User;

public abstract class QueryFormBase implements QueryForm {
	private String queryOrder;
	private String queryOrderBy;
	private User queryUser;
	private Map<String, Object> queryLimits=new HashMap<>();
	private Map<String, String> orderByColumnMap;
	protected Map<String, String> getColumnMap(){
		return orderByColumnMap;
	}
	public QueryFormBase(){
		orderByColumnMap=new HashMap<>();
		queryOrder="asc";
		buildOrderByColumnMap();
	}

	@Override
	public String getQueryOrder() {
		return queryOrder;
	}

	public void setQueryOrder(String queryOrder) {
		this.queryOrder = queryOrder;
	}

	@Override
	public String getQueryOrderBy() {
		return queryOrderBy;
	}

	public void setQueryOrderBy(String queryOrderBy) {
		this.queryOrderBy = queryOrderBy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[")
		.append(this.getClass()).append(" ")
		.append("当前用户=[").append(getQueryUser()).append("]")		
		.append("排序列=[").append(getQueryOrderBy()).append("]")
		.append("排序顺序=").append(getQueryOrder()).append("]")
		.append("]");
		return builder.toString();
	}

	@Override
	public User getQueryUser() {
		return queryUser;
	}

	@Override
	public void setQueryUser(User queryUser) {
		this.queryUser = queryUser;
	}
	
	protected String getQueryOrderColumn() {		
		return orderByColumnMap.get(getQueryOrderBy());
	}

	@Override
	public String getOrderByClause() {
		String column=getQueryOrderColumn();
		String order=getQueryOrder();
		if(column!=null && !column.isEmpty()){
			return column + ((order==null || order.isEmpty())? " asc" : " " + order);
		}
		return null;
	}
	protected abstract void buildOrderByColumnMap();
	
	@Override
	public void addLimits(String name, Object item){
		queryLimits.put(name, item);
	}

	@Override
	public void addLimits(Map<String,? extends Object> map){
		queryLimits.putAll(map);
	}

	@Override
	public Object getLimits(String name){
		return queryLimits.get(name);
	}

	@Override
	public void clearLimits(){
		queryLimits.clear();
	}
}
