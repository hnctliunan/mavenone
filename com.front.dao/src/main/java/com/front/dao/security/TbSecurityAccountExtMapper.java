package com.front.dao.security;

import com.base.dao.BaseDao;
import com.entity.security.TbSecurityAccount;

import java.util.List;

/**
 * Created by admin on 2016/1/18.
 */
public interface TbSecurityAccountExtMapper extends BaseDao{
    public List<TbSecurityAccount> selectAllAccount() throws Exception;
}
