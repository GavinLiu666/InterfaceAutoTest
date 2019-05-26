package com.wangzai.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExecDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExecDetailExample() {
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

        public Criteria andTasknameIsNull() {
            addCriterion("taskName is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("taskName is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("taskName =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("taskName <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("taskName >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("taskName >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("taskName <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("taskName <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("taskName like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("taskName not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("taskName in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("taskName not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("taskName between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("taskName not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andUrlIdIsNull() {
            addCriterion("url_id is null");
            return (Criteria) this;
        }

        public Criteria andUrlIdIsNotNull() {
            addCriterion("url_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrlIdEqualTo(Long value) {
            addCriterion("url_id =", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotEqualTo(Long value) {
            addCriterion("url_id <>", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdGreaterThan(Long value) {
            addCriterion("url_id >", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("url_id >=", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdLessThan(Long value) {
            addCriterion("url_id <", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdLessThanOrEqualTo(Long value) {
            addCriterion("url_id <=", value, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdIn(List<Long> values) {
            addCriterion("url_id in", values, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotIn(List<Long> values) {
            addCriterion("url_id not in", values, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdBetween(Long value1, Long value2) {
            addCriterion("url_id between", value1, value2, "urlId");
            return (Criteria) this;
        }

        public Criteria andUrlIdNotBetween(Long value1, Long value2) {
            addCriterion("url_id not between", value1, value2, "urlId");
            return (Criteria) this;
        }

        public Criteria andExecTimeIsNull() {
            addCriterion("exec_time is null");
            return (Criteria) this;
        }

        public Criteria andExecTimeIsNotNull() {
            addCriterion("exec_time is not null");
            return (Criteria) this;
        }

        public Criteria andExecTimeEqualTo(Date value) {
            addCriterion("exec_time =", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotEqualTo(Date value) {
            addCriterion("exec_time <>", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeGreaterThan(Date value) {
            addCriterion("exec_time >", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exec_time >=", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeLessThan(Date value) {
            addCriterion("exec_time <", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeLessThanOrEqualTo(Date value) {
            addCriterion("exec_time <=", value, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeIn(List<Date> values) {
            addCriterion("exec_time in", values, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotIn(List<Date> values) {
            addCriterion("exec_time not in", values, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeBetween(Date value1, Date value2) {
            addCriterion("exec_time between", value1, value2, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecTimeNotBetween(Date value1, Date value2) {
            addCriterion("exec_time not between", value1, value2, "execTime");
            return (Criteria) this;
        }

        public Criteria andExecResponseIsNull() {
            addCriterion("exec_response is null");
            return (Criteria) this;
        }

        public Criteria andExecResponseIsNotNull() {
            addCriterion("exec_response is not null");
            return (Criteria) this;
        }

        public Criteria andExecResponseEqualTo(String value) {
            addCriterion("exec_response =", value, "execResponse");
            return (Criteria) this;
        }

        public Criteria andExecResponseNotEqualTo(String value) {
            addCriterion("exec_response <>", value, "execResponse");
            return (Criteria) this;
        }

        public Criteria andExecResponseGreaterThan(String value) {
            addCriterion("exec_response >", value, "execResponse");
            return (Criteria) this;
        }

        public Criteria andExecResponseGreaterThanOrEqualTo(String value) {
            addCriterion("exec_response >=", value, "execResponse");
            return (Criteria) this;
        }

        public Criteria andExecResponseLessThan(String value) {
            addCriterion("exec_response <", value, "execResponse");
            return (Criteria) this;
        }

        public Criteria andExecResponseLessThanOrEqualTo(String value) {
            addCriterion("exec_response <=", value, "execResponse");
            return (Criteria) this;
        }

        public Criteria andExecResponseLike(String value) {
            addCriterion("exec_response like", value, "execResponse");
            return (Criteria) this;
        }

        public Criteria andExecResponseNotLike(String value) {
            addCriterion("exec_response not like", value, "execResponse");
            return (Criteria) this;
        }

        public Criteria andExecResponseIn(List<String> values) {
            addCriterion("exec_response in", values, "execResponse");
            return (Criteria) this;
        }

        public Criteria andExecResponseNotIn(List<String> values) {
            addCriterion("exec_response not in", values, "execResponse");
            return (Criteria) this;
        }

        public Criteria andExecResponseBetween(String value1, String value2) {
            addCriterion("exec_response between", value1, value2, "execResponse");
            return (Criteria) this;
        }

        public Criteria andExecResponseNotBetween(String value1, String value2) {
            addCriterion("exec_response not between", value1, value2, "execResponse");
            return (Criteria) this;
        }

        public Criteria andIsExpectedIsNull() {
            addCriterion("is_expected is null");
            return (Criteria) this;
        }

        public Criteria andIsExpectedIsNotNull() {
            addCriterion("is_expected is not null");
            return (Criteria) this;
        }

        public Criteria andIsExpectedEqualTo(Boolean value) {
            addCriterion("is_expected =", value, "isExpected");
            return (Criteria) this;
        }

        public Criteria andIsExpectedNotEqualTo(Boolean value) {
            addCriterion("is_expected <>", value, "isExpected");
            return (Criteria) this;
        }

        public Criteria andIsExpectedGreaterThan(Boolean value) {
            addCriterion("is_expected >", value, "isExpected");
            return (Criteria) this;
        }

        public Criteria andIsExpectedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_expected >=", value, "isExpected");
            return (Criteria) this;
        }

        public Criteria andIsExpectedLessThan(Boolean value) {
            addCriterion("is_expected <", value, "isExpected");
            return (Criteria) this;
        }

        public Criteria andIsExpectedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_expected <=", value, "isExpected");
            return (Criteria) this;
        }

        public Criteria andIsExpectedIn(List<Boolean> values) {
            addCriterion("is_expected in", values, "isExpected");
            return (Criteria) this;
        }

        public Criteria andIsExpectedNotIn(List<Boolean> values) {
            addCriterion("is_expected not in", values, "isExpected");
            return (Criteria) this;
        }

        public Criteria andIsExpectedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_expected between", value1, value2, "isExpected");
            return (Criteria) this;
        }

        public Criteria andIsExpectedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_expected not between", value1, value2, "isExpected");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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
}