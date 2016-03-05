package com.uc.web.domain.system.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.uc.web.domain.Example;

public class OrgnizationDetailExample implements Example {

	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;
	public OrgnizationDetailExample() {
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

		public Criteria andOrgIdIsNull() {
			addCriterion("ORG_ID is null");
			return (Criteria) this;
		}

		public Criteria andOrgIdIsNotNull() {
			addCriterion("ORG_ID is not null");
			return (Criteria) this;
		}

		public Criteria andOrgIdEqualTo(String value) {
			addCriterion("ORG_ID =", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotEqualTo(String value) {
			addCriterion("ORG_ID <>", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdGreaterThan(String value) {
			addCriterion("ORG_ID >", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
			addCriterion("ORG_ID >=", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLessThan(String value) {
			addCriterion("ORG_ID <", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLessThanOrEqualTo(String value) {
			addCriterion("ORG_ID <=", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdLike(String value) {
			addCriterion("ORG_ID like", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotLike(String value) {
			addCriterion("ORG_ID not like", value, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdIn(List<String> values) {
			addCriterion("ORG_ID in", values, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotIn(List<String> values) {
			addCriterion("ORG_ID not in", values, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdBetween(String value1, String value2) {
			addCriterion("ORG_ID between", value1, value2, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgIdNotBetween(String value1, String value2) {
			addCriterion("ORG_ID not between", value1, value2, "orgId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdIsNull() {
			addCriterion("ORG_PARENT_ID is null");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdIsNotNull() {
			addCriterion("ORG_PARENT_ID is not null");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdEqualTo(String value) {
			addCriterion("ORG_PARENT_ID =", value, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdNotEqualTo(String value) {
			addCriterion("ORG_PARENT_ID <>", value, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdGreaterThan(String value) {
			addCriterion("ORG_PARENT_ID >", value, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdGreaterThanOrEqualTo(String value) {
			addCriterion("ORG_PARENT_ID >=", value, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdLessThan(String value) {
			addCriterion("ORG_PARENT_ID <", value, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdLessThanOrEqualTo(String value) {
			addCriterion("ORG_PARENT_ID <=", value, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdLike(String value) {
			addCriterion("ORG_PARENT_ID like", value, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdNotLike(String value) {
			addCriterion("ORG_PARENT_ID not like", value, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdIn(List<String> values) {
			addCriterion("ORG_PARENT_ID in", values, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdNotIn(List<String> values) {
			addCriterion("ORG_PARENT_ID not in", values, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdBetween(String value1, String value2) {
			addCriterion("ORG_PARENT_ID between", value1, value2, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdNotBetween(String value1, String value2) {
			addCriterion("ORG_PARENT_ID not between", value1, value2, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgNameIsNull() {
			addCriterion("ORG_NAME is null");
			return (Criteria) this;
		}

		public Criteria andOrgNameIsNotNull() {
			addCriterion("ORG_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andOrgNameEqualTo(String value) {
			addCriterion("ORG_NAME =", value, "orgName");
			return (Criteria) this;
		}

		public Criteria andOrgNameNotEqualTo(String value) {
			addCriterion("ORG_NAME <>", value, "orgName");
			return (Criteria) this;
		}

		public Criteria andOrgNameGreaterThan(String value) {
			addCriterion("ORG_NAME >", value, "orgName");
			return (Criteria) this;
		}

		public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
			addCriterion("ORG_NAME >=", value, "orgName");
			return (Criteria) this;
		}

		public Criteria andOrgNameLessThan(String value) {
			addCriterion("ORG_NAME <", value, "orgName");
			return (Criteria) this;
		}

		public Criteria andOrgNameLessThanOrEqualTo(String value) {
			addCriterion("ORG_NAME <=", value, "orgName");
			return (Criteria) this;
		}

		public Criteria andOrgNameLike(String value) {
			addCriterion("ORG_NAME like", value, "orgName");
			return (Criteria) this;
		}

		public Criteria andOrgNameNotLike(String value) {
			addCriterion("ORG_NAME not like", value, "orgName");
			return (Criteria) this;
		}

		public Criteria andOrgNameIn(List<String> values) {
			addCriterion("ORG_NAME in", values, "orgName");
			return (Criteria) this;
		}

		public Criteria andOrgNameNotIn(List<String> values) {
			addCriterion("ORG_NAME not in", values, "orgName");
			return (Criteria) this;
		}

		public Criteria andOrgNameBetween(String value1, String value2) {
			addCriterion("ORG_NAME between", value1, value2, "orgName");
			return (Criteria) this;
		}

		public Criteria andOrgNameNotBetween(String value1, String value2) {
			addCriterion("ORG_NAME not between", value1, value2, "orgName");
			return (Criteria) this;
		}

		public Criteria andOrgLevelIsNull() {
			addCriterion("ORG_LEVEL is null");
			return (Criteria) this;
		}

		public Criteria andOrgLevelIsNotNull() {
			addCriterion("ORG_LEVEL is not null");
			return (Criteria) this;
		}

		public Criteria andOrgLevelEqualTo(Integer value) {
			addCriterion("ORG_LEVEL =", value, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelNotEqualTo(Integer value) {
			addCriterion("ORG_LEVEL <>", value, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelGreaterThan(Integer value) {
			addCriterion("ORG_LEVEL >", value, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelGreaterThanOrEqualTo(Integer value) {
			addCriterion("ORG_LEVEL >=", value, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelLessThan(Integer value) {
			addCriterion("ORG_LEVEL <", value, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelLessThanOrEqualTo(Integer value) {
			addCriterion("ORG_LEVEL <=", value, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelIn(List<Integer> values) {
			addCriterion("ORG_LEVEL in", values, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelNotIn(List<Integer> values) {
			addCriterion("ORG_LEVEL not in", values, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelBetween(Integer value1, Integer value2) {
			addCriterion("ORG_LEVEL between", value1, value2, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgLevelNotBetween(Integer value1, Integer value2) {
			addCriterion("ORG_LEVEL not between", value1, value2, "orgLevel");
			return (Criteria) this;
		}

		public Criteria andOrgTypeIsNull() {
			addCriterion("ORG_TYPE is null");
			return (Criteria) this;
		}

		public Criteria andOrgTypeIsNotNull() {
			addCriterion("ORG_TYPE is not null");
			return (Criteria) this;
		}

		public Criteria andOrgTypeEqualTo(String value) {
			addCriterion("ORG_TYPE =", value, "orgType");
			return (Criteria) this;
		}

		public Criteria andOrgTypeNotEqualTo(String value) {
			addCriterion("ORG_TYPE <>", value, "orgType");
			return (Criteria) this;
		}

		public Criteria andOrgTypeGreaterThan(String value) {
			addCriterion("ORG_TYPE >", value, "orgType");
			return (Criteria) this;
		}

		public Criteria andOrgTypeGreaterThanOrEqualTo(String value) {
			addCriterion("ORG_TYPE >=", value, "orgType");
			return (Criteria) this;
		}

		public Criteria andOrgTypeLessThan(String value) {
			addCriterion("ORG_TYPE <", value, "orgType");
			return (Criteria) this;
		}

		public Criteria andOrgTypeLessThanOrEqualTo(String value) {
			addCriterion("ORG_TYPE <=", value, "orgType");
			return (Criteria) this;
		}

		public Criteria andOrgTypeLike(String value) {
			addCriterion("ORG_TYPE like", value, "orgType");
			return (Criteria) this;
		}

		public Criteria andOrgTypeNotLike(String value) {
			addCriterion("ORG_TYPE not like", value, "orgType");
			return (Criteria) this;
		}

		public Criteria andOrgTypeIn(List<String> values) {
			addCriterion("ORG_TYPE in", values, "orgType");
			return (Criteria) this;
		}

		public Criteria andOrgTypeNotIn(List<String> values) {
			addCriterion("ORG_TYPE not in", values, "orgType");
			return (Criteria) this;
		}

		public Criteria andOrgTypeBetween(String value1, String value2) {
			addCriterion("ORG_TYPE between", value1, value2, "orgType");
			return (Criteria) this;
		}

		public Criteria andOrgTypeNotBetween(String value1, String value2) {
			addCriterion("ORG_TYPE not between", value1, value2, "orgType");
			return (Criteria) this;
		}

		public Criteria andOrgAreaIsNull() {
			addCriterion("ORG_AREA is null");
			return (Criteria) this;
		}

		public Criteria andOrgAreaIsNotNull() {
			addCriterion("ORG_AREA is not null");
			return (Criteria) this;
		}

		public Criteria andOrgAreaEqualTo(String value) {
			addCriterion("ORG_AREA =", value, "orgArea");
			return (Criteria) this;
		}

		public Criteria andOrgAreaNotEqualTo(String value) {
			addCriterion("ORG_AREA <>", value, "orgArea");
			return (Criteria) this;
		}

		public Criteria andOrgAreaGreaterThan(String value) {
			addCriterion("ORG_AREA >", value, "orgArea");
			return (Criteria) this;
		}

		public Criteria andOrgAreaGreaterThanOrEqualTo(String value) {
			addCriterion("ORG_AREA >=", value, "orgArea");
			return (Criteria) this;
		}

		public Criteria andOrgAreaLessThan(String value) {
			addCriterion("ORG_AREA <", value, "orgArea");
			return (Criteria) this;
		}

		public Criteria andOrgAreaLessThanOrEqualTo(String value) {
			addCriterion("ORG_AREA <=", value, "orgArea");
			return (Criteria) this;
		}

		public Criteria andOrgAreaLike(String value) {
			addCriterion("ORG_AREA like", value, "orgArea");
			return (Criteria) this;
		}

		public Criteria andOrgAreaNotLike(String value) {
			addCriterion("ORG_AREA not like", value, "orgArea");
			return (Criteria) this;
		}

		public Criteria andOrgAreaIn(List<String> values) {
			addCriterion("ORG_AREA in", values, "orgArea");
			return (Criteria) this;
		}

		public Criteria andOrgAreaNotIn(List<String> values) {
			addCriterion("ORG_AREA not in", values, "orgArea");
			return (Criteria) this;
		}

		public Criteria andOrgAreaBetween(String value1, String value2) {
			addCriterion("ORG_AREA between", value1, value2, "orgArea");
			return (Criteria) this;
		}

		public Criteria andOrgAreaNotBetween(String value1, String value2) {
			addCriterion("ORG_AREA not between", value1, value2, "orgArea");
			return (Criteria) this;
		}

		public Criteria andOrgAddrIsNull() {
			addCriterion("ORG_ADDR is null");
			return (Criteria) this;
		}

		public Criteria andOrgAddrIsNotNull() {
			addCriterion("ORG_ADDR is not null");
			return (Criteria) this;
		}

		public Criteria andOrgAddrEqualTo(String value) {
			addCriterion("ORG_ADDR =", value, "orgAddr");
			return (Criteria) this;
		}

		public Criteria andOrgAddrNotEqualTo(String value) {
			addCriterion("ORG_ADDR <>", value, "orgAddr");
			return (Criteria) this;
		}

		public Criteria andOrgAddrGreaterThan(String value) {
			addCriterion("ORG_ADDR >", value, "orgAddr");
			return (Criteria) this;
		}

		public Criteria andOrgAddrGreaterThanOrEqualTo(String value) {
			addCriterion("ORG_ADDR >=", value, "orgAddr");
			return (Criteria) this;
		}

		public Criteria andOrgAddrLessThan(String value) {
			addCriterion("ORG_ADDR <", value, "orgAddr");
			return (Criteria) this;
		}

		public Criteria andOrgAddrLessThanOrEqualTo(String value) {
			addCriterion("ORG_ADDR <=", value, "orgAddr");
			return (Criteria) this;
		}

		public Criteria andOrgAddrLike(String value) {
			addCriterion("ORG_ADDR like", value, "orgAddr");
			return (Criteria) this;
		}

		public Criteria andOrgAddrNotLike(String value) {
			addCriterion("ORG_ADDR not like", value, "orgAddr");
			return (Criteria) this;
		}

		public Criteria andOrgAddrIn(List<String> values) {
			addCriterion("ORG_ADDR in", values, "orgAddr");
			return (Criteria) this;
		}

		public Criteria andOrgAddrNotIn(List<String> values) {
			addCriterion("ORG_ADDR not in", values, "orgAddr");
			return (Criteria) this;
		}

		public Criteria andOrgAddrBetween(String value1, String value2) {
			addCriterion("ORG_ADDR between", value1, value2, "orgAddr");
			return (Criteria) this;
		}

		public Criteria andOrgAddrNotBetween(String value1, String value2) {
			addCriterion("ORG_ADDR not between", value1, value2, "orgAddr");
			return (Criteria) this;
		}

		public Criteria andOrgTeleIsNull() {
			addCriterion("ORG_TELE is null");
			return (Criteria) this;
		}

		public Criteria andOrgTeleIsNotNull() {
			addCriterion("ORG_TELE is not null");
			return (Criteria) this;
		}

		public Criteria andOrgTeleEqualTo(String value) {
			addCriterion("ORG_TELE =", value, "orgTele");
			return (Criteria) this;
		}

		public Criteria andOrgTeleNotEqualTo(String value) {
			addCriterion("ORG_TELE <>", value, "orgTele");
			return (Criteria) this;
		}

		public Criteria andOrgTeleGreaterThan(String value) {
			addCriterion("ORG_TELE >", value, "orgTele");
			return (Criteria) this;
		}

		public Criteria andOrgTeleGreaterThanOrEqualTo(String value) {
			addCriterion("ORG_TELE >=", value, "orgTele");
			return (Criteria) this;
		}

		public Criteria andOrgTeleLessThan(String value) {
			addCriterion("ORG_TELE <", value, "orgTele");
			return (Criteria) this;
		}

		public Criteria andOrgTeleLessThanOrEqualTo(String value) {
			addCriterion("ORG_TELE <=", value, "orgTele");
			return (Criteria) this;
		}

		public Criteria andOrgTeleLike(String value) {
			addCriterion("ORG_TELE like", value, "orgTele");
			return (Criteria) this;
		}

		public Criteria andOrgTeleNotLike(String value) {
			addCriterion("ORG_TELE not like", value, "orgTele");
			return (Criteria) this;
		}

		public Criteria andOrgTeleIn(List<String> values) {
			addCriterion("ORG_TELE in", values, "orgTele");
			return (Criteria) this;
		}

		public Criteria andOrgTeleNotIn(List<String> values) {
			addCriterion("ORG_TELE not in", values, "orgTele");
			return (Criteria) this;
		}

		public Criteria andOrgTeleBetween(String value1, String value2) {
			addCriterion("ORG_TELE between", value1, value2, "orgTele");
			return (Criteria) this;
		}

		public Criteria andOrgTeleNotBetween(String value1, String value2) {
			addCriterion("ORG_TELE not between", value1, value2, "orgTele");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanIsNull() {
			addCriterion("ORG_LINKMAN is null");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanIsNotNull() {
			addCriterion("ORG_LINKMAN is not null");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanEqualTo(String value) {
			addCriterion("ORG_LINKMAN =", value, "orgLinkman");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanNotEqualTo(String value) {
			addCriterion("ORG_LINKMAN <>", value, "orgLinkman");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanGreaterThan(String value) {
			addCriterion("ORG_LINKMAN >", value, "orgLinkman");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanGreaterThanOrEqualTo(String value) {
			addCriterion("ORG_LINKMAN >=", value, "orgLinkman");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanLessThan(String value) {
			addCriterion("ORG_LINKMAN <", value, "orgLinkman");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanLessThanOrEqualTo(String value) {
			addCriterion("ORG_LINKMAN <=", value, "orgLinkman");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanLike(String value) {
			addCriterion("ORG_LINKMAN like", value, "orgLinkman");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanNotLike(String value) {
			addCriterion("ORG_LINKMAN not like", value, "orgLinkman");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanIn(List<String> values) {
			addCriterion("ORG_LINKMAN in", values, "orgLinkman");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanNotIn(List<String> values) {
			addCriterion("ORG_LINKMAN not in", values, "orgLinkman");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanBetween(String value1, String value2) {
			addCriterion("ORG_LINKMAN between", value1, value2, "orgLinkman");
			return (Criteria) this;
		}

		public Criteria andOrgLinkmanNotBetween(String value1, String value2) {
			addCriterion("ORG_LINKMAN not between", value1, value2, "orgLinkman");
			return (Criteria) this;
		}

		public Criteria andOrgDescIsNull() {
			addCriterion("ORG_DESC is null");
			return (Criteria) this;
		}

		public Criteria andOrgDescIsNotNull() {
			addCriterion("ORG_DESC is not null");
			return (Criteria) this;
		}

		public Criteria andOrgDescEqualTo(String value) {
			addCriterion("ORG_DESC =", value, "orgDesc");
			return (Criteria) this;
		}

		public Criteria andOrgDescNotEqualTo(String value) {
			addCriterion("ORG_DESC <>", value, "orgDesc");
			return (Criteria) this;
		}

		public Criteria andOrgDescGreaterThan(String value) {
			addCriterion("ORG_DESC >", value, "orgDesc");
			return (Criteria) this;
		}

		public Criteria andOrgDescGreaterThanOrEqualTo(String value) {
			addCriterion("ORG_DESC >=", value, "orgDesc");
			return (Criteria) this;
		}

		public Criteria andOrgDescLessThan(String value) {
			addCriterion("ORG_DESC <", value, "orgDesc");
			return (Criteria) this;
		}

		public Criteria andOrgDescLessThanOrEqualTo(String value) {
			addCriterion("ORG_DESC <=", value, "orgDesc");
			return (Criteria) this;
		}

		public Criteria andOrgDescLike(String value) {
			addCriterion("ORG_DESC like", value, "orgDesc");
			return (Criteria) this;
		}

		public Criteria andOrgDescNotLike(String value) {
			addCriterion("ORG_DESC not like", value, "orgDesc");
			return (Criteria) this;
		}

		public Criteria andOrgDescIn(List<String> values) {
			addCriterion("ORG_DESC in", values, "orgDesc");
			return (Criteria) this;
		}

		public Criteria andOrgDescNotIn(List<String> values) {
			addCriterion("ORG_DESC not in", values, "orgDesc");
			return (Criteria) this;
		}

		public Criteria andOrgDescBetween(String value1, String value2) {
			addCriterion("ORG_DESC between", value1, value2, "orgDesc");
			return (Criteria) this;
		}

		public Criteria andOrgDescNotBetween(String value1, String value2) {
			addCriterion("ORG_DESC not between", value1, value2, "orgDesc");
			return (Criteria) this;
		}

		public Criteria andOrgDelFlagIsNull() {
			addCriterion("ORG_DEL_FLAG is null");
			return (Criteria) this;
		}

		public Criteria andOrgDelFlagIsNotNull() {
			addCriterion("ORG_DEL_FLAG is not null");
			return (Criteria) this;
		}

		public Criteria andOrgDelFlagEqualTo(Boolean value) {
			addCriterion("ORG_DEL_FLAG =", value, "orgDelFlag");
			return (Criteria) this;
		}

		public Criteria andOrgDelFlagNotEqualTo(Boolean value) {
			addCriterion("ORG_DEL_FLAG <>", value, "orgDelFlag");
			return (Criteria) this;
		}

		public Criteria andOrgDelFlagGreaterThan(Boolean value) {
			addCriterion("ORG_DEL_FLAG >", value, "orgDelFlag");
			return (Criteria) this;
		}

		public Criteria andOrgDelFlagGreaterThanOrEqualTo(Boolean value) {
			addCriterion("ORG_DEL_FLAG >=", value, "orgDelFlag");
			return (Criteria) this;
		}

		public Criteria andOrgDelFlagLessThan(Boolean value) {
			addCriterion("ORG_DEL_FLAG <", value, "orgDelFlag");
			return (Criteria) this;
		}

		public Criteria andOrgDelFlagLessThanOrEqualTo(Boolean value) {
			addCriterion("ORG_DEL_FLAG <=", value, "orgDelFlag");
			return (Criteria) this;
		}

		public Criteria andOrgDelFlagIn(List<Boolean> values) {
			addCriterion("ORG_DEL_FLAG in", values, "orgDelFlag");
			return (Criteria) this;
		}

		public Criteria andOrgDelFlagNotIn(List<Boolean> values) {
			addCriterion("ORG_DEL_FLAG not in", values, "orgDelFlag");
			return (Criteria) this;
		}

		public Criteria andOrgDelFlagBetween(Boolean value1, Boolean value2) {
			addCriterion("ORG_DEL_FLAG between", value1, value2, "orgDelFlag");
			return (Criteria) this;
		}

		public Criteria andOrgDelFlagNotBetween(Boolean value1, Boolean value2) {
			addCriterion("ORG_DEL_FLAG not between", value1, value2, "orgDelFlag");
			return (Criteria) this;
		}

		public Criteria andOrgCityIsNull() {
			addCriterion("ORG_CITY is null");
			return (Criteria) this;
		}

		public Criteria andOrgCityIsNotNull() {
			addCriterion("ORG_CITY is not null");
			return (Criteria) this;
		}

		public Criteria andOrgCityEqualTo(String value) {
			addCriterion("ORG_CITY =", value, "orgCity");
			return (Criteria) this;
		}

		public Criteria andOrgCityNotEqualTo(String value) {
			addCriterion("ORG_CITY <>", value, "orgCity");
			return (Criteria) this;
		}

		public Criteria andOrgCityGreaterThan(String value) {
			addCriterion("ORG_CITY >", value, "orgCity");
			return (Criteria) this;
		}

		public Criteria andOrgCityGreaterThanOrEqualTo(String value) {
			addCriterion("ORG_CITY >=", value, "orgCity");
			return (Criteria) this;
		}

		public Criteria andOrgCityLessThan(String value) {
			addCriterion("ORG_CITY <", value, "orgCity");
			return (Criteria) this;
		}

		public Criteria andOrgCityLessThanOrEqualTo(String value) {
			addCriterion("ORG_CITY <=", value, "orgCity");
			return (Criteria) this;
		}

		public Criteria andOrgCityLike(String value) {
			addCriterion("ORG_CITY like", value, "orgCity");
			return (Criteria) this;
		}

		public Criteria andOrgCityNotLike(String value) {
			addCriterion("ORG_CITY not like", value, "orgCity");
			return (Criteria) this;
		}

		public Criteria andOrgCityIn(List<String> values) {
			addCriterion("ORG_CITY in", values, "orgCity");
			return (Criteria) this;
		}

		public Criteria andOrgCityNotIn(List<String> values) {
			addCriterion("ORG_CITY not in", values, "orgCity");
			return (Criteria) this;
		}

		public Criteria andOrgCityBetween(String value1, String value2) {
			addCriterion("ORG_CITY between", value1, value2, "orgCity");
			return (Criteria) this;
		}

		public Criteria andOrgCityNotBetween(String value1, String value2) {
			addCriterion("ORG_CITY not between", value1, value2, "orgCity");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixIsNull() {
			addCriterion("ORG_PREFIX is null");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixIsNotNull() {
			addCriterion("ORG_PREFIX is not null");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixEqualTo(String value) {
			addCriterion("ORG_PREFIX =", value, "orgPrefix");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixNotEqualTo(String value) {
			addCriterion("ORG_PREFIX <>", value, "orgPrefix");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixGreaterThan(String value) {
			addCriterion("ORG_PREFIX >", value, "orgPrefix");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixGreaterThanOrEqualTo(String value) {
			addCriterion("ORG_PREFIX >=", value, "orgPrefix");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixLessThan(String value) {
			addCriterion("ORG_PREFIX <", value, "orgPrefix");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixLessThanOrEqualTo(String value) {
			addCriterion("ORG_PREFIX <=", value, "orgPrefix");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixLike(String value) {
			addCriterion("ORG_PREFIX like", value, "orgPrefix");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixNotLike(String value) {
			addCriterion("ORG_PREFIX not like", value, "orgPrefix");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixIn(List<String> values) {
			addCriterion("ORG_PREFIX in", values, "orgPrefix");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixNotIn(List<String> values) {
			addCriterion("ORG_PREFIX not in", values, "orgPrefix");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixBetween(String value1, String value2) {
			addCriterion("ORG_PREFIX between", value1, value2, "orgPrefix");
			return (Criteria) this;
		}

		public Criteria andOrgPrefixNotBetween(String value1, String value2) {
			addCriterion("ORG_PREFIX not between", value1, value2, "orgPrefix");
			return (Criteria) this;
		}

		public Criteria andCreatorIsNull() {
			addCriterion("CREATOR is null");
			return (Criteria) this;
		}

		public Criteria andCreatorIsNotNull() {
			addCriterion("CREATOR is not null");
			return (Criteria) this;
		}

		public Criteria andCreatorEqualTo(String value) {
			addCriterion("CREATOR =", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorNotEqualTo(String value) {
			addCriterion("CREATOR <>", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorGreaterThan(String value) {
			addCriterion("CREATOR >", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorGreaterThanOrEqualTo(String value) {
			addCriterion("CREATOR >=", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorLessThan(String value) {
			addCriterion("CREATOR <", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorLessThanOrEqualTo(String value) {
			addCriterion("CREATOR <=", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorLike(String value) {
			addCriterion("CREATOR like", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorNotLike(String value) {
			addCriterion("CREATOR not like", value, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorIn(List<String> values) {
			addCriterion("CREATOR in", values, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorNotIn(List<String> values) {
			addCriterion("CREATOR not in", values, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorBetween(String value1, String value2) {
			addCriterion("CREATOR between", value1, value2, "creator");
			return (Criteria) this;
		}

		public Criteria andCreatorNotBetween(String value1, String value2) {
			addCriterion("CREATOR not between", value1, value2, "creator");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("CREATE_TIME is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("CREATE_TIME is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("CREATE_TIME =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("CREATE_TIME <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("CREATE_TIME >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("CREATE_TIME >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("CREATE_TIME <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("CREATE_TIME <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("CREATE_TIME in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("CREATE_TIME not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("CREATE_TIME between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("CREATE_TIME not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameIsNull() {
			addCriterion("PARENT_ORG_NAME is null");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameIsNotNull() {
			addCriterion("PARENT_ORG_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameEqualTo(String value) {
			addCriterion("PARENT_ORG_NAME =", value, "parentOrgName");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameNotEqualTo(String value) {
			addCriterion("PARENT_ORG_NAME <>", value, "parentOrgName");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameGreaterThan(String value) {
			addCriterion("PARENT_ORG_NAME >", value, "parentOrgName");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameGreaterThanOrEqualTo(String value) {
			addCriterion("PARENT_ORG_NAME >=", value, "parentOrgName");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameLessThan(String value) {
			addCriterion("PARENT_ORG_NAME <", value, "parentOrgName");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameLessThanOrEqualTo(String value) {
			addCriterion("PARENT_ORG_NAME <=", value, "parentOrgName");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameLike(String value) {
			addCriterion("PARENT_ORG_NAME like", value, "parentOrgName");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameNotLike(String value) {
			addCriterion("PARENT_ORG_NAME not like", value, "parentOrgName");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameIn(List<String> values) {
			addCriterion("PARENT_ORG_NAME in", values, "parentOrgName");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameNotIn(List<String> values) {
			addCriterion("PARENT_ORG_NAME not in", values, "parentOrgName");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameBetween(String value1, String value2) {
			addCriterion("PARENT_ORG_NAME between", value1, value2, "parentOrgName");
			return (Criteria) this;
		}

		public Criteria andParentOrgNameNotBetween(String value1, String value2) {
			addCriterion("PARENT_ORG_NAME not between", value1, value2, "parentOrgName");
			return (Criteria) this;
		}

		public Criteria andCityNameIsNull() {
			addCriterion("CITY_NAME is null");
			return (Criteria) this;
		}

		public Criteria andCityNameIsNotNull() {
			addCriterion("CITY_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andCityNameEqualTo(String value) {
			addCriterion("CITY_NAME =", value, "cityName");
			return (Criteria) this;
		}

		public Criteria andCityNameNotEqualTo(String value) {
			addCriterion("CITY_NAME <>", value, "cityName");
			return (Criteria) this;
		}

		public Criteria andCityNameGreaterThan(String value) {
			addCriterion("CITY_NAME >", value, "cityName");
			return (Criteria) this;
		}

		public Criteria andCityNameGreaterThanOrEqualTo(String value) {
			addCriterion("CITY_NAME >=", value, "cityName");
			return (Criteria) this;
		}

		public Criteria andCityNameLessThan(String value) {
			addCriterion("CITY_NAME <", value, "cityName");
			return (Criteria) this;
		}

		public Criteria andCityNameLessThanOrEqualTo(String value) {
			addCriterion("CITY_NAME <=", value, "cityName");
			return (Criteria) this;
		}

		public Criteria andCityNameLike(String value) {
			addCriterion("CITY_NAME like", value, "cityName");
			return (Criteria) this;
		}

		public Criteria andCityNameNotLike(String value) {
			addCriterion("CITY_NAME not like", value, "cityName");
			return (Criteria) this;
		}

		public Criteria andCityNameIn(List<String> values) {
			addCriterion("CITY_NAME in", values, "cityName");
			return (Criteria) this;
		}

		public Criteria andCityNameNotIn(List<String> values) {
			addCriterion("CITY_NAME not in", values, "cityName");
			return (Criteria) this;
		}

		public Criteria andCityNameBetween(String value1, String value2) {
			addCriterion("CITY_NAME between", value1, value2, "cityName");
			return (Criteria) this;
		}

		public Criteria andCityNameNotBetween(String value1, String value2) {
			addCriterion("CITY_NAME not between", value1, value2, "cityName");
			return (Criteria) this;
		}

		public Criteria andAreaNameIsNull() {
			addCriterion("AREA_NAME is null");
			return (Criteria) this;
		}

		public Criteria andAreaNameIsNotNull() {
			addCriterion("AREA_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andAreaNameEqualTo(String value) {
			addCriterion("AREA_NAME =", value, "areaName");
			return (Criteria) this;
		}

		public Criteria andAreaNameNotEqualTo(String value) {
			addCriterion("AREA_NAME <>", value, "areaName");
			return (Criteria) this;
		}

		public Criteria andAreaNameGreaterThan(String value) {
			addCriterion("AREA_NAME >", value, "areaName");
			return (Criteria) this;
		}

		public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
			addCriterion("AREA_NAME >=", value, "areaName");
			return (Criteria) this;
		}

		public Criteria andAreaNameLessThan(String value) {
			addCriterion("AREA_NAME <", value, "areaName");
			return (Criteria) this;
		}

		public Criteria andAreaNameLessThanOrEqualTo(String value) {
			addCriterion("AREA_NAME <=", value, "areaName");
			return (Criteria) this;
		}

		public Criteria andAreaNameLike(String value) {
			addCriterion("AREA_NAME like", value, "areaName");
			return (Criteria) this;
		}

		public Criteria andAreaNameNotLike(String value) {
			addCriterion("AREA_NAME not like", value, "areaName");
			return (Criteria) this;
		}

		public Criteria andAreaNameIn(List<String> values) {
			addCriterion("AREA_NAME in", values, "areaName");
			return (Criteria) this;
		}

		public Criteria andAreaNameNotIn(List<String> values) {
			addCriterion("AREA_NAME not in", values, "areaName");
			return (Criteria) this;
		}

		public Criteria andAreaNameBetween(String value1, String value2) {
			addCriterion("AREA_NAME between", value1, value2, "areaName");
			return (Criteria) this;
		}

		public Criteria andAreaNameNotBetween(String value1, String value2) {
			addCriterion("AREA_NAME not between", value1, value2, "areaName");
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