package com.uc.web.service;

import java.util.ArrayList;
import java.util.List;

import com.uc.web.SystemConfig;
import com.uc.web.domain.Example;
import com.uc.web.forms.IPageCtrl;
import com.uc.web.forms.PageCtrl;
import com.uc.web.forms.QueryForm;
import com.uc.web.forms.WebListFormBase;
import com.uc.web.persistence.AppMapperBase;

public abstract class AbstractAppServiceImpl<QueryFormType extends QueryForm, DetailType, ExampleType extends Example> extends ServiceBase implements AppService<QueryFormType, DetailType> {
	
	public static final int DEFAULT_MAX_ROW = 10000;
	private AppMapperBase<QueryFormType, DetailType, ExampleType> detailMapper;
	
	protected abstract boolean prepareExample(QueryFormType queryForm, ExampleType example);
	protected abstract ExampleType newExample();
	
	protected boolean isOrderBy(QueryForm queryForm){
		return queryForm.getOrderByClause()!=null && !queryForm.getOrderByClause().isEmpty();
	}
	
	protected String getDefaultOrderByClause(){ 
		return null;
	};

	public void setDetailMapper(AppMapperBase<QueryFormType, DetailType, ExampleType> detailMapper) {
		this.detailMapper = detailMapper;
	}
	
	protected AppMapperBase<QueryFormType, DetailType, ExampleType> getDetailMapper() {
		return detailMapper;
	}

	@Override
	public void select(WebListFormBase<QueryFormType, DetailType> webForm) {
		QueryFormType queryForm=webForm.getQuery();
		IPageCtrl pageCtrl=webForm.getPageCtrl();
		ExampleType example=newExample();
		
		if(!prepareExample(queryForm, example)){
			PageCtrl.initPageCtrl(pageCtrl, 0);
			webForm.setData(new ArrayList<>());
			return;
		}
		
		if(pageCtrl.getTotal()==-1){ //Initial query
			int count=detailMapper.selectCountByExample(example);
			PageCtrl.initPageCtrl(pageCtrl, count);
			if(count==0){
				webForm.setData(new ArrayList<>());
				return;
			}
			example.setOrderByClause(getDefaultOrderByClause());
		} else {
			pageCtrl.setOffset(pageCtrl.getCurrent() * pageCtrl.getPageSize());
			example.setOrderByClause(queryForm.getOrderByClause());
		}
		
		List<DetailType> list=detailMapper.selectByExample(example, pageCtrl.getOffset(), pageCtrl.getPageSize());
		webForm.setData(list);		
	}

	@Override
	public List<DetailType> selectForExport(QueryFormType queryForm) {
		ExampleType example=newExample();
		if(!prepareExample(queryForm, example)){
			return new ArrayList<>();
		}
		int count=detailMapper.selectCountByExample(example);
		count = count > SystemConfig.getConfigInt("exportor.maxrow", DEFAULT_MAX_ROW) ? SystemConfig.getConfigInt("exportor.maxrow", DEFAULT_MAX_ROW) : count;
		return detailMapper.selectByExample(example, 0, count);
	}

	@Override
	public DetailType selectById(String selectedId) {
		return detailMapper.selectById(selectedId);
	}

	@Override
	public int insert(DetailType detail) {
		return detailMapper.insertDetail(detail);
	}

	@Override
	public int update(DetailType detail) {
		return detailMapper.updateDetail(detail);
	}

	@Override
	public int cancelateById(DetailType detail) {
		return detailMapper.updateDetailSelective(detail);
	}

	@Override
	public int deleteById(DetailType detail) {
		return detailMapper.deleteDetail(detail);
	}

	@Override
	public int activeById(DetailType detail) {
		return detailMapper.updateDetailSelective(detail);
	}

}
