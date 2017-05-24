package com.boc.weivote.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysIsNull() {
            addCriterion("weixin_keys is null");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysIsNotNull() {
            addCriterion("weixin_keys is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysEqualTo(String value) {
            addCriterion("weixin_keys =", value, "weixinKeys");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysNotEqualTo(String value) {
            addCriterion("weixin_keys <>", value, "weixinKeys");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysGreaterThan(String value) {
            addCriterion("weixin_keys >", value, "weixinKeys");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_keys >=", value, "weixinKeys");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysLessThan(String value) {
            addCriterion("weixin_keys <", value, "weixinKeys");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysLessThanOrEqualTo(String value) {
            addCriterion("weixin_keys <=", value, "weixinKeys");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysLike(String value) {
            addCriterion("weixin_keys like", value, "weixinKeys");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysNotLike(String value) {
            addCriterion("weixin_keys not like", value, "weixinKeys");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysIn(List<String> values) {
            addCriterion("weixin_keys in", values, "weixinKeys");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysNotIn(List<String> values) {
            addCriterion("weixin_keys not in", values, "weixinKeys");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysBetween(String value1, String value2) {
            addCriterion("weixin_keys between", value1, value2, "weixinKeys");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysNotBetween(String value1, String value2) {
            addCriterion("weixin_keys not between", value1, value2, "weixinKeys");
            return (Criteria) this;
        }

        public Criteria andUserRightIsNull() {
            addCriterion("user_right is null");
            return (Criteria) this;
        }

        public Criteria andUserRightIsNotNull() {
            addCriterion("user_right is not null");
            return (Criteria) this;
        }

        public Criteria andUserRightEqualTo(Byte value) {
            addCriterion("user_right =", value, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightNotEqualTo(Byte value) {
            addCriterion("user_right <>", value, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightGreaterThan(Byte value) {
            addCriterion("user_right >", value, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_right >=", value, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightLessThan(Byte value) {
            addCriterion("user_right <", value, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightLessThanOrEqualTo(Byte value) {
            addCriterion("user_right <=", value, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightIn(List<Byte> values) {
            addCriterion("user_right in", values, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightNotIn(List<Byte> values) {
            addCriterion("user_right not in", values, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightBetween(Byte value1, Byte value2) {
            addCriterion("user_right between", value1, value2, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightNotBetween(Byte value1, Byte value2) {
            addCriterion("user_right not between", value1, value2, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserNameLikeInsensitive(String value) {
            addCriterion("upper(user_name) like", value.toUpperCase(), "userName");
            return (Criteria) this;
        }

        public Criteria andWeixinKeysLikeInsensitive(String value) {
            addCriterion("upper(weixin_keys) like", value.toUpperCase(), "weixinKeys");
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