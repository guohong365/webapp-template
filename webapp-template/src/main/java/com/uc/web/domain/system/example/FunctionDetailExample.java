package com.uc.web.domain.system.example;

import java.util.ArrayList;
import java.util.List;

import com.uc.web.domain.Example;

public class FunctionDetailExample implements Example {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public FunctionDetailExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andFuncIdIsNull() {
			addCriterion("FUNC_ID is null");
			return (Criteria) this;
		}

		public Criteria andFuncIdIsNotNull() {
			addCriterion("FUNC_ID is not null");
			return (Criteria) this;
		}

		public Criteria andFuncIdEqualTo(String value) {
			addCriterion("FUNC_ID =", value, "funcId");
			return (Criteria) this;
		}

		public Criteria andFuncIdNotEqualTo(String value) {
			addCriterion("FUNC_ID <>", value, "funcId");
			return (Criteria) this;
		}

		public Criteria andFuncIdGreaterThan(String value) {
			addCriterion("FUNC_ID >", value, "funcId");
			return (Criteria) this;
		}

		public Criteria andFuncIdGreaterThanOrEqualTo(String value) {
			addCriterion("FUNC_ID >=", value, "funcId");
			return (Criteria) this;
		}

		public Criteria andFuncIdLessThan(String value) {
			addCriterion("FUNC_ID <", value, "funcId");
			return (Criteria) this;
		}

		public Criteria andFuncIdLessThanOrEqualTo(String value) {
			addCriterion("FUNC_ID <=", value, "funcId");
			return (Criteria) this;
		}

		public Criteria andFuncIdLike(String value) {
			addCriterion("FUNC_ID like", value, "funcId");
			return (Criteria) this;
		}

		public Criteria andFuncIdNotLike(String value) {
			addCriterion("FUNC_ID not like", value, "funcId");
			return (Criteria) this;
		}

		public Criteria andFuncIdIn(List<String> values) {
			addCriterion("FUNC_ID in", values, "funcId");
			return (Criteria) this;
		}

		public Criteria andFuncIdNotIn(List<String> values) {
			addCriterion("FUNC_ID not in", values, "funcId");
			return (Criteria) this;
		}

		public Criteria andFuncIdBetween(String value1, String value2) {
			addCriterion("FUNC_ID between", value1, value2, "funcId");
			return (Criteria) this;
		}

		public Criteria andFuncIdNotBetween(String value1, String value2) {
			addCriterion("FUNC_ID not between", value1, value2, "funcId");
			return (Criteria) this;
		}

		public Criteria andFuncNameIsNull() {
			addCriterion("FUNC_NAME is null");
			return (Criteria) this;
		}

