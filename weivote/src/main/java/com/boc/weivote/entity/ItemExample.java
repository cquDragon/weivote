package com.boc.weivote.entity;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Integer value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Integer value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Integer value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Integer value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Integer value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Integer> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Integer> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Integer value1, Integer value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Byte value) {
            addCriterion("sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Byte value) {
            addCriterion("sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Byte value) {
            addCriterion("sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Byte value) {
            addCriterion("sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Byte value) {
            addCriterion("sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Byte value) {
            addCriterion("sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Byte> values) {
            addCriterion("sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Byte> values) {
            addCriterion("sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Byte value1, Byte value2) {
            addCriterion("sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Byte value1, Byte value2) {
            addCriterion("sequence not between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andItemContentIsNull() {
            addCriterion("item_content is null");
            return (Criteria) this;
        }

        public Criteria andItemContentIsNotNull() {
            addCriterion("item_content is not null");
            return (Criteria) this;
        }

        public Criteria andItemContentEqualTo(String value) {
            addCriterion("item_content =", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentNotEqualTo(String value) {
            addCriterion("item_content <>", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentGreaterThan(String value) {
            addCriterion("item_content >", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentGreaterThanOrEqualTo(String value) {
            addCriterion("item_content >=", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentLessThan(String value) {
            addCriterion("item_content <", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentLessThanOrEqualTo(String value) {
            addCriterion("item_content <=", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentLike(String value) {
            addCriterion("item_content like", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentNotLike(String value) {
            addCriterion("item_content not like", value, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentIn(List<String> values) {
            addCriterion("item_content in", values, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentNotIn(List<String> values) {
            addCriterion("item_content not in", values, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentBetween(String value1, String value2) {
            addCriterion("item_content between", value1, value2, "itemContent");
            return (Criteria) this;
        }

        public Criteria andItemContentNotBetween(String value1, String value2) {
            addCriterion("item_content not between", value1, value2, "itemContent");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsIsNull() {
            addCriterion("vote_user_ids is null");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsIsNotNull() {
            addCriterion("vote_user_ids is not null");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsEqualTo(String value) {
            addCriterion("vote_user_ids =", value, "voteUserIds");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsNotEqualTo(String value) {
            addCriterion("vote_user_ids <>", value, "voteUserIds");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsGreaterThan(String value) {
            addCriterion("vote_user_ids >", value, "voteUserIds");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsGreaterThanOrEqualTo(String value) {
            addCriterion("vote_user_ids >=", value, "voteUserIds");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsLessThan(String value) {
            addCriterion("vote_user_ids <", value, "voteUserIds");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsLessThanOrEqualTo(String value) {
            addCriterion("vote_user_ids <=", value, "voteUserIds");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsLike(String value) {
            addCriterion("vote_user_ids like", value, "voteUserIds");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsNotLike(String value) {
            addCriterion("vote_user_ids not like", value, "voteUserIds");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsIn(List<String> values) {
            addCriterion("vote_user_ids in", values, "voteUserIds");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsNotIn(List<String> values) {
            addCriterion("vote_user_ids not in", values, "voteUserIds");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsBetween(String value1, String value2) {
            addCriterion("vote_user_ids between", value1, value2, "voteUserIds");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsNotBetween(String value1, String value2) {
            addCriterion("vote_user_ids not between", value1, value2, "voteUserIds");
            return (Criteria) this;
        }

        public Criteria andItemContentLikeInsensitive(String value) {
            addCriterion("upper(item_content) like", value.toUpperCase(), "itemContent");
            return (Criteria) this;
        }

        public Criteria andVoteUserIdsLikeInsensitive(String value) {
            addCriterion("upper(vote_user_ids) like", value.toUpperCase(), "voteUserIds");
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