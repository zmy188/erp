package com.zmy.erp.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Role implements Serializable {

    private Long id;

    private Long version;

    private String code;

    private String nameCn;

    private String nameEn;

    private String nameGb;

    private Long crtId;

    private String crtUser;

    private Timestamp crtDt;

    private Long optId;

    private String optUser;

    private Timestamp optDt;

    private Long roleType;

    private Long isValid;

    private String remark;

    private String companyId;

    private String roleDescribe;

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

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameGb() {
        return nameGb;
    }

    public void setNameGb(String nameGb) {
        this.nameGb = nameGb;
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

    public Long getIsValid() {
        return isValid;
    }

    public void setIsValid(Long isValid) {
        this.isValid = isValid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe;
    }

    public Role(String code, String nameCn, String roleDescribe) {
        this.code = code;
        this.nameCn = nameCn;
        this.roleDescribe = roleDescribe;
        this.crtDt = new Timestamp(System.currentTimeMillis());
        optDt = new Timestamp(System.currentTimeMillis());
    }
}