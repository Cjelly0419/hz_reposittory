package com.hz.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class RightsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RightsExample() {
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

        public Criteria andRightsidIsNull() {
            addCriterion("rightsid is null");
            return (Criteria) this;
        }

        public Criteria andRightsidIsNotNull() {
            addCriterion("rightsid is not null");
            return (Criteria) this;
        }

        public Criteria andRightsidEqualTo(String value) {
            addCriterion("rightsid =", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidNotEqualTo(String value) {
            addCriterion("rightsid <>", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidGreaterThan(String value) {
            addCriterion("rightsid >", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidGreaterThanOrEqualTo(String value) {
            addCriterion("rightsid >=", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidLessThan(String value) {
            addCriterion("rightsid <", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidLessThanOrEqualTo(String value) {
            addCriterion("rightsid <=", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidLike(String value) {
            addCriterion("rightsid like", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidNotLike(String value) {
            addCriterion("rightsid not like", value, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidIn(List<String> values) {
            addCriterion("rightsid in", values, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidNotIn(List<String> values) {
            addCriterion("rightsid not in", values, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidBetween(String value1, String value2) {
            addCriterion("rightsid between", value1, value2, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsidNotBetween(String value1, String value2) {
            addCriterion("rightsid not between", value1, value2, "rightsid");
            return (Criteria) this;
        }

        public Criteria andRightsparentidIsNull() {
            addCriterion("RightsParentId is null");
            return (Criteria) this;
        }

        public Criteria andRightsparentidIsNotNull() {
            addCriterion("RightsParentId is not null");
            return (Criteria) this;
        }

        public Criteria andRightsparentidEqualTo(String value) {
            addCriterion("RightsParentId =", value, "rightsparentid");
            return (Criteria) this;
        }

        public Criteria andRightsparentidNotEqualTo(String value) {
            addCriterion("RightsParentId <>", value, "rightsparentid");
            return (Criteria) this;
        }

        public Criteria andRightsparentidGreaterThan(String value) {
            addCriterion("RightsParentId >", value, "rightsparentid");
            return (Criteria) this;
        }

        public Criteria andRightsparentidGreaterThanOrEqualTo(String value) {
            addCriterion("RightsParentId >=", value, "rightsparentid");
            return (Criteria) this;
        }

        public Criteria andRightsparentidLessThan(String value) {
            addCriterion("RightsParentId <", value, "rightsparentid");
            return (Criteria) this;
        }

        public Criteria andRightsparentidLessThanOrEqualTo(String value) {
            addCriterion("RightsParentId <=", value, "rightsparentid");
            return (Criteria) this;
        }

        public Criteria andRightsparentidLike(String value) {
            addCriterion("RightsParentId like", value, "rightsparentid");
            return (Criteria) this;
        }

        public Criteria andRightsparentidNotLike(String value) {
            addCriterion("RightsParentId not like", value, "rightsparentid");
            return (Criteria) this;
        }

        public Criteria andRightsparentidIn(List<String> values) {
            addCriterion("RightsParentId in", values, "rightsparentid");
            return (Criteria) this;
        }

        public Criteria andRightsparentidNotIn(List<String> values) {
            addCriterion("RightsParentId not in", values, "rightsparentid");
            return (Criteria) this;
        }

        public Criteria andRightsparentidBetween(String value1, String value2) {
            addCriterion("RightsParentId between", value1, value2, "rightsparentid");
            return (Criteria) this;
        }

        public Criteria andRightsparentidNotBetween(String value1, String value2) {
            addCriterion("RightsParentId not between", value1, value2, "rightsparentid");
            return (Criteria) this;
        }

        public Criteria andRightsnameIsNull() {
            addCriterion("Rightsname is null");
            return (Criteria) this;
        }

        public Criteria andRightsnameIsNotNull() {
            addCriterion("Rightsname is not null");
            return (Criteria) this;
        }

        public Criteria andRightsnameEqualTo(String value) {
            addCriterion("Rightsname =", value, "rightsname");
            return (Criteria) this;
        }

        public Criteria andRightsnameNotEqualTo(String value) {
            addCriterion("Rightsname <>", value, "rightsname");
            return (Criteria) this;
        }

        public Criteria andRightsnameGreaterThan(String value) {
            addCriterion("Rightsname >", value, "rightsname");
            return (Criteria) this;
        }

        public Criteria andRightsnameGreaterThanOrEqualTo(String value) {
            addCriterion("Rightsname >=", value, "rightsname");
            return (Criteria) this;
        }

        public Criteria andRightsnameLessThan(String value) {
            addCriterion("Rightsname <", value, "rightsname");
            return (Criteria) this;
        }

        public Criteria andRightsnameLessThanOrEqualTo(String value) {
            addCriterion("Rightsname <=", value, "rightsname");
            return (Criteria) this;
        }

        public Criteria andRightsnameLike(String value) {
            addCriterion("Rightsname like", value, "rightsname");
            return (Criteria) this;
        }

        public Criteria andRightsnameNotLike(String value) {
            addCriterion("Rightsname not like", value, "rightsname");
            return (Criteria) this;
        }

        public Criteria andRightsnameIn(List<String> values) {
            addCriterion("Rightsname in", values, "rightsname");
            return (Criteria) this;
        }

        public Criteria andRightsnameNotIn(List<String> values) {
            addCriterion("Rightsname not in", values, "rightsname");
            return (Criteria) this;
        }

        public Criteria andRightsnameBetween(String value1, String value2) {
            addCriterion("Rightsname between", value1, value2, "rightsname");
            return (Criteria) this;
        }

        public Criteria andRightsnameNotBetween(String value1, String value2) {
            addCriterion("Rightsname not between", value1, value2, "rightsname");
            return (Criteria) this;
        }

        public Criteria andRightsUrlIsNull() {
            addCriterion("Rights_Url is null");
            return (Criteria) this;
        }

        public Criteria andRightsUrlIsNotNull() {
            addCriterion("Rights_Url is not null");
            return (Criteria) this;
        }

        public Criteria andRightsUrlEqualTo(String value) {
            addCriterion("Rights_Url =", value, "rightsUrl");
            return (Criteria) this;
        }

        public Criteria andRightsUrlNotEqualTo(String value) {
            addCriterion("Rights_Url <>", value, "rightsUrl");
            return (Criteria) this;
        }

        public Criteria andRightsUrlGreaterThan(String value) {
            addCriterion("Rights_Url >", value, "rightsUrl");
            return (Criteria) this;
        }

        public Criteria andRightsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Rights_Url >=", value, "rightsUrl");
            return (Criteria) this;
        }

        public Criteria andRightsUrlLessThan(String value) {
            addCriterion("Rights_Url <", value, "rightsUrl");
            return (Criteria) this;
        }

        public Criteria andRightsUrlLessThanOrEqualTo(String value) {
            addCriterion("Rights_Url <=", value, "rightsUrl");
            return (Criteria) this;
        }

        public Criteria andRightsUrlLike(String value) {
            addCriterion("Rights_Url like", value, "rightsUrl");
            return (Criteria) this;
        }

        public Criteria andRightsUrlNotLike(String value) {
            addCriterion("Rights_Url not like", value, "rightsUrl");
            return (Criteria) this;
        }

        public Criteria andRightsUrlIn(List<String> values) {
            addCriterion("Rights_Url in", values, "rightsUrl");
            return (Criteria) this;
        }

        public Criteria andRightsUrlNotIn(List<String> values) {
            addCriterion("Rights_Url not in", values, "rightsUrl");
            return (Criteria) this;
        }

        public Criteria andRightsUrlBetween(String value1, String value2) {
            addCriterion("Rights_Url between", value1, value2, "rightsUrl");
            return (Criteria) this;
        }

        public Criteria andRightsUrlNotBetween(String value1, String value2) {
            addCriterion("Rights_Url not between", value1, value2, "rightsUrl");
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