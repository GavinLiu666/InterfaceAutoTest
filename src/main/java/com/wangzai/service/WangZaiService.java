package com.wangzai.service;


import com.wangzai.dao.WangZaiMapper;
import com.wangzai.pojo.TestCaseDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WangZaiService {

    @Resource
    private WangZaiMapper wangZaiMapper;


    public List<TestCaseDetail> selectTestCaseDetail(String taskName){


        return wangZaiMapper.selectTestCaseDetail(taskName);

    }

}
