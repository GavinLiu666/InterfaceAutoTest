package com.wangzai.controller;


import com.wangzai.pojo.ExecDetail;
import com.wangzai.pojo.RequestInfo;
import com.wangzai.pojo.TestCaseDetail;
import com.wangzai.service.HttpClientHandler;
import com.wangzai.service.UploadService;
import com.wangzai.service.WangZaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RestController
@RequestMapping("/autoTest")
public class Controller1 {


    @Autowired
    private HttpClientHandler httpClientHandler;
    @Autowired
    private WangZaiService wangZaiService;
    @Autowired
    private UploadService uploadService;

    @RequestMapping("/test1")
    @ResponseBody
    public List<ExecDetail> selectDetail(String taskName) {
        return httpClientHandler.execAllRequest(taskName);
    }

    @RequestMapping("/test2")
    @ResponseBody
    public List<TestCaseDetail> selectTestCaseDetail(String taskName) {
        return wangZaiService.selectTestCaseDetail(taskName);
    }

    @RequestMapping("/test3")
    @ResponseBody
    public List<RequestInfo> uploadCaseFile(@RequestParam("uploadfile") MultipartFile file) {
        return uploadService.uploadFile(file);
    }




}
