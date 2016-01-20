package com.security.biz.impl;

import com.alibaba.fastjson.JSONObject;
import com.base.biz.impl.BaseBizImpl;
import com.base.result.vo.JsonResult;
import com.base.utils.Guid;
import com.entity.security.TbSecurityAccount;
import com.entity.security.TbSecurityAccountExample;
import com.entity.security.TbSecurityCustomer;
import com.front.dao.security.TbSecurityAccountExtMapper;
import com.front.dao.security.TbSecurityAccountMapper;
import com.front.dao.security.TbSecurityCustomerMapper;
import com.security.biz.ITbSecurityAccountBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class TbSecurityAccountBizImpl extends BaseBizImpl implements ITbSecurityAccountBiz {
    @Autowired
    private TbSecurityAccountMapper objSecurityAccountMapper;

    @Autowired
    private TbSecurityAccountExtMapper objSecurityAccountExtMapper;

    @Autowired
    private TbSecurityCustomerMapper objSecurityCustomerMapper;

    @Override
    public JSONObject queryList() throws Exception {
        JSONObject jsnResult = new JSONObject();
        List<TbSecurityAccount> lis =  this.objSecurityAccountExtMapper.selectAllAccount();
        jsnResult.put("result",lis);
        return jsnResult;
    }

    @Override
    @Transactional
    public JSONObject insertAccount() throws Exception {
        TbSecurityAccount objSecurityAccount = new TbSecurityAccount();
        objSecurityAccount.setDataId(Guid.get());
        objSecurityAccount.setLoginName("137000000000");
        objSecurityAccount.setLoginPass("123456");
        objSecurityAccount.setDataInsertTime(new Date());
        int iInsert = this.objSecurityAccountMapper.insert(objSecurityAccount);
        TbSecurityCustomer objSecurityCustomer = new TbSecurityCustomer();
        objSecurityCustomer.setDataId(Guid.get());
        objSecurityCustomer.setDataEnable(1);
        int iInsert2 = this.objSecurityCustomerMapper.insert(objSecurityCustomer);
        return JsonResult.result(false,"数据入库失败",null);
    }
    @Override
    public JSONObject visterAccount() throws Exception {
        TbSecurityAccount objSecurityAccount = new TbSecurityAccount();
        objSecurityAccount.setDataId(Guid.get());
        objSecurityAccount.setLoginName("137000000000");
        objSecurityAccount.setLoginPass("123456");
        objSecurityAccount.setDataInsertTime(new Date());
        objSecurityAccount.setDataEnable(1);
        int iInsert = this.objSecurityAccountMapper.insert(objSecurityAccount);
        TbSecurityCustomer objSecurityCustomer = new TbSecurityCustomer();
        objSecurityCustomer.setDataId(Guid.get());
        objSecurityCustomer.setDataEnable(1);
        int iInsert2 = this.objSecurityCustomerMapper.insert(objSecurityCustomer);
        return JsonResult.result(false,"数据入库失败",null);
    }
}
