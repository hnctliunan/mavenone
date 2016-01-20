package com.security.biz.impl;

import com.alibaba.fastjson.JSONObject;
import com.base.biz.impl.BaseBizImpl;
import com.base.result.vo.JsonResult;
import com.base.utils.Guid;
import com.entity.security.TbSecurityAccount;
import com.entity.security.TbSecurityAccountExample;
import com.front.dao.security.TbSecurityAccountExtMapper;
import com.front.dao.security.TbSecurityAccountMapper;
import com.security.biz.ITbSecurityAccountBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSecurityAccountBizImpl extends BaseBizImpl implements ITbSecurityAccountBiz {
    @Autowired
    private TbSecurityAccountMapper objSecurityAccountMapper;

    @Autowired
    private TbSecurityAccountExtMapper objSecurityAccountExtMapper;

    @Override
    public JSONObject queryList() throws Exception {
        JSONObject jsnResult = new JSONObject();
        List<TbSecurityAccount> lis =  this.objSecurityAccountExtMapper.selectAllAccount();
        jsnResult.put("result",lis);
        return jsnResult;
    }

    @Override
    public JSONObject insertAccount() throws Exception {
        TbSecurityAccount objSecurityAccount = new TbSecurityAccount();
        objSecurityAccount.setDataId(Guid.get());
        objSecurityAccount.setLoginName("137000000000");
        objSecurityAccount.setLoginPass("123456");
        int iInsert = this.objSecurityAccountMapper.insert(objSecurityAccount);
        if (iInsert > 0) {
            return JsonResult.result(true,"数据入库成功",null);
        }
        return JsonResult.result(false,"数据入库失败",null);
    }
}