		public Criteria andFuncNameIsNotNull() {
			addCriterion("FUNC_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andFuncNameEqualTo(String value) {
			addCriterion("FUNC_NAME =", value, "funcName");
			return (Criteria) this;
		}

		public Criteria andFuncNameNotEqualTo(String value) {
			addCriterion("FUNC_NAME <>", value, "funcName");
			return (Criteria) this;
		}

		public Criteria andFuncNameGreaterThan(String value) {
			addCriterion("FUNC_NAME >", value, "funcName");
			return (Criteria) this;
		}

		public Criteria andFuncNameGreaterThanOrEqualTo(String value) {
			addCriterion("FUNC_NAME >=", value, "funcName");
			return (Criteria) this;
		}

		public Criteria andFuncNameLessThan(String value) {
			addCriterion("FUNC_NAME <", value, "funcName");
			return (Criteria) this;
		}

		public Criteria andFuncNameLessThanOrEqualTo(String value) {
			addCriterion("FUNC_NAME <=", value, "funcName");
			return (Criteria) this;
		}

		public Criteria andFuncNameLike(String value) {
			addCriterion("FUNC_NAME like", value, "funcName");
			return (Criteria) this;
		}

		public Criteria andFuncNameNotLike(String value) {
			addCriterion("FUNC_NAME not like", value, "funcName");
			return (Criteria) this;
		}

		public Criteria andFuncNameIn(List<String> values) {
			addCriterion("FUNC_NAME in", values, "funcName");
			return (Criteria) this;
		}

		public Criteria andFuncNameNotIn(List<String> values) {
			addCriterion("FUNC_NAME not in", values, "funcName");
			return (Criteria) this;
		}

		public Criteria andFuncNameBetween(String value1, String value2) {
			addCriterion("FUNC_NAME between", value1, value2, "funcName");
			return (Criteria) this;
		}

		public Criteria andFuncNameNotBetween(String value1, String value2) {
			addCriterion("FUNC_NAME not between", value1, value2, "funcName");
			return (Criteria) this;
		}

		public Criteria andFuncUriIsNull() {
			addCriterion("FUNC_URI is null");
			return (Criteria) this;
		}

		public Criteria andFuncUriIsNotNull() {
			addCriterion("FUNC_URI is not null");
			return (Criteria) this;
		}

		public Criteria andFuncUriEqualTo(String value) {
			addCriterion("FUNC_URI =", value, "funcUri");
			return (Criteria) this;
		}

		public Criteria andFuncUriNotEqualTo(String value) {
			addCriterion("FUNC_URI <>", value, "funcUri");
			return (Criteria) this;
		}

		public Criteria andFuncUriGreaterThan(String value) {
			addCriterion("FUNC_URI >", value, "funcUri");
			return (Criteria) this;
		}

		public Criteria andFuncUriGreaterThanOrEqualTo(String value) {
			addCriterion("FUNC_URI >=", value, "funcUri");
			return (Criteria) this;
		}

		public Criteria andFuncUriLessThan(String value) {
			addCriterion("FUNC_URI <", value, "funcUri");
			return (Criteria) this;
		}

		public Criteria andFuncUriLessThanOrEqualTo(String value) {
			addCriterion("FUNC_URI <=", value, "funcUri");
			return (Criteria) this;
		}

		public Criteria andFuncUriLike(String value) {
			addCriterion("FUNC_URI like", value, "funcUri");
			return (Criteria) this;
		}

		public Criteria andFuncUriNotLike(String value) {
			addCriterion("FUNC_URI not like", value, "funcUri");
			return (Criteria) this;
		}

		public Criteria andFuncUriIn(List<String> values) {
			addCriterion("FUNC_URI in", values, "funcUri");
			return (Criteria) this;
		}

		public Criteria andFuncUriNotIn(List<String> values) {
			addCriterion("FUNC_URI not in", values, "funcUri");
			return (Criteria) this;
		}

		public Criteria andFuncUriBetween(String value1, String value2) {
			addCriterion("FUNC_URI between", value1, value2, "funcUri");
			return (Criteria) this;
		}

		public Criteria andFuncUriNotBetween(String value1, String value2) {
			addCriterion("FUNC_URI not between", value1, value2, "funcUri");
			return (Criteria) this;
		}

		public Criteria andFuncDescIsNull() {
			addCriterion("FUNC_DESC is null");
			return (Criteria) this;
		}

		public Criteria andFuncDescIsNotNull() {
			addCriterion("FUNC_DESC is not null");
			return (Criteria) this;
		}

		public Criteria andFuncDescEqualTo(String value) {
			addCriterion("FUNC_DESC =", value, "funcDesc");
			return (Criteria) this;
		}

		public Criteria andFuncDescNotEqualTo(String value) {
			addCriterion("FUNC_DESC <>", value, "funcDesc");
			return (Criteria) this;
		}

		public Criteria andFuncDescGreaterThan(String value) {
			addCriterion("FUNC_DESC >", value, "funcDesc");
			return (Criteria) this;
		}

		public Criteria andFuncDescGreaterThanOrEqualTo(String value) {
			addCriterion("FUNC_DESC >=", value, "funcDesc");
			return (Criteria) this;
		}

		public Criteria andFuncDescLessThan(String value) {
			addCriterion("FUNC_DESC <", value, "funcDesc");
			return (Criteria) this;
		}

		public Criteria andFuncDescLessThanOrEqualTo(String value) {
			addCriterion("FUNC_DESC <=", value, "funcDesc");
			return (Criteria) this;
		}

		public Criteria andFuncDescLike(String value) {
			addCriterion("FUNC_DESC like", value, "funcDesc");
			return (Criteria) this;
		}

		public Criteria andFuncDescNotLike(String value) {
			addCriterion("FUNC_DESC not like", value, "funcDesc");
			return (Criteria) this;
		}

		public Criteria andFuncDescIn(List<String> values) {
			addCriterion("FUNC_DESC in", values, "funcDesc");
			return (Criteria) this;
		}

		public Criteria andFuncDescNotIn(List<String> values) {
			addCriterion("FUNC_DESC not in", values, "funcDesc");
			return (Criteria) this;
		}

		public Criteria andFuncDescBetween(String value1, String value2) {
			addCriterion("FUNC_DESC between", value1, value2, "funcDesc");
			return (Criteria) this;
		}

		public Criteria andFuncDescNotBetween(String value1, String value2) {
			addCriterion("FUNC_DESC not between", value1, value2, "funcDesc");
			return (Criteria) this;
		}

		public Criteria andEnableFlagIsNull() {
			addCriterion("ENABLE_FLAG is null");
			return (Criteria) this;
		}

		public Criteria andEnableFlagIsNotNull() {
			addCriterion("ENABLE_FLAG is not null");
			return (Criteria) this;
		}

		public Criteria andEnableFlagEqualTo(Boolean value) {
			addCriterion("ENABLE_FLAG =", value, "enableFlag");
			return (Criteria) this;
		}

		public Criteria andEnableFlagNotEqualTo(Boolean value) {
			addCriterion("ENABLE_FLAG <>", value, "enableFlag");
			return (Criteria) this;
		}

		public Criteria andEnableFlagGreaterThan(Boolean value) {
			addCriterion("ENABLE_FLAG >", value, "enableFlag");
			return (Criteria) this;
		}

		public Criteria andEnableFlagGreaterThanOrEqualTo(Boolean value) {
			addCriterion("ENABLE_FLAG >=", value, "enableFlag");
			return (Criteria) this;
		}

		public Criteria andEnableFlagLessThan(Boolean value) {
			addCriterion("ENABLE_FLAG <", value, "enableFlag");
			return (Criteria) this;
		}

		public Criteria andEnableFlagLessThanOrEqualTo(Boolean value) {
			addCriterion("ENABLE_FLAG <=", value, "enableFlag");
			return (Criteria) this;
		}

		public Criteria andEnableFlagIn(List<Boolean> values) {
			addCriterion("ENABLE_FLAG in", values, "enableFlag");
			return (Criteria) this;
		}

		public Criteria andEnableFlagNotIn(List<Boolean> values) {
			addCriterion("ENABLE_FLAG not in", values, "enableFlag");
			return (Criteria) this;
		}

		public Criteria andEnableFlagBetween(Boolean value1, Boolean value2) {
			addCriterion("ENABLE_FLAG between", value1, value2, "enableFlag");
			return (Criteria) this;
		}

		public Criteria andEnableFlagNotBetween(Boolean value1, Boolean value2) {
			addCriterion("ENABLE_FLAG not between", value1, value2, "enableFlag");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternIsNull() {
			addCriterion("FUNC_URI_PATTERN is null");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternIsNotNull() {
			addCriterion("FUNC_URI_PATTERN is not null");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternEqualTo(String value) {
			addCriterion("FUNC_URI_PATTERN =", value, "funcUriPattern");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternNotEqualTo(String value) {
			addCriterion("FUNC_URI_PATTERN <>", value, "funcUriPattern");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternGreaterThan(String value) {
			addCriterion("FUNC_URI_PATTERN >", value, "funcUriPattern");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternGreaterThanOrEqualTo(String value) {
			addCriterion("FUNC_URI_PATTERN >=", value, "funcUriPattern");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternLessThan(String value) {
			addCriterion("FUNC_URI_PATTERN <", value, "funcUriPattern");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternLessThanOrEqualTo(String value) {
			addCriterion("FUNC_URI_PATTERN <=", value, "funcUriPattern");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternLike(String value) {
			addCriterion("FUNC_URI_PATTERN like", value, "funcUriPattern");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternNotLike(String value) {
			addCriterion("FUNC_URI_PATTERN not like", value, "funcUriPattern");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternIn(List<String> values) {
			addCriterion("FUNC_URI_PATTERN in", values, "funcUriPattern");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternNotIn(List<String> values) {
			addCriterion("FUNC_URI_PATTERN not in", values, "funcUriPattern");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternBetween(String value1, String value2) {
			addCriterion("FUNC_URI_PATTERN between", value1, value2, "funcUriPattern");
			return (Criteria) this;
		}

		public Criteria andFuncUriPatternNotBetween(String value1, String value2) {
			addCriterion("FUNC_URI_PATTERN not between", value1, value2, "funcUriPattern");
			return (Criteria) this;
		}
	}

	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}