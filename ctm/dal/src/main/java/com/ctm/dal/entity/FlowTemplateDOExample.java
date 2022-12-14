package com.ctm.dal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlowTemplateDOExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    public FlowTemplateDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
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

        protected void addCriterion(
                String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdIsNull() {
            addCriterion("flow_template_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdIsNotNull() {
            addCriterion("flow_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdEqualTo(String value) {
            addCriterion("flow_template_id =", value, "flowTemplateId");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdNotEqualTo(String value) {
            addCriterion("flow_template_id <>", value, "flowTemplateId");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdGreaterThan(String value) {
            addCriterion("flow_template_id >", value, "flowTemplateId");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("flow_template_id >=", value, "flowTemplateId");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdLessThan(String value) {
            addCriterion("flow_template_id <", value, "flowTemplateId");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("flow_template_id <=", value, "flowTemplateId");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdLike(String value) {
            addCriterion("flow_template_id like", value, "flowTemplateId");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdNotLike(String value) {
            addCriterion("flow_template_id not like", value, "flowTemplateId");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdIn(List<String> values) {
            addCriterion("flow_template_id in", values, "flowTemplateId");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdNotIn(List<String> values) {
            addCriterion("flow_template_id not in", values, "flowTemplateId");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdBetween(String value1, String value2) {
            addCriterion("flow_template_id between", value1, value2, "flowTemplateId");
            return (Criteria) this;
        }

        public Criteria andFlowTemplateIdNotBetween(String value1, String value2) {
            addCriterion("flow_template_id not between", value1, value2, "flowTemplateId");
            return (Criteria) this;
        }

        public Criteria andSecretIsNull() {
            addCriterion("secret is null");
            return (Criteria) this;
        }

        public Criteria andSecretIsNotNull() {
            addCriterion("secret is not null");
            return (Criteria) this;
        }

        public Criteria andSecretEqualTo(Byte value) {
            addCriterion("secret =", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotEqualTo(Byte value) {
            addCriterion("secret <>", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThan(Byte value) {
            addCriterion("secret >", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretGreaterThanOrEqualTo(Byte value) {
            addCriterion("secret >=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThan(Byte value) {
            addCriterion("secret <", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretLessThanOrEqualTo(Byte value) {
            addCriterion("secret <=", value, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretIn(List<Byte> values) {
            addCriterion("secret in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotIn(List<Byte> values) {
            addCriterion("secret not in", values, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretBetween(Byte value1, Byte value2) {
            addCriterion("secret between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andSecretNotBetween(Byte value1, Byte value2) {
            addCriterion("secret not between", value1, value2, "secret");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNull() {
            addCriterion("expire_date is null");
            return (Criteria) this;
        }

        public Criteria andExpireDateIsNotNull() {
            addCriterion("expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpireDateEqualTo(Date value) {
            addCriterion("expire_date =", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotEqualTo(Date value) {
            addCriterion("expire_date <>", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThan(Date value) {
            addCriterion("expire_date >", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_date >=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThan(Date value) {
            addCriterion("expire_date <", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateLessThanOrEqualTo(Date value) {
            addCriterion("expire_date <=", value, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateIn(List<Date> values) {
            addCriterion("expire_date in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotIn(List<Date> values) {
            addCriterion("expire_date not in", values, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateBetween(Date value1, Date value2) {
            addCriterion("expire_date between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andExpireDateNotBetween(Date value1, Date value2) {
            addCriterion("expire_date not between", value1, value2, "expireDate");
            return (Criteria) this;
        }

        public Criteria andSignDeadLineIsNull() {
            addCriterion("sign_dead_line is null");
            return (Criteria) this;
        }

        public Criteria andSignDeadLineIsNotNull() {
            addCriterion("sign_dead_line is not null");
            return (Criteria) this;
        }

        public Criteria andSignDeadLineEqualTo(Date value) {
            addCriterion("sign_dead_line =", value, "signDeadLine");
            return (Criteria) this;
        }

        public Criteria andSignDeadLineNotEqualTo(Date value) {
            addCriterion("sign_dead_line <>", value, "signDeadLine");
            return (Criteria) this;
        }

        public Criteria andSignDeadLineGreaterThan(Date value) {
            addCriterion("sign_dead_line >", value, "signDeadLine");
            return (Criteria) this;
        }

        public Criteria andSignDeadLineGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_dead_line >=", value, "signDeadLine");
            return (Criteria) this;
        }

        public Criteria andSignDeadLineLessThan(Date value) {
            addCriterion("sign_dead_line <", value, "signDeadLine");
            return (Criteria) this;
        }

        public Criteria andSignDeadLineLessThanOrEqualTo(Date value) {
            addCriterion("sign_dead_line <=", value, "signDeadLine");
            return (Criteria) this;
        }

        public Criteria andSignDeadLineIn(List<Date> values) {
            addCriterion("sign_dead_line in", values, "signDeadLine");
            return (Criteria) this;
        }

        public Criteria andSignDeadLineNotIn(List<Date> values) {
            addCriterion("sign_dead_line not in", values, "signDeadLine");
            return (Criteria) this;
        }

        public Criteria andSignDeadLineBetween(Date value1, Date value2) {
            addCriterion("sign_dead_line between", value1, value2, "signDeadLine");
            return (Criteria) this;
        }

        public Criteria andSignDeadLineNotBetween(Date value1, Date value2) {
            addCriterion("sign_dead_line not between", value1, value2, "signDeadLine");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table
     * flow_template
     *
     * @mbg.generated do_not_delete_during_merge Sun Aug 28 19:30:45 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table
     * flow_template
     *
     * @mbg.generated Sun Aug 28 19:30:45 CST 2022
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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

        protected Criterion(
                String condition, Object value, Object secondValue, String typeHandler) {
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
    }
}
