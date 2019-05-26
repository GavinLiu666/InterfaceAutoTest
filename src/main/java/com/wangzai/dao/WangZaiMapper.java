package com.wangzai.dao;

import com.wangzai.pojo.TestCaseDetail;

import java.util.List;

public interface WangZaiMapper {

    List<TestCaseDetail> selectTestCaseDetail(String taskName);


}
