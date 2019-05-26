package com.wangzai.pojo;

import java.util.Date;

public class TestCaseDetail {

    private Long id;

    private String testCaseName;

    private String url;

    private String param;
    private String taskname;
    private Date execTime;
    private String execResponse;
    private short isExpected;
    private String statusLine;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public Date getExecTime() {
        return execTime;
    }

    public void setExecTime(Date execTime) {
        this.execTime = execTime;
    }

    public String getExecResponse() {
        return execResponse;
    }

    public void setExecResponse(String execResponse) {
        this.execResponse = execResponse;
    }

    public short getIsExpected() {
        return isExpected;
    }

    public void setIsExpected(short isExpected) {
        this.isExpected = isExpected;
    }

    public String getStatusLine() {
        return statusLine;
    }

    public void setStatusLine(String statusLine) {
        this.statusLine = statusLine;
    }
}
