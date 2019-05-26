package com.wangzai.pojo;

import java.util.Date;

public class ExecRecord {
    private Long id;

    private String taskName;

    private Date updateTime;

    private Integer testCaseNum;

    private Integer testCaseNumSucceed;

    private Integer testCaseNumFailed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getTestCaseNum() {
        return testCaseNum;
    }

    public void setTestCaseNum(Integer testCaseNum) {
        this.testCaseNum = testCaseNum;
    }

    public Integer getTestCaseNumSucceed() {
        return testCaseNumSucceed;
    }

    public void setTestCaseNumSucceed(Integer testCaseNumSucceed) {
        this.testCaseNumSucceed = testCaseNumSucceed;
    }

    public Integer getTestCaseNumFailed() {
        return testCaseNumFailed;
    }

    public void setTestCaseNumFailed(Integer testCaseNumFailed) {
        this.testCaseNumFailed = testCaseNumFailed;
    }
}