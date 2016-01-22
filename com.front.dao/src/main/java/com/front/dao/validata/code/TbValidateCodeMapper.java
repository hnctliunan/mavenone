package com.front.dao.validata.code;

import com.base.dao.BaseDao;
import com.front.entity.validata.code.TbValidateCode;
import com.front.entity.validata.code.TbValidateCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbValidateCodeMapper extends BaseDao {
    int countByExample(TbValidateCodeExample example);

    int deleteByExample(TbValidateCodeExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbValidateCode record);

    int insertSelective(TbValidateCode record);

    List<TbValidateCode> selectByExample(TbValidateCodeExample example);

    TbValidateCode selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbValidateCode record, @Param("example") TbValidateCodeExample example);

    int updateByExample(@Param("record") TbValidateCode record, @Param("example") TbValidateCodeExample example);

    int updateByPrimaryKeySelective(TbValidateCode record);

    int updateByPrimaryKey(TbValidateCode record);

    void batchInsert(@Param("records") List<TbValidateCode> records);

    void batchUpdateByPrimaryKey(@Param("records") List<TbValidateCode> records);

    void batchDeleteByPrimaryKey(@Param("records") List<String> records);
}