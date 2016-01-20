package com.entity.security;

import com.base.papper.PageSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSecurityCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected PageSet pageSet;

    public TbSecurityCustomerExample() {
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

    public void setPageSet(PageSet pageSet) {
        this.pageSet=pageSet;
    }

    public PageSet getPageSet() {
        return pageSet;
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

        public Criteria andDataIdIsNull() {
            addCriterion("data_id is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("data_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(String value) {
            addCriterion("data_id =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(String value) {
            addCriterion("data_id <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(String value) {
            addCriterion("data_id >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_id >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(String value) {
            addCriterion("data_id <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(String value) {
            addCriterion("data_id <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLike(String value) {
            addCriterion("data_id like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotLike(String value) {
            addCriterion("data_id not like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<String> values) {
            addCriterion("data_id in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<String> values) {
            addCriterion("data_id not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(String value1, String value2) {
            addCriterion("data_id between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(String value1, String value2) {
            addCriterion("data_id not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataEnableIsNull() {
            addCriterion("data_enable is null");
            return (Criteria) this;
        }

        public Criteria andDataEnableIsNotNull() {
            addCriterion("data_enable is not null");
            return (Criteria) this;
        }

        public Criteria andDataEnableEqualTo(String value) {
            addCriterion("data_enable =", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableNotEqualTo(String value) {
            addCriterion("data_enable <>", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableGreaterThan(String value) {
            addCriterion("data_enable >", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableGreaterThanOrEqualTo(String value) {
            addCriterion("data_enable >=", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableLessThan(String value) {
            addCriterion("data_enable <", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableLessThanOrEqualTo(String value) {
            addCriterion("data_enable <=", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableLike(String value) {
            addCriterion("data_enable like", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableNotLike(String value) {
            addCriterion("data_enable not like", value, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableIn(List<String> values) {
            addCriterion("data_enable in", values, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableNotIn(List<String> values) {
            addCriterion("data_enable not in", values, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableBetween(String value1, String value2) {
            addCriterion("data_enable between", value1, value2, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataEnableNotBetween(String value1, String value2) {
            addCriterion("data_enable not between", value1, value2, "dataEnable");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeIsNull() {
            addCriterion("data_insert_time is null");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeIsNotNull() {
            addCriterion("data_insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeEqualTo(Date value) {
            addCriterion("data_insert_time =", value, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeNotEqualTo(Date value) {
            addCriterion("data_insert_time <>", value, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeGreaterThan(Date value) {
            addCriterion("data_insert_time >", value, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_insert_time >=", value, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeLessThan(Date value) {
            addCriterion("data_insert_time <", value, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_insert_time <=", value, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeIn(List<Date> values) {
            addCriterion("data_insert_time in", values, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeNotIn(List<Date> values) {
            addCriterion("data_insert_time not in", values, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeBetween(Date value1, Date value2) {
            addCriterion("data_insert_time between", value1, value2, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_insert_time not between", value1, value2, "dataInsertTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeIsNull() {
            addCriterion("data_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeIsNotNull() {
            addCriterion("data_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeEqualTo(Date value) {
            addCriterion("data_update_time =", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeNotEqualTo(Date value) {
            addCriterion("data_update_time <>", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeGreaterThan(Date value) {
            addCriterion("data_update_time >", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_update_time >=", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeLessThan(Date value) {
            addCriterion("data_update_time <", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_update_time <=", value, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeIn(List<Date> values) {
            addCriterion("data_update_time in", values, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeNotIn(List<Date> values) {
            addCriterion("data_update_time not in", values, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("data_update_time between", value1, value2, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_update_time not between", value1, value2, "dataUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeIsNull() {
            addCriterion("data_delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeIsNotNull() {
            addCriterion("data_delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeEqualTo(Date value) {
            addCriterion("data_delete_time =", value, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeNotEqualTo(Date value) {
            addCriterion("data_delete_time <>", value, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeGreaterThan(Date value) {
            addCriterion("data_delete_time >", value, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_delete_time >=", value, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeLessThan(Date value) {
            addCriterion("data_delete_time <", value, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_delete_time <=", value, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeIn(List<Date> values) {
            addCriterion("data_delete_time in", values, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeNotIn(List<Date> values) {
            addCriterion("data_delete_time not in", values, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("data_delete_time between", value1, value2, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andDataDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_delete_time not between", value1, value2, "dataDeleteTime");
            return (Criteria) this;
        }

        public Criteria andExtensionAIsNull() {
            addCriterion("extension_a is null");
            return (Criteria) this;
        }

        public Criteria andExtensionAIsNotNull() {
            addCriterion("extension_a is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionAEqualTo(String value) {
            addCriterion("extension_a =", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionANotEqualTo(String value) {
            addCriterion("extension_a <>", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionAGreaterThan(String value) {
            addCriterion("extension_a >", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionAGreaterThanOrEqualTo(String value) {
            addCriterion("extension_a >=", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionALessThan(String value) {
            addCriterion("extension_a <", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionALessThanOrEqualTo(String value) {
            addCriterion("extension_a <=", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionALike(String value) {
            addCriterion("extension_a like", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionANotLike(String value) {
            addCriterion("extension_a not like", value, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionAIn(List<String> values) {
            addCriterion("extension_a in", values, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionANotIn(List<String> values) {
            addCriterion("extension_a not in", values, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionABetween(String value1, String value2) {
            addCriterion("extension_a between", value1, value2, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionANotBetween(String value1, String value2) {
            addCriterion("extension_a not between", value1, value2, "extensionA");
            return (Criteria) this;
        }

        public Criteria andExtensionBIsNull() {
            addCriterion("extension_b is null");
            return (Criteria) this;
        }

        public Criteria andExtensionBIsNotNull() {
            addCriterion("extension_b is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionBEqualTo(String value) {
            addCriterion("extension_b =", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBNotEqualTo(String value) {
            addCriterion("extension_b <>", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBGreaterThan(String value) {
            addCriterion("extension_b >", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBGreaterThanOrEqualTo(String value) {
            addCriterion("extension_b >=", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBLessThan(String value) {
            addCriterion("extension_b <", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBLessThanOrEqualTo(String value) {
            addCriterion("extension_b <=", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBLike(String value) {
            addCriterion("extension_b like", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBNotLike(String value) {
            addCriterion("extension_b not like", value, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBIn(List<String> values) {
            addCriterion("extension_b in", values, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBNotIn(List<String> values) {
            addCriterion("extension_b not in", values, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBBetween(String value1, String value2) {
            addCriterion("extension_b between", value1, value2, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionBNotBetween(String value1, String value2) {
            addCriterion("extension_b not between", value1, value2, "extensionB");
            return (Criteria) this;
        }

        public Criteria andExtensionCIsNull() {
            addCriterion("extension_c is null");
            return (Criteria) this;
        }

        public Criteria andExtensionCIsNotNull() {
            addCriterion("extension_c is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionCEqualTo(String value) {
            addCriterion("extension_c =", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCNotEqualTo(String value) {
            addCriterion("extension_c <>", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCGreaterThan(String value) {
            addCriterion("extension_c >", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCGreaterThanOrEqualTo(String value) {
            addCriterion("extension_c >=", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCLessThan(String value) {
            addCriterion("extension_c <", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCLessThanOrEqualTo(String value) {
            addCriterion("extension_c <=", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCLike(String value) {
            addCriterion("extension_c like", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCNotLike(String value) {
            addCriterion("extension_c not like", value, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCIn(List<String> values) {
            addCriterion("extension_c in", values, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCNotIn(List<String> values) {
            addCriterion("extension_c not in", values, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCBetween(String value1, String value2) {
            addCriterion("extension_c between", value1, value2, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionCNotBetween(String value1, String value2) {
            addCriterion("extension_c not between", value1, value2, "extensionC");
            return (Criteria) this;
        }

        public Criteria andExtensionDIsNull() {
            addCriterion("extension_d is null");
            return (Criteria) this;
        }

        public Criteria andExtensionDIsNotNull() {
            addCriterion("extension_d is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionDEqualTo(String value) {
            addCriterion("extension_d =", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDNotEqualTo(String value) {
            addCriterion("extension_d <>", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDGreaterThan(String value) {
            addCriterion("extension_d >", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDGreaterThanOrEqualTo(String value) {
            addCriterion("extension_d >=", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDLessThan(String value) {
            addCriterion("extension_d <", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDLessThanOrEqualTo(String value) {
            addCriterion("extension_d <=", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDLike(String value) {
            addCriterion("extension_d like", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDNotLike(String value) {
            addCriterion("extension_d not like", value, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDIn(List<String> values) {
            addCriterion("extension_d in", values, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDNotIn(List<String> values) {
            addCriterion("extension_d not in", values, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDBetween(String value1, String value2) {
            addCriterion("extension_d between", value1, value2, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionDNotBetween(String value1, String value2) {
            addCriterion("extension_d not between", value1, value2, "extensionD");
            return (Criteria) this;
        }

        public Criteria andExtensionEIsNull() {
            addCriterion("extension_e is null");
            return (Criteria) this;
        }

        public Criteria andExtensionEIsNotNull() {
            addCriterion("extension_e is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionEEqualTo(String value) {
            addCriterion("extension_e =", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionENotEqualTo(String value) {
            addCriterion("extension_e <>", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionEGreaterThan(String value) {
            addCriterion("extension_e >", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionEGreaterThanOrEqualTo(String value) {
            addCriterion("extension_e >=", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionELessThan(String value) {
            addCriterion("extension_e <", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionELessThanOrEqualTo(String value) {
            addCriterion("extension_e <=", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionELike(String value) {
            addCriterion("extension_e like", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionENotLike(String value) {
            addCriterion("extension_e not like", value, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionEIn(List<String> values) {
            addCriterion("extension_e in", values, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionENotIn(List<String> values) {
            addCriterion("extension_e not in", values, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionEBetween(String value1, String value2) {
            addCriterion("extension_e between", value1, value2, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionENotBetween(String value1, String value2) {
            addCriterion("extension_e not between", value1, value2, "extensionE");
            return (Criteria) this;
        }

        public Criteria andExtensionFIsNull() {
            addCriterion("extension_f is null");
            return (Criteria) this;
        }

        public Criteria andExtensionFIsNotNull() {
            addCriterion("extension_f is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionFEqualTo(String value) {
            addCriterion("extension_f =", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFNotEqualTo(String value) {
            addCriterion("extension_f <>", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFGreaterThan(String value) {
            addCriterion("extension_f >", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFGreaterThanOrEqualTo(String value) {
            addCriterion("extension_f >=", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFLessThan(String value) {
            addCriterion("extension_f <", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFLessThanOrEqualTo(String value) {
            addCriterion("extension_f <=", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFLike(String value) {
            addCriterion("extension_f like", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFNotLike(String value) {
            addCriterion("extension_f not like", value, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFIn(List<String> values) {
            addCriterion("extension_f in", values, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFNotIn(List<String> values) {
            addCriterion("extension_f not in", values, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFBetween(String value1, String value2) {
            addCriterion("extension_f between", value1, value2, "extensionF");
            return (Criteria) this;
        }

        public Criteria andExtensionFNotBetween(String value1, String value2) {
            addCriterion("extension_f not between", value1, value2, "extensionF");
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

        public Criteria andUserCidIsNull() {
            addCriterion("user_cid is null");
            return (Criteria) this;
        }

        public Criteria andUserCidIsNotNull() {
            addCriterion("user_cid is not null");
            return (Criteria) this;
        }

        public Criteria andUserCidEqualTo(String value) {
            addCriterion("user_cid =", value, "userCid");
            return (Criteria) this;
        }

        public Criteria andUserCidNotEqualTo(String value) {
            addCriterion("user_cid <>", value, "userCid");
            return (Criteria) this;
        }

        public Criteria andUserCidGreaterThan(String value) {
            addCriterion("user_cid >", value, "userCid");
            return (Criteria) this;
        }

        public Criteria andUserCidGreaterThanOrEqualTo(String value) {
            addCriterion("user_cid >=", value, "userCid");
            return (Criteria) this;
        }

        public Criteria andUserCidLessThan(String value) {
            addCriterion("user_cid <", value, "userCid");
            return (Criteria) this;
        }

        public Criteria andUserCidLessThanOrEqualTo(String value) {
            addCriterion("user_cid <=", value, "userCid");
            return (Criteria) this;
        }

        public Criteria andUserCidLike(String value) {
            addCriterion("user_cid like", value, "userCid");
            return (Criteria) this;
        }

        public Criteria andUserCidNotLike(String value) {
            addCriterion("user_cid not like", value, "userCid");
            return (Criteria) this;
        }

        public Criteria andUserCidIn(List<String> values) {
            addCriterion("user_cid in", values, "userCid");
            return (Criteria) this;
        }

        public Criteria andUserCidNotIn(List<String> values) {
            addCriterion("user_cid not in", values, "userCid");
            return (Criteria) this;
        }

        public Criteria andUserCidBetween(String value1, String value2) {
            addCriterion("user_cid between", value1, value2, "userCid");
            return (Criteria) this;
        }

        public Criteria andUserCidNotBetween(String value1, String value2) {
            addCriterion("user_cid not between", value1, value2, "userCid");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeIsNull() {
            addCriterion("user_cid_type is null");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeIsNotNull() {
            addCriterion("user_cid_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeEqualTo(String value) {
            addCriterion("user_cid_type =", value, "userCidType");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeNotEqualTo(String value) {
            addCriterion("user_cid_type <>", value, "userCidType");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeGreaterThan(String value) {
            addCriterion("user_cid_type >", value, "userCidType");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_cid_type >=", value, "userCidType");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeLessThan(String value) {
            addCriterion("user_cid_type <", value, "userCidType");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeLessThanOrEqualTo(String value) {
            addCriterion("user_cid_type <=", value, "userCidType");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeLike(String value) {
            addCriterion("user_cid_type like", value, "userCidType");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeNotLike(String value) {
            addCriterion("user_cid_type not like", value, "userCidType");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeIn(List<String> values) {
            addCriterion("user_cid_type in", values, "userCidType");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeNotIn(List<String> values) {
            addCriterion("user_cid_type not in", values, "userCidType");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeBetween(String value1, String value2) {
            addCriterion("user_cid_type between", value1, value2, "userCidType");
            return (Criteria) this;
        }

        public Criteria andUserCidTypeNotBetween(String value1, String value2) {
            addCriterion("user_cid_type not between", value1, value2, "userCidType");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterion("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterion("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterion("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterion("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterion("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterion("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterion("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("user_mobile is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("user_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("user_mobile =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("user_mobile <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("user_mobile >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobile >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("user_mobile <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("user_mobile <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("user_mobile like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("user_mobile not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("user_mobile in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("user_mobile not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("user_mobile between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("user_mobile not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNull() {
            addCriterion("user_mail is null");
            return (Criteria) this;
        }

        public Criteria andUserMailIsNotNull() {
            addCriterion("user_mail is not null");
            return (Criteria) this;
        }

        public Criteria andUserMailEqualTo(String value) {
            addCriterion("user_mail =", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotEqualTo(String value) {
            addCriterion("user_mail <>", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThan(String value) {
            addCriterion("user_mail >", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailGreaterThanOrEqualTo(String value) {
            addCriterion("user_mail >=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThan(String value) {
            addCriterion("user_mail <", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLessThanOrEqualTo(String value) {
            addCriterion("user_mail <=", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailLike(String value) {
            addCriterion("user_mail like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotLike(String value) {
            addCriterion("user_mail not like", value, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailIn(List<String> values) {
            addCriterion("user_mail in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotIn(List<String> values) {
            addCriterion("user_mail not in", values, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailBetween(String value1, String value2) {
            addCriterion("user_mail between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserMailNotBetween(String value1, String value2) {
            addCriterion("user_mail not between", value1, value2, "userMail");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordIsNull() {
            addCriterion("user_withdraw_password is null");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordIsNotNull() {
            addCriterion("user_withdraw_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordEqualTo(String value) {
            addCriterion("user_withdraw_password =", value, "userWithdrawPassword");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordNotEqualTo(String value) {
            addCriterion("user_withdraw_password <>", value, "userWithdrawPassword");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordGreaterThan(String value) {
            addCriterion("user_withdraw_password >", value, "userWithdrawPassword");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_withdraw_password >=", value, "userWithdrawPassword");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordLessThan(String value) {
            addCriterion("user_withdraw_password <", value, "userWithdrawPassword");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_withdraw_password <=", value, "userWithdrawPassword");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordLike(String value) {
            addCriterion("user_withdraw_password like", value, "userWithdrawPassword");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordNotLike(String value) {
            addCriterion("user_withdraw_password not like", value, "userWithdrawPassword");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordIn(List<String> values) {
            addCriterion("user_withdraw_password in", values, "userWithdrawPassword");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordNotIn(List<String> values) {
            addCriterion("user_withdraw_password not in", values, "userWithdrawPassword");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordBetween(String value1, String value2) {
            addCriterion("user_withdraw_password between", value1, value2, "userWithdrawPassword");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawPasswordNotBetween(String value1, String value2) {
            addCriterion("user_withdraw_password not between", value1, value2, "userWithdrawPassword");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltIsNull() {
            addCriterion("user_withdraw_salt is null");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltIsNotNull() {
            addCriterion("user_withdraw_salt is not null");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltEqualTo(String value) {
            addCriterion("user_withdraw_salt =", value, "userWithdrawSalt");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltNotEqualTo(String value) {
            addCriterion("user_withdraw_salt <>", value, "userWithdrawSalt");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltGreaterThan(String value) {
            addCriterion("user_withdraw_salt >", value, "userWithdrawSalt");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltGreaterThanOrEqualTo(String value) {
            addCriterion("user_withdraw_salt >=", value, "userWithdrawSalt");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltLessThan(String value) {
            addCriterion("user_withdraw_salt <", value, "userWithdrawSalt");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltLessThanOrEqualTo(String value) {
            addCriterion("user_withdraw_salt <=", value, "userWithdrawSalt");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltLike(String value) {
            addCriterion("user_withdraw_salt like", value, "userWithdrawSalt");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltNotLike(String value) {
            addCriterion("user_withdraw_salt not like", value, "userWithdrawSalt");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltIn(List<String> values) {
            addCriterion("user_withdraw_salt in", values, "userWithdrawSalt");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltNotIn(List<String> values) {
            addCriterion("user_withdraw_salt not in", values, "userWithdrawSalt");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltBetween(String value1, String value2) {
            addCriterion("user_withdraw_salt between", value1, value2, "userWithdrawSalt");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawSaltNotBetween(String value1, String value2) {
            addCriterion("user_withdraw_salt not between", value1, value2, "userWithdrawSalt");
            return (Criteria) this;
        }

        public Criteria andUserRegTimeIsNull() {
            addCriterion("user_reg_time is null");
            return (Criteria) this;
        }

        public Criteria andUserRegTimeIsNotNull() {
            addCriterion("user_reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegTimeEqualTo(Date value) {
            addCriterion("user_reg_time =", value, "userRegTime");
            return (Criteria) this;
        }

        public Criteria andUserRegTimeNotEqualTo(Date value) {
            addCriterion("user_reg_time <>", value, "userRegTime");
            return (Criteria) this;
        }

        public Criteria andUserRegTimeGreaterThan(Date value) {
            addCriterion("user_reg_time >", value, "userRegTime");
            return (Criteria) this;
        }

        public Criteria andUserRegTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_reg_time >=", value, "userRegTime");
            return (Criteria) this;
        }

        public Criteria andUserRegTimeLessThan(Date value) {
            addCriterion("user_reg_time <", value, "userRegTime");
            return (Criteria) this;
        }

        public Criteria andUserRegTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_reg_time <=", value, "userRegTime");
            return (Criteria) this;
        }

        public Criteria andUserRegTimeIn(List<Date> values) {
            addCriterion("user_reg_time in", values, "userRegTime");
            return (Criteria) this;
        }

        public Criteria andUserRegTimeNotIn(List<Date> values) {
            addCriterion("user_reg_time not in", values, "userRegTime");
            return (Criteria) this;
        }

        public Criteria andUserRegTimeBetween(Date value1, Date value2) {
            addCriterion("user_reg_time between", value1, value2, "userRegTime");
            return (Criteria) this;
        }

        public Criteria andUserRegTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_reg_time not between", value1, value2, "userRegTime");
            return (Criteria) this;
        }

        public Criteria andUserProvIsNull() {
            addCriterion("user_prov is null");
            return (Criteria) this;
        }

        public Criteria andUserProvIsNotNull() {
            addCriterion("user_prov is not null");
            return (Criteria) this;
        }

        public Criteria andUserProvEqualTo(String value) {
            addCriterion("user_prov =", value, "userProv");
            return (Criteria) this;
        }

        public Criteria andUserProvNotEqualTo(String value) {
            addCriterion("user_prov <>", value, "userProv");
            return (Criteria) this;
        }

        public Criteria andUserProvGreaterThan(String value) {
            addCriterion("user_prov >", value, "userProv");
            return (Criteria) this;
        }

        public Criteria andUserProvGreaterThanOrEqualTo(String value) {
            addCriterion("user_prov >=", value, "userProv");
            return (Criteria) this;
        }

        public Criteria andUserProvLessThan(String value) {
            addCriterion("user_prov <", value, "userProv");
            return (Criteria) this;
        }

        public Criteria andUserProvLessThanOrEqualTo(String value) {
            addCriterion("user_prov <=", value, "userProv");
            return (Criteria) this;
        }

        public Criteria andUserProvLike(String value) {
            addCriterion("user_prov like", value, "userProv");
            return (Criteria) this;
        }

        public Criteria andUserProvNotLike(String value) {
            addCriterion("user_prov not like", value, "userProv");
            return (Criteria) this;
        }

        public Criteria andUserProvIn(List<String> values) {
            addCriterion("user_prov in", values, "userProv");
            return (Criteria) this;
        }

        public Criteria andUserProvNotIn(List<String> values) {
            addCriterion("user_prov not in", values, "userProv");
            return (Criteria) this;
        }

        public Criteria andUserProvBetween(String value1, String value2) {
            addCriterion("user_prov between", value1, value2, "userProv");
            return (Criteria) this;
        }

        public Criteria andUserProvNotBetween(String value1, String value2) {
            addCriterion("user_prov not between", value1, value2, "userProv");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNull() {
            addCriterion("user_city is null");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNotNull() {
            addCriterion("user_city is not null");
            return (Criteria) this;
        }

        public Criteria andUserCityEqualTo(String value) {
            addCriterion("user_city =", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotEqualTo(String value) {
            addCriterion("user_city <>", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThan(String value) {
            addCriterion("user_city >", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThanOrEqualTo(String value) {
            addCriterion("user_city >=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThan(String value) {
            addCriterion("user_city <", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThanOrEqualTo(String value) {
            addCriterion("user_city <=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLike(String value) {
            addCriterion("user_city like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotLike(String value) {
            addCriterion("user_city not like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityIn(List<String> values) {
            addCriterion("user_city in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotIn(List<String> values) {
            addCriterion("user_city not in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityBetween(String value1, String value2) {
            addCriterion("user_city between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotBetween(String value1, String value2) {
            addCriterion("user_city not between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCountryIsNull() {
            addCriterion("user_country is null");
            return (Criteria) this;
        }

        public Criteria andUserCountryIsNotNull() {
            addCriterion("user_country is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountryEqualTo(String value) {
            addCriterion("user_country =", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotEqualTo(String value) {
            addCriterion("user_country <>", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryGreaterThan(String value) {
            addCriterion("user_country >", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryGreaterThanOrEqualTo(String value) {
            addCriterion("user_country >=", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLessThan(String value) {
            addCriterion("user_country <", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLessThanOrEqualTo(String value) {
            addCriterion("user_country <=", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryLike(String value) {
            addCriterion("user_country like", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotLike(String value) {
            addCriterion("user_country not like", value, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryIn(List<String> values) {
            addCriterion("user_country in", values, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotIn(List<String> values) {
            addCriterion("user_country not in", values, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryBetween(String value1, String value2) {
            addCriterion("user_country between", value1, value2, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserCountryNotBetween(String value1, String value2) {
            addCriterion("user_country not between", value1, value2, "userCountry");
            return (Criteria) this;
        }

        public Criteria andUserHometownIsNull() {
            addCriterion("user_hometown is null");
            return (Criteria) this;
        }

        public Criteria andUserHometownIsNotNull() {
            addCriterion("user_hometown is not null");
            return (Criteria) this;
        }

        public Criteria andUserHometownEqualTo(String value) {
            addCriterion("user_hometown =", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownNotEqualTo(String value) {
            addCriterion("user_hometown <>", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownGreaterThan(String value) {
            addCriterion("user_hometown >", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownGreaterThanOrEqualTo(String value) {
            addCriterion("user_hometown >=", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownLessThan(String value) {
            addCriterion("user_hometown <", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownLessThanOrEqualTo(String value) {
            addCriterion("user_hometown <=", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownLike(String value) {
            addCriterion("user_hometown like", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownNotLike(String value) {
            addCriterion("user_hometown not like", value, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownIn(List<String> values) {
            addCriterion("user_hometown in", values, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownNotIn(List<String> values) {
            addCriterion("user_hometown not in", values, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownBetween(String value1, String value2) {
            addCriterion("user_hometown between", value1, value2, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserHometownNotBetween(String value1, String value2) {
            addCriterion("user_hometown not between", value1, value2, "userHometown");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserPhotoIsNull() {
            addCriterion("user_photo is null");
            return (Criteria) this;
        }

        public Criteria andUserPhotoIsNotNull() {
            addCriterion("user_photo is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhotoEqualTo(String value) {
            addCriterion("user_photo =", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoNotEqualTo(String value) {
            addCriterion("user_photo <>", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoGreaterThan(String value) {
            addCriterion("user_photo >", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("user_photo >=", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoLessThan(String value) {
            addCriterion("user_photo <", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoLessThanOrEqualTo(String value) {
            addCriterion("user_photo <=", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoLike(String value) {
            addCriterion("user_photo like", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoNotLike(String value) {
            addCriterion("user_photo not like", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoIn(List<String> values) {
            addCriterion("user_photo in", values, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoNotIn(List<String> values) {
            addCriterion("user_photo not in", values, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoBetween(String value1, String value2) {
            addCriterion("user_photo between", value1, value2, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoNotBetween(String value1, String value2) {
            addCriterion("user_photo not between", value1, value2, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeIsNull() {
            addCriterion("user_referral_code is null");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeIsNotNull() {
            addCriterion("user_referral_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeEqualTo(String value) {
            addCriterion("user_referral_code =", value, "userReferralCode");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeNotEqualTo(String value) {
            addCriterion("user_referral_code <>", value, "userReferralCode");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeGreaterThan(String value) {
            addCriterion("user_referral_code >", value, "userReferralCode");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_referral_code >=", value, "userReferralCode");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeLessThan(String value) {
            addCriterion("user_referral_code <", value, "userReferralCode");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeLessThanOrEqualTo(String value) {
            addCriterion("user_referral_code <=", value, "userReferralCode");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeLike(String value) {
            addCriterion("user_referral_code like", value, "userReferralCode");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeNotLike(String value) {
            addCriterion("user_referral_code not like", value, "userReferralCode");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeIn(List<String> values) {
            addCriterion("user_referral_code in", values, "userReferralCode");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeNotIn(List<String> values) {
            addCriterion("user_referral_code not in", values, "userReferralCode");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeBetween(String value1, String value2) {
            addCriterion("user_referral_code between", value1, value2, "userReferralCode");
            return (Criteria) this;
        }

        public Criteria andUserReferralCodeNotBetween(String value1, String value2) {
            addCriterion("user_referral_code not between", value1, value2, "userReferralCode");
            return (Criteria) this;
        }

        public Criteria andUserCertificationIsNull() {
            addCriterion("user_certification is null");
            return (Criteria) this;
        }

        public Criteria andUserCertificationIsNotNull() {
            addCriterion("user_certification is not null");
            return (Criteria) this;
        }

        public Criteria andUserCertificationEqualTo(String value) {
            addCriterion("user_certification =", value, "userCertification");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNotEqualTo(String value) {
            addCriterion("user_certification <>", value, "userCertification");
            return (Criteria) this;
        }

        public Criteria andUserCertificationGreaterThan(String value) {
            addCriterion("user_certification >", value, "userCertification");
            return (Criteria) this;
        }

        public Criteria andUserCertificationGreaterThanOrEqualTo(String value) {
            addCriterion("user_certification >=", value, "userCertification");
            return (Criteria) this;
        }

        public Criteria andUserCertificationLessThan(String value) {
            addCriterion("user_certification <", value, "userCertification");
            return (Criteria) this;
        }

        public Criteria andUserCertificationLessThanOrEqualTo(String value) {
            addCriterion("user_certification <=", value, "userCertification");
            return (Criteria) this;
        }

        public Criteria andUserCertificationLike(String value) {
            addCriterion("user_certification like", value, "userCertification");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNotLike(String value) {
            addCriterion("user_certification not like", value, "userCertification");
            return (Criteria) this;
        }

        public Criteria andUserCertificationIn(List<String> values) {
            addCriterion("user_certification in", values, "userCertification");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNotIn(List<String> values) {
            addCriterion("user_certification not in", values, "userCertification");
            return (Criteria) this;
        }

        public Criteria andUserCertificationBetween(String value1, String value2) {
            addCriterion("user_certification between", value1, value2, "userCertification");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNotBetween(String value1, String value2) {
            addCriterion("user_certification not between", value1, value2, "userCertification");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNumberIsNull() {
            addCriterion("user_certification_number is null");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNumberIsNotNull() {
            addCriterion("user_certification_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNumberEqualTo(Integer value) {
            addCriterion("user_certification_number =", value, "userCertificationNumber");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNumberNotEqualTo(Integer value) {
            addCriterion("user_certification_number <>", value, "userCertificationNumber");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNumberGreaterThan(Integer value) {
            addCriterion("user_certification_number >", value, "userCertificationNumber");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_certification_number >=", value, "userCertificationNumber");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNumberLessThan(Integer value) {
            addCriterion("user_certification_number <", value, "userCertificationNumber");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNumberLessThanOrEqualTo(Integer value) {
            addCriterion("user_certification_number <=", value, "userCertificationNumber");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNumberIn(List<Integer> values) {
            addCriterion("user_certification_number in", values, "userCertificationNumber");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNumberNotIn(List<Integer> values) {
            addCriterion("user_certification_number not in", values, "userCertificationNumber");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNumberBetween(Integer value1, Integer value2) {
            addCriterion("user_certification_number between", value1, value2, "userCertificationNumber");
            return (Criteria) this;
        }

        public Criteria andUserCertificationNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("user_certification_number not between", value1, value2, "userCertificationNumber");
            return (Criteria) this;
        }

        public Criteria andUserCertificationCountIsNull() {
            addCriterion("user_certification_count is null");
            return (Criteria) this;
        }

        public Criteria andUserCertificationCountIsNotNull() {
            addCriterion("user_certification_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserCertificationCountEqualTo(Integer value) {
            addCriterion("user_certification_count =", value, "userCertificationCount");
            return (Criteria) this;
        }

        public Criteria andUserCertificationCountNotEqualTo(Integer value) {
            addCriterion("user_certification_count <>", value, "userCertificationCount");
            return (Criteria) this;
        }

        public Criteria andUserCertificationCountGreaterThan(Integer value) {
            addCriterion("user_certification_count >", value, "userCertificationCount");
            return (Criteria) this;
        }

        public Criteria andUserCertificationCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_certification_count >=", value, "userCertificationCount");
            return (Criteria) this;
        }

        public Criteria andUserCertificationCountLessThan(Integer value) {
            addCriterion("user_certification_count <", value, "userCertificationCount");
            return (Criteria) this;
        }

        public Criteria andUserCertificationCountLessThanOrEqualTo(Integer value) {
            addCriterion("user_certification_count <=", value, "userCertificationCount");
            return (Criteria) this;
        }

        public Criteria andUserCertificationCountIn(List<Integer> values) {
            addCriterion("user_certification_count in", values, "userCertificationCount");
            return (Criteria) this;
        }

        public Criteria andUserCertificationCountNotIn(List<Integer> values) {
            addCriterion("user_certification_count not in", values, "userCertificationCount");
            return (Criteria) this;
        }

        public Criteria andUserCertificationCountBetween(Integer value1, Integer value2) {
            addCriterion("user_certification_count between", value1, value2, "userCertificationCount");
            return (Criteria) this;
        }

        public Criteria andUserCertificationCountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_certification_count not between", value1, value2, "userCertificationCount");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeIsNull() {
            addCriterion("user_certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeIsNotNull() {
            addCriterion("user_certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeEqualTo(String value) {
            addCriterion("user_certificate_type =", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeNotEqualTo(String value) {
            addCriterion("user_certificate_type <>", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeGreaterThan(String value) {
            addCriterion("user_certificate_type >", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_certificate_type >=", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeLessThan(String value) {
            addCriterion("user_certificate_type <", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("user_certificate_type <=", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeLike(String value) {
            addCriterion("user_certificate_type like", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeNotLike(String value) {
            addCriterion("user_certificate_type not like", value, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeIn(List<String> values) {
            addCriterion("user_certificate_type in", values, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeNotIn(List<String> values) {
            addCriterion("user_certificate_type not in", values, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeBetween(String value1, String value2) {
            addCriterion("user_certificate_type between", value1, value2, "userCertificateType");
            return (Criteria) this;
        }

        public Criteria andUserCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("user_certificate_type not between", value1, value2, "userCertificateType");
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