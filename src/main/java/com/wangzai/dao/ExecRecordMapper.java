package com.wangzai.dao;

import org.apache.ibatis.annotations.Param;
import com.wangzai.pojo.ExecRecord;
import com.wangzai.pojo.ExecRecordExample;

import java.util.List;

public interface ExecRecordMapper {
    long countByExample(ExecRecordExample example);

    int deleteByExample(ExecRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExecRecord record);

    int insertSelective(ExecRecord record);

    List<ExecRecord> selectByExample(ExecRecordExample example);

    ExecRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExecRecord record, @Param("example") ExecRecordExample example);

    int updateByExample(@Param("record") ExecRecord record, @Param("example") ExecRecordExample example);

    int updateByPrimaryKeySelective(ExecRecord record);

    int updateByPrimaryKey(ExecRecord record);
}