package com.back.dao.security;

import com.back.entity.security.TbSecurityAccountDetail;
import com.back.entity.security.TbSecurityAccountDetailExample;
import com.base.dao.BaseDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSecurityAccountDetailMapper extends BaseDao {
    int countByExample(TbSecurityAccountDetailExample example);

    int deleteByExample(TbSecurityAccountDetailExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbSecurityAccountDetail record) throws  Exception;

    int insertSelective(TbSecurityAccountDetail record);

    List<TbSecurityAccountDetail> selectByExample(TbSecurityAccountDetailExample example);

    TbSecurityAccountDetail selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbSecurityAccountDetail record, @Param("example") TbSecurityAccountDetailExample example);

    int updateByExample(@Param("record") TbSecurityAccountDetail record, @Param("example") TbSecurityAccountDetailExample example);

    int updateByPrimaryKeySelective(TbSecurityAccountDetail record);

    int updateByPrimaryKey(TbSecurityAccountDetail record);

    void batchInsert(@Param("records") List<TbSecurityAccountDetail> records);

    void batchUpdateByPrimaryKey(@Param("records") List<TbSecurityAccountDetail> records);

    void batchDeleteByPrimaryKey(@Param("records") List<String> records);
}