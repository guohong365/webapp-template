package com.uc.web.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uc.web.domain.Example;
import com.uc.web.forms.QueryForm;

public interface AppMapperBase<QueryFormType extends QueryForm, DetailType extends Object, ExampleType extends Example> {
	DetailType selectById(String id);
	int selectCountByExample(ExampleType example);	
	List<DetailType> selectByExample(
			@Param("example")
			ExampleType example,
			@Param("offset")
			int offset,
			@Param("count")
			int count);
	int insertDetail(DetailType detail);
	int updateDetail(DetailType detail);
	int updateDetailSelective(DetailType detal);
	int deleteDetail(DetailType detail);
}
