package com.zheng.hospital.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ChcHospitalExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ChcHospitalExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andHospitalIdIsNull() {
            addCriterion("hospital_id is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNotNull() {
            addCriterion("hospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdEqualTo(Integer value) {
            addCriterion("hospital_id =", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotEqualTo(Integer value) {
            addCriterion("hospital_id <>", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThan(Integer value) {
            addCriterion("hospital_id >", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_id >=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThan(Integer value) {
            addCriterion("hospital_id <", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_id <=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIn(List<Integer> values) {
            addCriterion("hospital_id in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotIn(List<Integer> values) {
            addCriterion("hospital_id not in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdBetween(Integer value1, Integer value2) {
            addCriterion("hospital_id between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_id not between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNull() {
            addCriterion("hospital_name is null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNotNull() {
            addCriterion("hospital_name is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameEqualTo(String value) {
            addCriterion("hospital_name =", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotEqualTo(String value) {
            addCriterion("hospital_name <>", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThan(String value) {
            addCriterion("hospital_name >", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_name >=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThan(String value) {
            addCriterion("hospital_name <", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThanOrEqualTo(String value) {
            addCriterion("hospital_name <=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLike(String value) {
            addCriterion("hospital_name like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotLike(String value) {
            addCriterion("hospital_name not like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIn(List<String> values) {
            addCriterion("hospital_name in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotIn(List<String> values) {
            addCriterion("hospital_name not in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameBetween(String value1, String value2) {
            addCriterion("hospital_name between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotBetween(String value1, String value2) {
            addCriterion("hospital_name not between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeIsNull() {
            addCriterion("hospital_type is null");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeIsNotNull() {
            addCriterion("hospital_type is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeEqualTo(String value) {
            addCriterion("hospital_type =", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeNotEqualTo(String value) {
            addCriterion("hospital_type <>", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeGreaterThan(String value) {
            addCriterion("hospital_type >", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_type >=", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeLessThan(String value) {
            addCriterion("hospital_type <", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeLessThanOrEqualTo(String value) {
            addCriterion("hospital_type <=", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeLike(String value) {
            addCriterion("hospital_type like", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeNotLike(String value) {
            addCriterion("hospital_type not like", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeIn(List<String> values) {
            addCriterion("hospital_type in", values, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeNotIn(List<String> values) {
            addCriterion("hospital_type not in", values, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeBetween(String value1, String value2) {
            addCriterion("hospital_type between", value1, value2, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeNotBetween(String value1, String value2) {
            addCriterion("hospital_type not between", value1, value2, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelIsNull() {
            addCriterion("hospital_level is null");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelIsNotNull() {
            addCriterion("hospital_level is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelEqualTo(String value) {
            addCriterion("hospital_level =", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelNotEqualTo(String value) {
            addCriterion("hospital_level <>", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelGreaterThan(String value) {
            addCriterion("hospital_level >", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_level >=", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelLessThan(String value) {
            addCriterion("hospital_level <", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelLessThanOrEqualTo(String value) {
            addCriterion("hospital_level <=", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelLike(String value) {
            addCriterion("hospital_level like", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelNotLike(String value) {
            addCriterion("hospital_level not like", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelIn(List<String> values) {
            addCriterion("hospital_level in", values, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelNotIn(List<String> values) {
            addCriterion("hospital_level not in", values, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelBetween(String value1, String value2) {
            addCriterion("hospital_level between", value1, value2, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelNotBetween(String value1, String value2) {
            addCriterion("hospital_level not between", value1, value2, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andTelnumIsNull() {
            addCriterion("telnum is null");
            return (Criteria) this;
        }

        public Criteria andTelnumIsNotNull() {
            addCriterion("telnum is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumEqualTo(String value) {
            addCriterion("telnum =", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotEqualTo(String value) {
            addCriterion("telnum <>", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumGreaterThan(String value) {
            addCriterion("telnum >", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumGreaterThanOrEqualTo(String value) {
            addCriterion("telnum >=", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLessThan(String value) {
            addCriterion("telnum <", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLessThanOrEqualTo(String value) {
            addCriterion("telnum <=", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumLike(String value) {
            addCriterion("telnum like", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotLike(String value) {
            addCriterion("telnum not like", value, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumIn(List<String> values) {
            addCriterion("telnum in", values, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotIn(List<String> values) {
            addCriterion("telnum not in", values, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumBetween(String value1, String value2) {
            addCriterion("telnum between", value1, value2, "telnum");
            return (Criteria) this;
        }

        public Criteria andTelnumNotBetween(String value1, String value2) {
            addCriterion("telnum not between", value1, value2, "telnum");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(String value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(String value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(String value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(String value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(String value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(String value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLike(String value) {
            addCriterion("lng like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotLike(String value) {
            addCriterion("lng not like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<String> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<String> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(String value1, String value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(String value1, String value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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
}