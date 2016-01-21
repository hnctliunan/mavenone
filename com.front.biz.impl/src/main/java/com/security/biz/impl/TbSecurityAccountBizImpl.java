package com.security.biz.impl;

import com.alibaba.fastjson.JSONObject;
//import com.back.dao.security.TbBackSecurityAccountMapper;
import com.back.dao.security.TbSecurityAccountDetailMapper;
import com.back.dao.security.TbSecurityAccountMapper;
import com.back.entity.security.TbSecurityAccount;
import com.back.entity.security.TbSecurityAccountDetail;
import com.base.biz.impl.BaseBizImpl;
import com.base.result.vo.JsonResult;
import com.base.utils.Guid;

import com.entity.security.TbSecurityCustomer;
import com.front.dao.security.TbSecurityCustomerMapper;
import com.security.biz.ITbSecurityAccountBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class TbSecurityAccountBizImpl extends BaseBizImpl implements ITbSecurityAccountBiz {

    @Autowired
    private TbSecurityAccountMapper objSecurityAccountMapper;

    @Autowired
    private TbSecurityCustomerMapper objSecurityCustomerMapper;

    @Autowired
    private TbSecurityAccountDetailMapper objSecurityAccountDetailMapper;

    @Override
//    @Transactional
    public JSONObject insertAccount() throws Exception {
        TbSecurityAccount objSecurityAccount = new TbSecurityAccount();
        objSecurityAccount.setDataId(Guid.get());
        objSecurityAccount.setLoginName("137000000000");
        objSecurityAccount.setLoginPass("123456");
        objSecurityAccount.setDataInsertTime(new Date());
        objSecurityAccount.setDataEnable(1);
        int iInsert = this.objSecurityAccountMapper.insert(objSecurityAccount);
        TbSecurityAccountDetail objAccountDetail = new TbSecurityAccountDetail();
        objAccountDetail.setDataId(Guid.get());
        this.objSecurityAccountDetailMapper.insert(objAccountDetail);
        return JsonResult.result(false,"数据入库失败",null);
    }
//    @Transactional(value = "backTransactionManager",propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
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
        this.objSecurityAccountDetailMapper.insert(objAccountDetail);
        return JsonResult.result(false,"数据入库失败",null);
    }
}
