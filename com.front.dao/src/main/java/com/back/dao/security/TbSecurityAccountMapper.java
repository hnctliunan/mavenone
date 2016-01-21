package com.back.dao.security;

import com.back.entity.security.TbSecurityAccount;
import com.back.entity.security.TbSecurityAccountExample;
import com.base.dao.BaseDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSecurityAccountMapper extends BaseDao {
    int countByExample(TbSecurityAccountExample example);

    int deleteByExample(TbSecurityAccountExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbSecurityAccount record) throws Exception;

    int insertSelective(TbSecurityAccount record);

    List<TbSecurityAccount> selectByExample(TbSecurityAccountExample example);

    TbSecurityAccount selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbSecurityAccount record, @Param("example") TbSecurityAccountExample example);

    int updateByExample(@Param("record") TbSecurityAccount record, @Param("example") TbSecurityAccountExample example);

    int updateByPrimaryKeySelective(TbSecurityAccount record);

    int updateByPrimaryKey(TbSecurityAccount record);

    void batchInsert(@Param("records") List<TbSecurityAccount> records);

    void batchUpdateByPrimaryKey(@Param("records") List<TbSecurityAccount> records);

    void batchDeleteByPrimaryKey(@Param("records") List<String> records);
}