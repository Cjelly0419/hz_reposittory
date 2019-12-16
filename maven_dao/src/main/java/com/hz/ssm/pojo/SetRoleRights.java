package com.hz.ssm.pojo;

public class SetRoleRights {
    private String roleId;

    private String rightsId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getRightsId() {
        return rightsId;
    }

    public void setRightsId(String rightsId) {
        this.rightsId = rightsId == null ? null : rightsId.trim();
    }
}