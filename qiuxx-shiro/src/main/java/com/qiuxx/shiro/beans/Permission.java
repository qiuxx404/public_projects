package com.qiuxx.shiro.beans;

/**
 * @Description: 角色
 * @Author: qiuxx
 * @Date: 17:09 2017/12/19
 */
public class Permission {

    private long shiroPermissionId;//权限id
    private String shiroPermissionName;//权限名
    private String shiroPermissionUrl;//权限url

    public long getShiroPermissionId() {
        return shiroPermissionId;
    }

    public void setShiroPermissionId(long shiroPermissionId) {
        this.shiroPermissionId = shiroPermissionId;
    }

    public String getShiroPermissionName() {
        return shiroPermissionName;
    }

    public void setShiroPermissionName(String shiroPermissionName) {
        this.shiroPermissionName = shiroPermissionName;
    }

    public String getShiroPermissionUrl() {
        return shiroPermissionUrl;
    }

    public void setShiroPermissionUrl(String shiroPermissionUrl) {
        this.shiroPermissionUrl = shiroPermissionUrl;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "shiroPermissionId=" + shiroPermissionId +
                ", shiroPermissionName='" + shiroPermissionName + '\'' +
                ", shiroPermissionUrl='" + shiroPermissionUrl + '\'' +
                '}';
    }
}
