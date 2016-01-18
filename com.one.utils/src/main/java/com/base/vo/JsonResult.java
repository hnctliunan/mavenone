package com.base.vo;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by admin on 2016/1/11.
 */
public class JsonResult {
    static JSONObject jsnResult = new JSONObject();
    public static JSONObject result(boolean bIsSuccess,String strMessage,Object obj) {
        jsnResult.put("success",bIsSuccess);
        jsnResult.put("message",strMessage);
        jsnResult.put("result",obj);
        return jsnResult;
    }
}
