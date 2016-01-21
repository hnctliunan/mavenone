package com.security.biz;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by admin on 2016/1/11.
 */
public interface ITbSecurityAccountBiz {
    public JSONObject insertAccount() throws Exception;

    public JSONObject visterAccount() throws Exception;
}
