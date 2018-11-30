package com.zmy.erp.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Log implements Serializable {

    private Long userId;
    private String message;
    private Timestamp createTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Log(Long userId, String message) {
        this.userId = userId;
        this.message = message;
        this.createTime = new Timestamp(System.currentTimeMillis());
    }
}