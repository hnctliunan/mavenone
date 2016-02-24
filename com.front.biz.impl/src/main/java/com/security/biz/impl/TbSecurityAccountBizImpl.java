package com.security.biz.impl;

import com.alibaba.fastjson.JSONObject;
import com.back.dao.security.TbSecurityAccountDetailMapper;
import com.back.dao.security.TbSecurityAccountMapper;
import com.entity.security.TbSecurityCustomerExample;
import com.front.dao.validata.code.TbValidateCodeMapper;
import com.back.entity.security.TbSecurityAccount;
import com.back.entity.security.TbSecurityAccountDetail;
import com.base.biz.impl.BaseBizImpl;
import com.base.result.vo.JsonResult;
import com.base.utils.Guid;

import com.entity.security.TbSecurityCustomer;
import com.front.dao.security.TbSecurityCustomerMapper;
import com.front.entity.validata.code.TbValidateCode;
import com.security.biz.ITbSecurityAccountBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class TbSecurityAccountBizImpl extends BaseBizImpl implements ITbSecurityAccountBiz {

    //    @Autowired
    private TbSecurityAccountMapper objSecurityAccountMapper;

    @Autowired
    private TbSecurityCustomerMapper objSecurityCustomerMapper;

    //    @Autowired
    private TbSecurityAccountDetailMapper objSecurityAccountDetailMapper;

    @Autowired
    private TbValidateCodeMapper objValidateCodeMapper;

    @Override
    @Transactional(value = "frontTransactionManager",propagation = Propagation.REQUIRED)
    public JSONObject insertAccount() throws Exception {
        TbSecurityCustomer objSecurityCustomer = new TbSecurityCustomer();
        objSecurityCustomer.setDataId(Guid.get());
        objSecurityCustomer.setDataEnable(1);
        objSecurityCustomer.setDataInsertTime(new Date());
        int iInsert = this.objSecurityCustomerMapper.insert(objSecurityCustomer);
        TbValidateCode objValidateCode = new TbValidateCode();
        objValidateCode.setDataId(Guid.get());
        objValidateCode.setDataEnable(1);
        objValidateCode.setDataInsertTime(new Date());
//        objValidateCode.setInfoType("1");
        this.objValidateCodeMapper.insert(objValidateCode);
        return JsonResult.result(false,"数据入库失败",null);
    }
    @Transactional(value = "backTransactionManager",propagation = Propagation.REQUIRED)
    @Override
    public JSONObject visterAccount() throws Exception {
        TbSecurityAccount objSecurityAccount = new TbSecurityAccount();
        objSecurityAccount.setDataId(Guid.get());
        objSecurityAccount.setLoginName("137000000000");
        objSecurityAccount.setLoginPass("123456");
        objSecurityAccount.setDataInsertTime(new Date());
        objSecurityAccount.setDataEnable(1);
        int iInsert = this.objSecurityAccountMapper.insert(objSecurityAccount);
        TbSecurityAccountDetail objAccountDetail = new TbSecurityAccountDetail();
        objAccountDetail.setDataId(Guid.get());
        objAccountDetail.setDataEnable(1);
        objAccountDetail.setDataInsertTime(new Date());
        this.objSecurityAccountDetailMapper.insert(objAccountDetail);
        return JsonResult.result(false,"数据入库失败",null);
    }

    @Override
    public void queryMaster() throws Exception {
        TbSecurityCustomerExample example = new TbSecurityCustomerExample();
        List<TbSecurityCustomer> tbSecurityCustomers = this.objSecurityCustomerMapper.selectByExample(example);
        this.logger.info("*****************************主库=" + tbSecurityCustomers.size());

    }

    @Override
    public void querySlave() throws Exception {
        TbSecurityCustomerExample example = new TbSecurityCustomerExample();
        List<TbSecurityCustomer> tbSecurityCustomers = this.objSecurityCustomerMapper.selectByExample(example);
        this.logger.info("********=============***************从库="+tbSecurityCustomers.size());
    }

    @Override
//    @Cacheable(value = "dictCatlogCache")
    @CacheEvict(value = "dictCatlogCache")
    public TbSecurityCustomer testCache() throws Exception {
        long lBegin = System.nanoTime();
        this.logger.info("********lBegin="+lBegin);
        TbSecurityCustomer tbSecurityCustomer = this.objSecurityCustomerMapper.selectByPrimaryKey("7bdd15a8efe64ef48bf86e85164f76ec");
        this.logger.info("********mobile="+tbSecurityCustomer.getUserMobile());
        long lEnd = System.nanoTime();
        this.logger.info("********lEnd="+lEnd);
        this.logger.info("********time="+(lEnd-lBegin));
        return tbSecurityCustomer;
    }
}
