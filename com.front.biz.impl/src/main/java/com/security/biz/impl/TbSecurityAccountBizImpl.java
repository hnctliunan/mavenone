package com.security.biz.impl;

import com.alibaba.fastjson.JSONObject;
import com.base.biz.impl.BaseBizImpl;
import com.entity.security.TbSecurityAccount;
import com.entity.security.TbSecurityAccountExample;
import com.front.dao.security.TbSecurityAccountExtMapper;
import com.security.biz.ITbSecurityAccountBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSecurityAccountBizImpl extends BaseBizImpl implements ITbSecurityAccountBiz {
//    @Autowired
//    private TbSecurityAccountMapper objSecurityAccountMapper;

    @Autowired
    private TbSecurityAccountExtMapper objSecurityAccountExtMapper;

    @Override
    public JSONObject queryList(){
        JSONObject jsnResult = new JSONObject();
        TbSecurityAccountExample example = new TbSecurityAccountExample();
        List<TbSecurityAccount> lis =  this.objSecurityAccountExtMapper.selectAllAccount();
//        return JsonResult.result(true,"成功!",tbSecurityAccounts);
        System.out.println("===================="+lis);
        return null;
    }

}
