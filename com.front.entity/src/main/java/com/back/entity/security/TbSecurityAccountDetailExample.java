package com.back.entity.security;

import com.base.papper.PageSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSecurityAccountDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected PageSet pageSet;

    public TbSecurityAccountDetailExample() {
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

        public Criteria andDetNameIsNull() {
            addCriterion("det_name is null");
            return (Criteria) this;
        }

        public Criteria andDetNameIsNotNull() {
            addCriterion("det_name is not null");
            return (Criteria) this;
        }

        public Criteria andDetNameEqualTo(String value) {
            addCriterion("det_name =", value, "detName");
            return (Criteria) this;
        }

        public Criteria andDetNameNotEqualTo(String value) {
            addCriterion("det_name <>", value, "detName");
            return (Criteria) this;
        }

        public Criteria andDetNameGreaterThan(String value) {
            addCriterion("det_name >", value, "detName");
            return (Criteria) this;
        }

        public Criteria andDetNameGreaterThanOrEqualTo(String value) {
            addCriterion("det_name >=", value, "detName");
            return (Criteria) this;
        }

        public Criteria andDetNameLessThan(String value) {
            addCriterion("det_name <", value, "detName");
            return (Criteria) this;
        }

        public Criteria andDetNameLessThanOrEqualTo(String value) {
            addCriterion("det_name <=", value, "detName");
            return (Criteria) this;
        }

        public Criteria andDetNameLike(String value) {
            addCriterion("det_name like", value, "detName");
            return (Criteria) this;
        }

        public Criteria andDetNameNotLike(String value) {
            addCriterion("det_name not like", value, "detName");
            return (Criteria) this;
        }

        public Criteria andDetNameIn(List<String> values) {
            addCriterion("det_name in", values, "detName");
            return (Criteria) this;
        }

        public Criteria andDetNameNotIn(List<String> values) {
            addCriterion("det_name not in", values, "detName");
            return (Criteria) this;
        }

        public Criteria andDetNameBetween(String value1, String value2) {
            addCriterion("det_name between", value1, value2, "detName");
            return (Criteria) this;
        }

        public Criteria andDetNameNotBetween(String value1, String value2) {
            addCriterion("det_name not between", value1, value2, "detName");
            return (Criteria) this;
        }

        public Criteria andDetSexIsNull() {
            addCriterion("det_sex is null");
            return (Criteria) this;
        }

        public Criteria andDetSexIsNotNull() {
            addCriterion("det_sex is not null");
            return (Criteria) this;
        }

        public Criteria andDetSexEqualTo(String value) {
            addCriterion("det_sex =", value, "detSex");
            return (Criteria) this;
        }

        public Criteria andDetSexNotEqualTo(String value) {
            addCriterion("det_sex <>", value, "detSex");
            return (Criteria) this;
        }

        public Criteria andDetSexGreaterThan(String value) {
            addCriterion("det_sex >", value, "detSex");
            return (Criteria) this;
        }

        public Criteria andDetSexGreaterThanOrEqualTo(String value) {
            addCriterion("det_sex >=", value, "detSex");
            return (Criteria) this;
        }

        public Criteria andDetSexLessThan(String value) {
            addCriterion("det_sex <", value, "detSex");
            return (Criteria) this;
        }

        public Criteria andDetSexLessThanOrEqualTo(String value) {
            addCriterion("det_sex <=", value, "detSex");
            return (Criteria) this;
        }

        public Criteria andDetSexLike(String value) {
            addCriterion("det_sex like", value, "detSex");
            return (Criteria) this;
        }

        public Criteria andDetSexNotLike(String value) {
            addCriterion("det_sex not like", value, "detSex");
            return (Criteria) this;
        }

        public Criteria andDetSexIn(List<String> values) {
            addCriterion("det_sex in", values, "detSex");
            return (Criteria) this;
        }

        public Criteria andDetSexNotIn(List<String> values) {
            addCriterion("det_sex not in", values, "detSex");
            return (Criteria) this;
        }

        public Criteria andDetSexBetween(String value1, String value2) {
            addCriterion("det_sex between", value1, value2, "detSex");
            return (Criteria) this;
        }

        public Criteria andDetSexNotBetween(String value1, String value2) {
            addCriterion("det_sex not between", value1, value2, "detSex");
            return (Criteria) this;
        }

        public Criteria andDetCidIsNull() {
            addCriterion("det_cid is null");
            return (Criteria) this;
        }

        public Criteria andDetCidIsNotNull() {
            addCriterion("det_cid is not null");
            return (Criteria) this;
        }

        public Criteria andDetCidEqualTo(String value) {
            addCriterion("det_cid =", value, "detCid");
            return (Criteria) this;
        }

        public Criteria andDetCidNotEqualTo(String value) {
            addCriterion("det_cid <>", value, "detCid");
            return (Criteria) this;
        }

        public Criteria andDetCidGreaterThan(String value) {
            addCriterion("det_cid >", value, "detCid");
            return (Criteria) this;
        }

        public Criteria andDetCidGreaterThanOrEqualTo(String value) {
            addCriterion("det_cid >=", value, "detCid");
            return (Criteria) this;
        }

        public Criteria andDetCidLessThan(String value) {
            addCriterion("det_cid <", value, "detCid");
            return (Criteria) this;
        }

        public Criteria andDetCidLessThanOrEqualTo(String value) {
            addCriterion("det_cid <=", value, "detCid");
            return (Criteria) this;
        }

        public Criteria andDetCidLike(String value) {
            addCriterion("det_cid like", value, "detCid");
            return (Criteria) this;
        }

        public Criteria andDetCidNotLike(String value) {
            addCriterion("det_cid not like", value, "detCid");
            return (Criteria) this;
        }

        public Criteria andDetCidIn(List<String> values) {
            addCriterion("det_cid in", values, "detCid");
            return (Criteria) this;
        }

        public Criteria andDetCidNotIn(List<String> values) {
            addCriterion("det_cid not in", values, "detCid");
            return (Criteria) this;
        }

        public Criteria andDetCidBetween(String value1, String value2) {
            addCriterion("det_cid between", value1, value2, "detCid");
            return (Criteria) this;
        }

        public Criteria andDetCidNotBetween(String value1, String value2) {
            addCriterion("det_cid not between", value1, value2, "detCid");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberIsNull() {
            addCriterion("det_wrok_number is null");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberIsNotNull() {
            addCriterion("det_wrok_number is not null");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberEqualTo(String value) {
            addCriterion("det_wrok_number =", value, "detWrokNumber");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberNotEqualTo(String value) {
            addCriterion("det_wrok_number <>", value, "detWrokNumber");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberGreaterThan(String value) {
            addCriterion("det_wrok_number >", value, "detWrokNumber");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberGreaterThanOrEqualTo(String value) {
            addCriterion("det_wrok_number >=", value, "detWrokNumber");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberLessThan(String value) {
            addCriterion("det_wrok_number <", value, "detWrokNumber");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberLessThanOrEqualTo(String value) {
            addCriterion("det_wrok_number <=", value, "detWrokNumber");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberLike(String value) {
            addCriterion("det_wrok_number like", value, "detWrokNumber");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberNotLike(String value) {
            addCriterion("det_wrok_number not like", value, "detWrokNumber");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberIn(List<String> values) {
            addCriterion("det_wrok_number in", values, "detWrokNumber");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberNotIn(List<String> values) {
            addCriterion("det_wrok_number not in", values, "detWrokNumber");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberBetween(String value1, String value2) {
            addCriterion("det_wrok_number between", value1, value2, "detWrokNumber");
            return (Criteria) this;
        }

        public Criteria andDetWrokNumberNotBetween(String value1, String value2) {
            addCriterion("det_wrok_number not between", value1, value2, "detWrokNumber");
            return (Criteria) this;
        }

        public Criteria andDetMailIsNull() {
            addCriterion("det_mail is null");
            return (Criteria) this;
        }

        public Criteria andDetMailIsNotNull() {
            addCriterion("det_mail is not null");
            return (Criteria) this;
        }

        public Criteria andDetMailEqualTo(String value) {
            addCriterion("det_mail =", value, "detMail");
            return (Criteria) this;
        }

        public Criteria andDetMailNotEqualTo(String value) {
            addCriterion("det_mail <>", value, "detMail");
            return (Criteria) this;
        }

        public Criteria andDetMailGreaterThan(String value) {
            addCriterion("det_mail >", value, "detMail");
            return (Criteria) this;
        }

        public Criteria andDetMailGreaterThanOrEqualTo(String value) {
            addCriterion("det_mail >=", value, "detMail");
            return (Criteria) this;
        }

        public Criteria andDetMailLessThan(String value) {
            addCriterion("det_mail <", value, "detMail");
            return (Criteria) this;
        }

        public Criteria andDetMailLessThanOrEqualTo(String value) {
            addCriterion("det_mail <=", value, "detMail");
            return (Criteria) this;
        }

        public Criteria andDetMailLike(String value) {
            addCriterion("det_mail like", value, "detMail");
            return (Criteria) this;
        }

        public Criteria andDetMailNotLike(String value) {
            addCriterion("det_mail not like", value, "detMail");
            return (Criteria) this;
        }

        public Criteria andDetMailIn(List<String> values) {
            addCriterion("det_mail in", values, "detMail");
            return (Criteria) this;
        }

        public Criteria andDetMailNotIn(List<String> values) {
            addCriterion("det_mail not in", values, "detMail");
            return (Criteria) this;
        }

        public Criteria andDetMailBetween(String value1, String value2) {
            addCriterion("det_mail between", value1, value2, "detMail");
            return (Criteria) this;
        }

        public Criteria andDetMailNotBetween(String value1, String value2) {
            addCriterion("det_mail not between", value1, value2, "detMail");
            return (Criteria) this;
        }

        public Criteria andDetQqIsNull() {
            addCriterion("det_qq is null");
            return (Criteria) this;
        }

        public Criteria andDetQqIsNotNull() {
            addCriterion("det_qq is not null");
            return (Criteria) this;
        }

        public Criteria andDetQqEqualTo(String value) {
            addCriterion("det_qq =", value, "detQq");
            return (Criteria) this;
        }

        public Criteria andDetQqNotEqualTo(String value) {
            addCriterion("det_qq <>", value, "detQq");
            return (Criteria) this;
        }

        public Criteria andDetQqGreaterThan(String value) {
            addCriterion("det_qq >", value, "detQq");
            return (Criteria) this;
        }

        public Criteria andDetQqGreaterThanOrEqualTo(String value) {
            addCriterion("det_qq >=", value, "detQq");
            return (Criteria) this;
        }

        public Criteria andDetQqLessThan(String value) {
            addCriterion("det_qq <", value, "detQq");
            return (Criteria) this;
        }

        public Criteria andDetQqLessThanOrEqualTo(String value) {
            addCriterion("det_qq <=", value, "detQq");
            return (Criteria) this;
        }

        public Criteria andDetQqLike(String value) {
            addCriterion("det_qq like", value, "detQq");
            return (Criteria) this;
        }

        public Criteria andDetQqNotLike(String value) {
            addCriterion("det_qq not like", value, "detQq");
            return (Criteria) this;
        }

        public Criteria andDetQqIn(List<String> values) {
            addCriterion("det_qq in", values, "detQq");
            return (Criteria) this;
        }

        public Criteria andDetQqNotIn(List<String> values) {
            addCriterion("det_qq not in", values, "detQq");
            return (Criteria) this;
        }

        public Criteria andDetQqBetween(String value1, String value2) {
            addCriterion("det_qq between", value1, value2, "detQq");
            return (Criteria) this;
        }

        public Criteria andDetQqNotBetween(String value1, String value2) {
            addCriterion("det_qq not between", value1, value2, "detQq");
            return (Criteria) this;
        }

        public Criteria andDetAddressIsNull() {
            addCriterion("det_address is null");
            return (Criteria) this;
        }

        public Criteria andDetAddressIsNotNull() {
            addCriterion("det_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetAddressEqualTo(String value) {
            addCriterion("det_address =", value, "detAddress");
            return (Criteria) this;
        }

        public Criteria andDetAddressNotEqualTo(String value) {
            addCriterion("det_address <>", value, "detAddress");
            return (Criteria) this;
        }

        public Criteria andDetAddressGreaterThan(String value) {
            addCriterion("det_address >", value, "detAddress");
            return (Criteria) this;
        }

        public Criteria andDetAddressGreaterThanOrEqualTo(String value) {
            addCriterion("det_address >=", value, "detAddress");
            return (Criteria) this;
        }

        public Criteria andDetAddressLessThan(String value) {
            addCriterion("det_address <", value, "detAddress");
            return (Criteria) this;
        }

        public Criteria andDetAddressLessThanOrEqualTo(String value) {
            addCriterion("det_address <=", value, "detAddress");
            return (Criteria) this;
        }

        public Criteria andDetAddressLike(String value) {
            addCriterion("det_address like", value, "detAddress");
            return (Criteria) this;
        }

        public Criteria andDetAddressNotLike(String value) {
            addCriterion("det_address not like", value, "detAddress");
            return (Criteria) this;
        }

        public Criteria andDetAddressIn(List<String> values) {
            addCriterion("det_address in", values, "detAddress");
            return (Criteria) this;
        }

        public Criteria andDetAddressNotIn(List<String> values) {
            addCriterion("det_address not in", values, "detAddress");
            return (Criteria) this;
        }

        public Criteria andDetAddressBetween(String value1, String value2) {
            addCriterion("det_address between", value1, value2, "detAddress");
            return (Criteria) this;
        }

        public Criteria andDetAddressNotBetween(String value1, String value2) {
            addCriterion("det_address not between", value1, value2, "detAddress");
            return (Criteria) this;
        }

        public Criteria andDetBirthdayIsNull() {
            addCriterion("det_birthday is null");
            return (Criteria) this;
        }

        public Criteria andDetBirthdayIsNotNull() {
            addCriterion("det_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andDetBirthdayEqualTo(Date value) {
            addCriterion("det_birthday =", value, "detBirthday");
            return (Criteria) this;
        }

        public Criteria andDetBirthdayNotEqualTo(Date value) {
            addCriterion("det_birthday <>", value, "detBirthday");
            return (Criteria) this;
        }

        public Criteria andDetBirthdayGreaterThan(Date value) {
            addCriterion("det_birthday >", value, "detBirthday");
            return (Criteria) this;
        }

        public Criteria andDetBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("det_birthday >=", value, "detBirthday");
            return (Criteria) this;
        }

        public Criteria andDetBirthdayLessThan(Date value) {
            addCriterion("det_birthday <", value, "detBirthday");
            return (Criteria) this;
        }

        public Criteria andDetBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("det_birthday <=", value, "detBirthday");
            return (Criteria) this;
        }

        public Criteria andDetBirthdayIn(List<Date> values) {
            addCriterion("det_birthday in", values, "detBirthday");
            return (Criteria) this;
        }

        public Criteria andDetBirthdayNotIn(List<Date> values) {
            addCriterion("det_birthday not in", values, "detBirthday");
            return (Criteria) this;
        }

        public Criteria andDetBirthdayBetween(Date value1, Date value2) {
            addCriterion("det_birthday between", value1, value2, "detBirthday");
            return (Criteria) this;
        }

        public Criteria andDetBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("det_birthday not between", value1, value2, "detBirthday");
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