package com.wangzai.pojo;

import java.util.Date;

public class ExecDetail {
    private String taskname;
    private Long urlId;
    private Date execTime;
    private String execResponse;
    private Boolean isExpected;
    private String statusLine;



    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    public Long getUrlId() {
        return urlId;
    }

    public void setUrlId(Long urlId) {
        this.urlId = urlId;
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
        this.execResponse = execResponse == null ? null : execResponse.trim();
    }

    public Boolean getIsExpected() {
        return isExpected;
    }

    public void setIsExpected(Boolean isExpected) {
        this.isExpected = isExpected;
    }

    public void setStatusLine(String statusLine) {
        this.statusLine = statusLine;
    }

    public String getStatusLine() {
        return statusLine;
    }
}