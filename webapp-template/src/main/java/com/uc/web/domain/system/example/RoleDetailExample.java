package com.uc.web.domain.system.example;

import java.util.ArrayList;
import java.util.List;

import com.uc.web.domain.Example;

public class RoleDetailExample implements Example {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public RoleDetailExample() {
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

		public Criteria andRoleIdIsNull() {
			addCriterion("ROLE_ID is null");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNotNull() {
			addCriterion("ROLE_ID is not null");
			return (Criteria) this;
		}

		public Criteria andRoleIdEqualTo(String value) {
			addCriterion("ROLE_ID =", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotEqualTo(String value) {
			addCriterion("ROLE_ID <>", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThan(String value) {
			addCriterion("ROLE_ID >", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
			addCriterion("ROLE_ID >=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThan(String value) {
			addCriterion("ROLE_ID <", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThanOrEqualTo(String value) {
			addCriterion("ROLE_ID <=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLike(String value) {
			addCriterion("ROLE_ID like", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotLike(String value) {
			addCriterion("ROLE_ID not like", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdIn(List<String> values) {
			addCriterion("ROLE_ID in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotIn(List<String> values) {
			addCriterion("ROLE_ID not in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdBetween(String value1, String value2) {
			addCriterion("ROLE_ID between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotBetween(String value1, String value2) {
			addCriterion("ROLE_ID not between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleNameIsNull() {
			addCriterion("ROLE_NAME is null");
			return (Criteria) this;
		}

		public Criteria andRoleNameIsNotNull() {
			addCriterion("ROLE_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andRoleNameEqualTo(String value) {
			addCriterion("ROLE_NAME =", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotEqualTo(String value) {
			addCriterion("ROLE_NAME <>", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameGreaterThan(String value) {
			addCriterion("ROLE_NAME >", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
			addCriterion("ROLE_NAME >=", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameLessThan(String value) {
			addCriterion("ROLE_NAME <", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameLessThanOrEqualTo(String value) {
			addCriterion("ROLE_NAME <=", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameLike(String value) {
			addCriterion("ROLE_NAME like", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotLike(String value) {
			addCriterion("ROLE_NAME not like", value, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameIn(List<String> values) {
			addCriterion("ROLE_NAME in", values, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotIn(List<String> values) {
			addCriterion("ROLE_NAME not in", values, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameBetween(String value1, String value2) {
			addCriterion("ROLE_NAME between", value1, value2, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleNameNotBetween(String value1, String value2) {
			addCriterion("ROLE_NAME not between", value1, value2, "roleName");
			return (Criteria) this;
		}

		public Criteria andRoleDescIsNull() {
			addCriterion("ROLE_DESC is null");
			return (Criteria) this;
		}

		public Criteria andRoleDescIsNotNull() {
			addCriterion("ROLE_DESC is not null");
			return (Criteria) this;
		}

		public Criteria andRoleDescEqualTo(String value) {
			addCriterion("ROLE_DESC =", value, "roleDesc");
			return (Criteria) this;
		}

		public Criteria andRoleDescNotEqualTo(String value) {
			addCriterion("ROLE_DESC <>", value, "roleDesc");
			return (Criteria) this;
		}

		public Criteria andRoleDescGreaterThan(String value) {
			addCriterion("ROLE_DESC >", value, "roleDesc");
			return (Criteria) this;
		}

		public Criteria andRoleDescGreaterThanOrEqualTo(String value) {
			addCriterion("ROLE_DESC >=", value, "roleDesc");
			return (Criteria) this;
		}

		public Criteria andRoleDescLessThan(String value) {
			addCriterion("ROLE_DESC <", value, "roleDesc");
			return (Criteria) this;
		}

		public Criteria andRoleDescLessThanOrEqualTo(String value) {
			addCriterion("ROLE_DESC <=", value, "roleDesc");
			return (Criteria) this;
		}

		public Criteria andRoleDescLike(String value) {
			addCriterion("ROLE_DESC like", value, "roleDesc");
			return (Criteria) this;
		}

		public Criteria andRoleDescNotLike(String value) {
			addCriterion("ROLE_DESC not like", value, "roleDesc");
			return (Criteria) this;
		}

		public Criteria andRoleDescIn(List<String> values) {
			addCriterion("ROLE_DESC in", values, "roleDesc");
			return (Criteria) this;
		}

		public Criteria andRoleDescNotIn(List<String> values) {
			addCriterion("ROLE_DESC not in", values, "roleDesc");
			return (Criteria) this;
		}

		public Criteria andRoleDescBetween(String value1, String value2) {
			addCriterion("ROLE_DESC between", value1, value2, "roleDesc");
			return (Criteria) this;
		}

		public Criteria andRoleDescNotBetween(String value1, String value2) {
			addCriterion("ROLE_DESC not between", value1, value2, "roleDesc");
			return (Criteria) this;
		}

		public Criteria andValidIsNull() {
			addCriterion("VALID is null");
			return (Criteria) this;
		}

		public Criteria andValidIsNotNull() {
			addCriterion("VALID is not null");
			return (Criteria) this;
		}

		public Criteria andValidEqualTo(Boolean value) {
			addCriterion("VALID =", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotEqualTo(Boolean value) {
			addCriterion("VALID <>", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidGreaterThan(Boolean value) {
			addCriterion("VALID >", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidGreaterThanOrEqualTo(Boolean value) {
			addCriterion("VALID >=", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidLessThan(Boolean value) {
			addCriterion("VALID <", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidLessThanOrEqualTo(Boolean value) {
			addCriterion("VALID <=", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidIn(List<Boolean> values) {
			addCriterion("VALID in", values, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotIn(List<Boolean> values) {
			addCriterion("VALID not in", values, "valid");
			return (Criteria) this;
		}

		public Criteria andValidBetween(Boolean value1, Boolean value2) {
			addCriterion("VALID between", value1, value2, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotBetween(Boolean value1, Boolean value2) {
			addCriterion("VALID not between", value1, value2, "valid");
			return (Criteria) this;
		}

		public Criteria andIsInternalIsNull() {
			addCriterion("IS_INTERNAL is null");
			return (Criteria) this;
		}

		public Criteria andIsInternalIsNotNull() {
			addCriterion("IS_INTERNAL is not null");
			return (Criteria) this;
		}

		public Criteria andIsInternalEqualTo(Boolean value) {
			addCriterion("IS_INTERNAL =", value, "isInternal");
			return (Criteria) this;
		}

		public Criteria andIsInternalNotEqualTo(Boolean value) {
			addCriterion("IS_INTERNAL <>", value, "isInternal");
			return (Criteria) this;
		}

		public Criteria andIsInternalGreaterThan(Boolean value) {
			addCriterion("IS_INTERNAL >", value, "isInternal");
			return (Criteria) this;
		}

		public Criteria andIsInternalGreaterThanOrEqualTo(Boolean value) {
			addCriterion("IS_INTERNAL >=", value, "isInternal");
			return (Criteria) this;
		}

		public Criteria andIsInternalLessThan(Boolean value) {
			addCriterion("IS_INTERNAL <", value, "isInternal");
			return (Criteria) this;
		}

		public Criteria andIsInternalLessThanOrEqualTo(Boolean value) {
			addCriterion("IS_INTERNAL <=", value, "isInternal");
			return (Criteria) this;
		}

		public Criteria andIsInternalIn(List<Boolean> values) {
			addCriterion("IS_INTERNAL in", values, "isInternal");
			return (Criteria) this;
		}

		public Criteria andIsInternalNotIn(List<Boolean> values) {
			addCriterion("IS_INTERNAL not in", values, "isInternal");
			return (Criteria) this;
		}

		public Criteria andIsInternalBetween(Boolean value1, Boolean value2) {
			addCriterion("IS_INTERNAL between", value1, value2, "isInternal");
			return (Criteria) this;
		}

		public Criteria andIsInternalNotBetween(Boolean value1, Boolean value2) {
			addCriterion("IS_INTERNAL not between", value1, value2, "isInternal");
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