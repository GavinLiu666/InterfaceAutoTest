package com.wangzai.dao;

import com.wangzai.pojo.RequestInfo;
import com.wangzai.pojo.RequestInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RequestInfoMapper {
    long countByExample(RequestInfoExample example);

    int deleteByExample(RequestInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RequestInfo record);

    int insertSelective(RequestInfo record);

    List<RequestInfo> selectByExample(RequestInfoExample example);

    RequestInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RequestInfo record, @Param("example") RequestInfoExample example);

    int updateByExample(@Param("record") RequestInfo record, @Param("example") RequestInfoExample example);

    int updateByPrimaryKeySelective(RequestInfo record);

    int updateByPrimaryKey(RequestInfo record);
}