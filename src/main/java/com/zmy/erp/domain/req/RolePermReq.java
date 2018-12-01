package com.zmy.erp.domain.req;

public class RolePermReq {
    private Long roleId;

    private Long[] permIds;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long[] getPermIds() {
        return permIds;
    }

    public void setPermIds(Long[] permIds) {
        this.permIds = permIds;
    }
}