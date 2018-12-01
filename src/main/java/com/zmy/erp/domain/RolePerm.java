package com.zmy.erp.domain;

import java.io.Serializable;

public class RolePerm implements Serializable {
    private Long id;

    private Long roleId;

    private Long permId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermId() {
        return permId;
    }

    public void setPermId(Long permId) {
        this.permId = permId;
    }

    public RolePerm(Long roleId, Long permId) {
        this.roleId = roleId;
        this.permId = permId;
    }
}