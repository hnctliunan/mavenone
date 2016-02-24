package com.front.dao.security;

import com.base.dao.BaseDao;
import com.entity.security.TbSecurityCustomer;
import com.entity.security.TbSecurityCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.Cacheable;

public interface TbSecurityCustomerMapper extends BaseDao {
    int countByExample(TbSecurityCustomerExample example);

    int deleteByExample(TbSecurityCustomerExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbSecurityCustomer record);

    int insertSelective(TbSecurityCustomer record);

    List<TbSecurityCustomer> selectByExample(TbSecurityCustomerExample example);

    TbSecurityCustomer selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbSecurityCustomer record, @Param("example") TbSecurityCustomerExample example);

    int updateByExample(@Param("record") TbSecurityCustomer record, @Param("example") TbSecurityCustomerExample example);

    int updateByPrimaryKeySelective(TbSecurityCustomer record);

    int updateByPrimaryKey(TbSecurityCustomer record);

    void batchInsert(@Param("records") List<TbSecurityCustomer> records);

    void batchUpdateByPrimaryKey(@Param("records") List<TbSecurityCustomer> records);

    void batchDeleteByPrimaryKey(@Param("records") List<String> records);
}