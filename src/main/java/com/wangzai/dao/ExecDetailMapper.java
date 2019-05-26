package com.wangzai.dao;

import org.apache.ibatis.annotations.Param;
import com.wangzai.pojo.ExecDetail;
import com.wangzai.pojo.ExecDetailExample;

import java.util.List;


public interface ExecDetailMapper {

    long countByExample(ExecDetailExample example);

    int deleteByExample(ExecDetailExample example);

    int insert(ExecDetail record);

    int insertSelective(ExecDetail record);

    List<ExecDetail> selectByExample(ExecDetailExample example);

    int updateByExampleSelective(@Param("record") ExecDetail record, @Param("example") ExecDetailExample example);

    int updateByExample(@Param("record") ExecDetail record, @Param("example") ExecDetailExample example);
}