package com.zheng.hospital.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChcReserveExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ChcReserveExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andReserveIdIsNull() {
            addCriterion("reserve_id is null");
            return (Criteria) this;
        }

        public Criteria andReserveIdIsNotNull() {
            addCriterion("reserve_id is not null");
            return (Criteria) this;
        }

        public Criteria andReserveIdEqualTo(String value) {
            addCriterion("reserve_id =", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotEqualTo(String value) {
            addCriterion("reserve_id <>", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdGreaterThan(String value) {
            addCriterion("reserve_id >", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_id >=", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdLessThan(String value) {
            addCriterion("reserve_id <", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdLessThanOrEqualTo(String value) {
            addCriterion("reserve_id <=", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdLike(String value) {
            addCriterion("reserve_id like", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotLike(String value) {
            addCriterion("reserve_id not like", value, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdIn(List<String> values) {
            addCriterion("reserve_id in", values, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotIn(List<String> values) {
            addCriterion("reserve_id not in", values, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdBetween(String value1, String value2) {
            addCriterion("reserve_id between", value1, value2, "reserveId");
            return (Criteria) this;
        }

        public Criteria andReserveIdNotBetween(String value1, String value2) {
            addCriterion("reserve_id not between", value1, value2, "reserveId");
            return (Criteria) this;
        }

        public Criteria andFromUseridIsNull() {
            addCriterion("from_userid is null");
            return (Criteria) this;
        }

        public Criteria andFromUseridIsNotNull() {
            addCriterion("from_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFromUseridEqualTo(Integer value) {
            addCriterion("from_userid =", value, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridNotEqualTo(Integer value) {
            addCriterion("from_userid <>", value, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridGreaterThan(Integer value) {
            addCriterion("from_userid >", value, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_userid >=", value, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridLessThan(Integer value) {
            addCriterion("from_userid <", value, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridLessThanOrEqualTo(Integer value) {
            addCriterion("from_userid <=", value, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridIn(List<Integer> values) {
            addCriterion("from_userid in", values, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridNotIn(List<Integer> values) {
            addCriterion("from_userid not in", values, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridBetween(Integer value1, Integer value2) {
            addCriterion("from_userid between", value1, value2, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andFromUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("from_userid not between", value1, value2, "fromUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridIsNull() {
            addCriterion("to_userid is null");
            return (Criteria) this;
        }

        public Criteria andToUseridIsNotNull() {
            addCriterion("to_userid is not null");
            return (Criteria) this;
        }

        public Criteria andToUseridEqualTo(Integer value) {
            addCriterion("to_userid =", value, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridNotEqualTo(Integer value) {
            addCriterion("to_userid <>", value, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridGreaterThan(Integer value) {
            addCriterion("to_userid >", value, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_userid >=", value, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridLessThan(Integer value) {
            addCriterion("to_userid <", value, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridLessThanOrEqualTo(Integer value) {
            addCriterion("to_userid <=", value, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridIn(List<Integer> values) {
            addCriterion("to_userid in", values, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridNotIn(List<Integer> values) {
            addCriterion("to_userid not in", values, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridBetween(Integer value1, Integer value2) {
            addCriterion("to_userid between", value1, value2, "toUserid");
            return (Criteria) this;
        }

        public Criteria andToUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("to_userid not between", value1, value2, "toUserid");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andReserveTimeIsNull() {
            addCriterion("reserve_time is null");
            return (Criteria) this;
        }

        public Criteria andReserveTimeIsNotNull() {
            addCriterion("reserve_time is not null");
            return (Criteria) this;
        }

        public Criteria andReserveTimeEqualTo(String value) {
            addCriterion("reserve_time =", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeNotEqualTo(String value) {
            addCriterion("reserve_time <>", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeGreaterThan(String value) {
            addCriterion("reserve_time >", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_time >=", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeLessThan(String value) {
            addCriterion("reserve_time <", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeLessThanOrEqualTo(String value) {
            addCriterion("reserve_time <=", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeLike(String value) {
            addCriterion("reserve_time like", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeNotLike(String value) {
            addCriterion("reserve_time not like", value, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeIn(List<String> values) {
            addCriterion("reserve_time in", values, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeNotIn(List<String> values) {
            addCriterion("reserve_time not in", values, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeBetween(String value1, String value2) {
            addCriterion("reserve_time between", value1, value2, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveTimeNotBetween(String value1, String value2) {
            addCriterion("reserve_time not between", value1, value2, "reserveTime");
            return (Criteria) this;
        }

        public Criteria andReserveDateIsNull() {
            addCriterion("reserve_date is null");
            return (Criteria) this;
        }

        public Criteria andReserveDateIsNotNull() {
            addCriterion("reserve_date is not null");
            return (Criteria) this;
        }

        public Criteria andReserveDateEqualTo(Date value) {
            addCriterionForJDBCDate("reserve_date =", value, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("reserve_date <>", value, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("reserve_date >", value, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reserve_date >=", value, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateLessThan(Date value) {
            addCriterionForJDBCDate("reserve_date <", value, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("reserve_date <=", value, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateIn(List<Date> values) {
            addCriterionForJDBCDate("reserve_date in", values, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("reserve_date not in", values, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reserve_date between", value1, value2, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("reserve_date not between", value1, value2, "reserveDate");
            return (Criteria) this;
        }

        public Criteria andReserveAddressIsNull() {
            addCriterion("reserve_address is null");
            return (Criteria) this;
        }

        public Criteria andReserveAddressIsNotNull() {
            addCriterion("reserve_address is not null");
            return (Criteria) this;
        }

        public Criteria andReserveAddressEqualTo(String value) {
            addCriterion("reserve_address =", value, "reserveAddress");
            return (Criteria) this;
        }

        public Criteria andReserveAddressNotEqualTo(String value) {
            addCriterion("reserve_address <>", value, "reserveAddress");
            return (Criteria) this;
        }

        public Criteria andReserveAddressGreaterThan(String value) {
            addCriterion("reserve_address >", value, "reserveAddress");
            return (Criteria) this;
        }

        public Criteria andReserveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_address >=", value, "reserveAddress");
            return (Criteria) this;
        }

        public Criteria andReserveAddressLessThan(String value) {
            addCriterion("reserve_address <", value, "reserveAddress");
            return (Criteria) this;
        }

        public Criteria andReserveAddressLessThanOrEqualTo(String value) {
            addCriterion("reserve_address <=", value, "reserveAddress");
            return (Criteria) this;
        }

        public Criteria andReserveAddressLike(String value) {
            addCriterion("reserve_address like", value, "reserveAddress");
            return (Criteria) this;
        }

        public Criteria andReserveAddressNotLike(String value) {
            addCriterion("reserve_address not like", value, "reserveAddress");
            return (Criteria) this;
        }

        public Criteria andReserveAddressIn(List<String> values) {
            addCriterion("reserve_address in", values, "reserveAddress");
            return (Criteria) this;
        }

        public Criteria andReserveAddressNotIn(List<String> values) {
            addCriterion("reserve_address not in", values, "reserveAddress");
            return (Criteria) this;
        }

        public Criteria andReserveAddressBetween(String value1, String value2) {
            addCriterion("reserve_address between", value1, value2, "reserveAddress");
            return (Criteria) this;
        }

        public Criteria andReserveAddressNotBetween(String value1, String value2) {
            addCriterion("reserve_address not between", value1, value2, "reserveAddress");
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