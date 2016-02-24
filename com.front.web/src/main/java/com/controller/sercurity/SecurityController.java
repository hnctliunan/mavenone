package com.controller.sercurity;

import com.alibaba.fastjson.JSONObject;
import com.base.controller.BaseController;
import com.entity.security.TbSecurityCustomer;
import com.front.entity.validata.code.TbValidateCode;
import com.security.biz.ITbSecurityAccountBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2016/1/19.
 */
@Controller
@RequestMapping("/security")
public class SecurityController extends BaseController{
    @Autowired
    private ITbSecurityAccountBiz objSecurityAccountBiz;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        JSONObject jsonObject = null;
        try {
//            jsonObject = this.objSecurityAccountBiz.queryList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("******************"+jsonObject);
        return "account/test";
    }

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public String insert(HttpServletRequest request) {
        try {
//            this.objSecurityAccountBiz.insertAccount();
//            this.objSecurityAccountBiz.visterAccount();
            this.objSecurityAccountBiz.queryMaster();
            this.objSecurityAccountBiz.querySlave();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "account/test";
    }

    @RequestMapping(value = "/testCache",method = RequestMethod.GET)
    public String testCache(HttpServletRequest request) {
        try {
            TbSecurityCustomer tbSecurityCustomer = this.objSecurityAccountBiz.testCache();
            System.out.println("++++++++++++++++++++++++"+tbSecurityCustomer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "account/test";
    }
}
