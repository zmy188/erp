package com.zmy.erp.domain;

import java.io.Serializable;
import java.sql.Timestamp;


public class User implements Serializable {

    private Long id;

    private String loginName;

    private String loginPwd;

    private String status;

    private String bindPhone;

    private String idNo;

    private String userRole;

    private Timestamp lastLoginDt;

    private String isValid;

    private String remark;

    private String crtId;

    private Timestamp lastUpdDt;

    private String lastUpdId;

    private String lastOprCode;

    private String companyId;

    private String userName;

    private Timestamp crt_dt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBindPhone() {
        return bindPhone;
    }

    public void setBindPhone(String bindPhone) {
        this.bindPhone = bindPhone;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }



    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCrtId() {
        return crtId;
    }

    public void setCrtId(String crtId) {
        this.crtId = crtId;
    }

    public String getLastUpdId() {
        return lastUpdId;
    }

    public void setLastUpdId(String lastUpdId) {
        this.lastUpdId = lastUpdId;
    }

    public String getLastOprCode() {
        return lastOprCode;
    }

    public void setLastOprCode(String lastOprCode) {
        this.lastOprCode = lastOprCode;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getLastLoginDt() {
        return lastLoginDt;
    }

    public void setLastLoginDt(Timestamp lastLoginDt) {
        this.lastLoginDt = lastLoginDt;
    }

    public Timestamp getLastUpdDt() {
        return lastUpdDt;
    }

    public void setLastUpdDt(Timestamp lastUpdDt) {
        this.lastUpdDt = lastUpdDt;
    }

    public Timestamp getCrt_dt() {
        return crt_dt;
    }

    public void setCrt_dt(Timestamp crt_dt) {
        this.crt_dt = crt_dt;
    }

    public User(String loginName, String loginPwd) {
        this.loginName = loginName;
        this.loginPwd = loginPwd;
    }

    public User(Long id, String loginName, String loginPwd, String status, String bindPhone, String idNo, String userRole, Timestamp lastLoginDt, String isValid, String remark, String crtId, Timestamp lastUpdDt, String lastUpdId, String lastOprCode, String companyId, String userName, Timestamp crt_dt) {
        this.id = id;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.status = status;
        this.bindPhone = bindPhone;
        this.idNo = idNo;
        this.userRole = userRole;
        this.lastLoginDt = lastLoginDt;
        this.isValid = isValid;
        this.remark = remark;
        this.crtId = crtId;
        this.lastUpdDt = lastUpdDt;
        this.lastUpdId = lastUpdId;
        this.lastOprCode = lastOprCode;
        this.companyId = companyId;
        this.userName = userName;
        this.crt_dt = crt_dt;
    }
}