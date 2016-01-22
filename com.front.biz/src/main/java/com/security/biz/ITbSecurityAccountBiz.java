package com.security.biz;

import com.alibaba.fastjson.JSONObject;
import com.base.datasource.DataSourceServer;
import com.base.datasource.DataSourceSet;

/**
 * Created by admin on 2016/1/11.
 */
public interface ITbSecurityAccountBiz {
    public JSONObject insertAccount() throws Exception;

    public JSONObject visterAccount() throws Exception;

    @DataSourceSet(DataSourceServer.Master)
    public void queryMaster() throws Exception;

    @DataSourceSet(DataSourceServer.Slave)
    public void querySlave() throws Exception;
}
