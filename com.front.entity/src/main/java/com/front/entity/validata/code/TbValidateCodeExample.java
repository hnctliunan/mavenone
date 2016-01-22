package com.front.entity.validata.code;

import com.base.papper.PageSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbValidateCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected PageSet pageSet;

    public TbValidateCodeExample() {
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNull() {
            addCriterion("verify_code is null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNotNull() {
            addCriterion("verify_code is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeEqualTo(String value) {
            addCriterion("verify_code =", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotEqualTo(String value) {
            addCriterion("verify_code <>", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThan(String value) {
            addCriterion("verify_code >", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("verify_code >=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThan(String value) {
            addCriterion("verify_code <", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThanOrEqualTo(String value) {
            addCriterion("verify_code <=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLike(String value) {
            addCriterion("verify_code like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotLike(String value) {
            addCriterion("verify_code not like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIn(List<String> values) {
            addCriterion("verify_code in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotIn(List<String> values) {
            addCriterion("verify_code not in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeBetween(String value1, String value2) {
            addCriterion("verify_code between", value1, value2, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotBetween(String value1, String value2) {
            addCriterion("verify_code not between", value1, value2, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIsNull() {
            addCriterion("info_type is null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIsNotNull() {
            addCriterion("info_type is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTypeEqualTo(String value) {
            addCriterion("info_type =", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotEqualTo(String value) {
            addCriterion("info_type <>", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThan(String value) {
            addCriterion("info_type >", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("info_type >=", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThan(String value) {
            addCriterion("info_type <", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLessThanOrEqualTo(String value) {
            addCriterion("info_type <=", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeLike(String value) {
            addCriterion("info_type like", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotLike(String value) {
            addCriterion("info_type not like", value, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeIn(List<String> values) {
            addCriterion("info_type in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotIn(List<String> values) {
            addCriterion("info_type not in", values, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeBetween(String value1, String value2) {
            addCriterion("info_type between", value1, value2, "infoType");
            return (Criteria) this;
        }

        public Criteria andInfoTypeNotBetween(String value1, String value2) {
            addCriterion("info_type not between", value1, value2, "infoType");
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

        public Criteria andDataStatusIsNull() {
            addCriterion("data_status is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("data_status is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(String value) {
            addCriterion("data_status =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(String value) {
            addCriterion("data_status <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(String value) {
            addCriterion("data_status >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(String value) {
            addCriterion("data_status >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(String value) {
            addCriterion("data_status <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(String value) {
            addCriterion("data_status <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLike(String value) {
            addCriterion("data_status like", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotLike(String value) {
            addCriterion("data_status not like", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<String> values) {
            addCriterion("data_status in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<String> values) {
            addCriterion("data_status not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(String value1, String value2) {
            addCriterion("data_status between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(String value1, String value2) {
            addCriterion("data_status not between", value1, value2, "dataStatus");
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