package com.zmy.erp.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Perm implements Serializable {

    private Long id;

    private Long version;

    private String code;

    private String permName;

    private String authType;

    private String authString;

    private Long resLevel;

    private Long crtId;

    private String crtUser;

    private Timestamp crtDt;

    private Long optId;

    private String optUser;

    private Timestamp optDt;

    private Long roleType;

    private String isValid;

    private String remark;

    private String permId;

    private String permDescribe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getAuthString() {
        return authString;
    }

    public void setAuthString(String authString) {
        this.authString = authString;
    }

    public Long getResLevel() {
        return resLevel;
    }

    public void setResLevel(Long resLevel) {
        this.resLevel = resLevel;
    }

    public Long getCrtId() {
        return crtId;
    }

    public void setCrtId(Long crtId) {
        this.crtId = crtId;
    }

    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser;
    }

    public Timestamp getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Timestamp crtDt) {
        this.crtDt = crtDt;
    }

    public Long getOptId() {
        return optId;
    }

    public void setOptId(Long optId) {
        this.optId = optId;
    }

    public String getOptUser() {
        return optUser;
    }

    public void setOptUser(String optUser) {
        this.optUser = optUser;
    }

    public Timestamp getOptDt() {
        return optDt;
    }

    public void setOptDt(Timestamp optDt) {
        this.optDt = optDt;
    }

    public Long getRoleType() {
        return roleType;
    }

    public void setRoleType(Long roleType) {
        this.roleType = roleType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPermId() {
        return permId;
    }

    public void setPermId(String permId) {
        this.permId = permId;
    }

    public String getPermDescribe() {
        return permDescribe;
    }

    public void setPermDescribe(String permDescribe) {
        this.permDescribe = permDescribe;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
}