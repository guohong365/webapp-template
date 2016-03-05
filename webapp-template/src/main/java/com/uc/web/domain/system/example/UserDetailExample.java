package com.uc.web.domain.system.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.uc.web.domain.Example;

public class UserDetailExample implements Example {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;


	public UserDetailExample() {
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

		public Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("ID =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("ID <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("ID >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("ID >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("ID <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("ID <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("ID like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("ID not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("ID in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("ID not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("ID between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("PASSWORD is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("PASSWORD is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("PASSWORD =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("PASSWORD <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("PASSWORD >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("PASSWORD >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("PASSWORD <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("PASSWORD <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("PASSWORD like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("PASSWORD not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("PASSWORD in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("PASSWORD not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("PASSWORD between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("PASSWORD not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("NAME is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("NAME is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("NAME =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("NAME <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("NAME >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("NAME >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("NAME <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("NAME <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("NAME like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("NAME not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("NAME in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("NAME not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("NAME between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("NAME not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andTeleIsNull() {
			addCriterion("TELE is null");
			return (Criteria) this;
		}

		public Criteria andTeleIsNotNull() {
			addCriterion("TELE is not null");
			return (Criteria) this;
		}

		public Criteria andTeleEqualTo(String value) {
			addCriterion("TELE =", value, "tele");
			return (Criteria) this;
		}

		public Criteria andTeleNotEqualTo(String value) {
			addCriterion("TELE <>", value, "tele");
			return (Criteria) this;
		}

		public Criteria andTeleGreaterThan(String value) {
			addCriterion("TELE >", value, "tele");
			return (Criteria) this;
		}

		public Criteria andTeleGreaterThanOrEqualTo(String value) {
			addCriterion("TELE >=", value, "tele");
			return (Criteria) this;
		}

		public Criteria andTeleLessThan(String value) {
			addCriterion("TELE <", value, "tele");
			return (Criteria) this;
		}

		public Criteria andTeleLessThanOrEqualTo(String value) {
			addCriterion("TELE <=", value, "tele");
			return (Criteria) this;
		}

		public Criteria andTeleLike(String value) {
			addCriterion("TELE like", value, "tele");
			return (Criteria) this;
		}

		public Criteria andTeleNotLike(String value) {
			addCriterion("TELE not like", value, "tele");
			return (Criteria) this;
		}

		public Criteria andTeleIn(List<String> values) {
			addCriterion("TELE in", values, "tele");
			return (Criteria) this;
		}

		public Criteria andTeleNotIn(List<String> values) {
			addCriterion("TELE not in", values, "tele");
			return (Criteria) this;
		}

		public Criteria andTeleBetween(String value1, String value2) {
			addCriterion("TELE between", value1, value2, "tele");
			return (Criteria) this;
		}

		public Criteria andTeleNotBetween(String value1, String value2) {
			addCriterion("TELE not between", value1, value2, "tele");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("EMAIL is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("EMAIL is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("EMAIL =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("EMAIL <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("EMAIL >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("EMAIL >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("EMAIL <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("EMAIL <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("EMAIL like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("EMAIL not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("EMAIL in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("EMAIL not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("EMAIL between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("EMAIL not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andAdminFlagIsNull() {
			addCriterion("ADMIN_FLAG is null");
			return (Criteria) this;
		}

		public Criteria andAdminFlagIsNotNull() {
			addCriterion("ADMIN_FLAG is not null");
			return (Criteria) this;
		}

		public Criteria andAdminFlagEqualTo(Boolean value) {
			addCriterion("ADMIN_FLAG =", value, "adminFlag");
			return (Criteria) this;
		}

		public Criteria andAdminFlagNotEqualTo(Boolean value) {
			addCriterion("ADMIN_FLAG <>", value, "adminFlag");
			return (Criteria) this;
		}

		public Criteria andAdminFlagGreaterThan(Boolean value) {
			addCriterion("ADMIN_FLAG >", value, "adminFlag");
			return (Criteria) this;
		}

		public Criteria andAdminFlagGreaterThanOrEqualTo(Boolean value) {
			addCriterion("ADMIN_FLAG >=", value, "adminFlag");
			return (Criteria) this;
		}

		public Criteria andAdminFlagLessThan(Boolean value) {
			addCriterion("ADMIN_FLAG <", value, "adminFlag");
			return (Criteria) this;
		}

		public Criteria andAdminFlagLessThanOrEqualTo(Boolean value) {
			addCriterion("ADMIN_FLAG <=", value, "adminFlag");
			return (Criteria) this;
		}

		public Criteria andAdminFlagIn(List<Boolean> values) {
			addCriterion("ADMIN_FLAG in", values, "adminFlag");
			return (Criteria) this;
		}

		public Criteria andAdminFlagNotIn(List<Boolean> values) {
			addCriterion("ADMIN_FLAG not in", values, "adminFlag");
			return (Criteria) this;
		}

		public Criteria andAdminFlagBetween(Boolean value1, Boolean value2) {
			addCriterion("ADMIN_FLAG between", value1, value2, "adminFlag");
			return (Criteria) this;
		}

		public Criteria andAdminFlagNotBetween(Boolean value1, Boolean value2) {
			addCriterion("ADMIN_FLAG not between", value1, value2, "adminFlag");
			return (Criteria) this;
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

		public Criteria andCancelTimeIsNull() {
			addCriterion("CANCEL_TIME is null");
			return (Criteria) this;
		}

		public Criteria andCancelTimeIsNotNull() {
			addCriterion("CANCEL_TIME is not null");
			return (Criteria) this;
		}

		public Criteria andCancelTimeEqualTo(Date value) {
			addCriterion("CANCEL_TIME =", value, "cancelTime");
			return (Criteria) this;
		}

		public Criteria andCancelTimeNotEqualTo(Date value) {
			addCriterion("CANCEL_TIME <>", value, "cancelTime");
			return (Criteria) this;
		}

		public Criteria andCancelTimeGreaterThan(Date value) {
			addCriterion("CANCEL_TIME >", value, "cancelTime");
			return (Criteria) this;
		}

		public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("CANCEL_TIME >=", value, "cancelTime");
			return (Criteria) this;
		}

		public Criteria andCancelTimeLessThan(Date value) {
			addCriterion("CANCEL_TIME <", value, "cancelTime");
			return (Criteria) this;
		}

		public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
			addCriterion("CANCEL_TIME <=", value, "cancelTime");
			return (Criteria) this;
		}

		public Criteria andCancelTimeIn(List<Date> values) {
			addCriterion("CANCEL_TIME in", values, "cancelTime");
			return (Criteria) this;
		}

		public Criteria andCancelTimeNotIn(List<Date> values) {
			addCriterion("CANCEL_TIME not in", values, "cancelTime");
			return (Criteria) this;
		}

		public Criteria andCancelTimeBetween(Date value1, Date value2) {
			addCriterion("CANCEL_TIME between", value1, value2, "cancelTime");
			return (Criteria) this;
		}

		public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
			addCriterion("CANCEL_TIME not between", value1, value2, "cancelTime");
			return (Criteria) this;
		}

		public Criteria andCancelatorIsNull() {
			addCriterion("CANCELATOR is null");
			return (Criteria) this;
		}

		public Criteria andCancelatorIsNotNull() {
			addCriterion("CANCELATOR is not null");
			return (Criteria) this;
		}

		public Criteria andCancelatorEqualTo(String value) {
			addCriterion("CANCELATOR =", value, "cancelator");
			return (Criteria) this;
		}

		public Criteria andCancelatorNotEqualTo(String value) {
			addCriterion("CANCELATOR <>", value, "cancelator");
			return (Criteria) this;
		}

		public Criteria andCancelatorGreaterThan(String value) {
			addCriterion("CANCELATOR >", value, "cancelator");
			return (Criteria) this;
		}

		public Criteria andCancelatorGreaterThanOrEqualTo(String value) {
			addCriterion("CANCELATOR >=", value, "cancelator");
			return (Criteria) this;
		}

		public Criteria andCancelatorLessThan(String value) {
			addCriterion("CANCELATOR <", value, "cancelator");
			return (Criteria) this;
		}

		public Criteria andCancelatorLessThanOrEqualTo(String value) {
			addCriterion("CANCELATOR <=", value, "cancelator");
			return (Criteria) this;
		}

		public Criteria andCancelatorLike(String value) {
			addCriterion("CANCELATOR like", value, "cancelator");
			return (Criteria) this;
		}

		public Criteria andCancelatorNotLike(String value) {
			addCriterion("CANCELATOR not like", value, "cancelator");
			return (Criteria) this;
		}

		public Criteria andCancelatorIn(List<String> values) {
			addCriterion("CANCELATOR in", values, "cancelator");
			return (Criteria) this;
		}

		public Criteria andCancelatorNotIn(List<String> values) {
			addCriterion("CANCELATOR not in", values, "cancelator");
			return (Criteria) this;
		}

		public Criteria andCancelatorBetween(String value1, String value2) {
			addCriterion("CANCELATOR between", value1, value2, "cancelator");
			return (Criteria) this;
		}

		public Criteria andCancelatorNotBetween(String value1, String value2) {
			addCriterion("CANCELATOR not between", value1, value2, "cancelator");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("DESCRIPTION is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("DESCRIPTION is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("DESCRIPTION =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("DESCRIPTION <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("DESCRIPTION >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("DESCRIPTION >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("DESCRIPTION <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("DESCRIPTION <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("DESCRIPTION like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("DESCRIPTION not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("DESCRIPTION in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("DESCRIPTION not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("DESCRIPTION between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("DESCRIPTION not between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andValidEqualTo(boolean value) {
			addCriterion("VALID =", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotEqualTo(boolean value) {
			addCriterion("VALID <>", value, "valid");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameIsNull() {
			addCriterion("CANCELATOR_NAME is null");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameIsNotNull() {
			addCriterion("CANCELATOR_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameEqualTo(String value) {
			addCriterion("CANCELATOR_NAME =", value, "cancelatorName");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameNotEqualTo(String value) {
			addCriterion("CANCELATOR_NAME <>", value, "cancelatorName");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameGreaterThan(String value) {
			addCriterion("CANCELATOR_NAME >", value, "cancelatorName");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameGreaterThanOrEqualTo(String value) {
			addCriterion("CANCELATOR_NAME >=", value, "cancelatorName");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameLessThan(String value) {
			addCriterion("CANCELATOR_NAME <", value, "cancelatorName");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameLessThanOrEqualTo(String value) {
			addCriterion("CANCELATOR_NAME <=", value, "cancelatorName");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameLike(String value) {
			addCriterion("CANCELATOR_NAME like", value, "cancelatorName");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameNotLike(String value) {
			addCriterion("CANCELATOR_NAME not like", value, "cancelatorName");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameIn(List<String> values) {
			addCriterion("CANCELATOR_NAME in", values, "cancelatorName");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameNotIn(List<String> values) {
			addCriterion("CANCELATOR_NAME not in", values, "cancelatorName");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameBetween(String value1, String value2) {
			addCriterion("CANCELATOR_NAME between", value1, value2, "cancelatorName");
			return (Criteria) this;
		}

		public Criteria andCancelatorNameNotBetween(String value1, String value2) {
			addCriterion("CANCELATOR_NAME not between", value1, value2, "cancelatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameIsNull() {
			addCriterion("CREATOR_NAME is null");
			return (Criteria) this;
		}

		public Criteria andCreatorNameIsNotNull() {
			addCriterion("CREATOR_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andCreatorNameEqualTo(String value) {
			addCriterion("CREATOR_NAME =", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameNotEqualTo(String value) {
			addCriterion("CREATOR_NAME <>", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameGreaterThan(String value) {
			addCriterion("CREATOR_NAME >", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
			addCriterion("CREATOR_NAME >=", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameLessThan(String value) {
			addCriterion("CREATOR_NAME <", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameLessThanOrEqualTo(String value) {
			addCriterion("CREATOR_NAME <=", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameLike(String value) {
			addCriterion("CREATOR_NAME like", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameNotLike(String value) {
			addCriterion("CREATOR_NAME not like", value, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameIn(List<String> values) {
			addCriterion("CREATOR_NAME in", values, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameNotIn(List<String> values) {
			addCriterion("CREATOR_NAME not in", values, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameBetween(String value1, String value2) {
			addCriterion("CREATOR_NAME between", value1, value2, "creatorName");
			return (Criteria) this;
		}

		public Criteria andCreatorNameNotBetween(String value1, String value2) {
			addCriterion("CREATOR_NAME not between", value1, value2, "creatorName");
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