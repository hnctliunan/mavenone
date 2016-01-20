package com.front.security;

import com.alibaba.fastjson.JSONObject;
import com.security.biz.ITbSecurityAccountBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:data-source.xml"})
public class TestSecurity {
    @Autowired
    private ITbSecurityAccountBiz iTbSecurityAccountBiz;
    @Test
    public void test1(){
        JSONObject jsonObject = null;
        try {
            jsonObject = this.iTbSecurityAccountBiz.queryList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("***********************" + jsonObject);
    }
}
