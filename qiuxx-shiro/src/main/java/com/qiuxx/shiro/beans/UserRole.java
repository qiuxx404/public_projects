package com.qiuxx.shiro.beans;

/**
 * @Description: 用户与角色
 * @Author: qiuxx
 * @Date: 18:37 2017/12/19
 */
public class UserRole {

    private long shiroUserId;//用户id
    private long shiroRoleId;//角色id

    public long getShiroUserId() {
        return shiroUserId;
    }

    public void setShiroUserId(long shiroUserId) {
        this.shiroUserId = shiroUserId;
    }

    public long getShiroRoleId() {
        return shiroRoleId;
    }

    public void setShiroRoleId(long shiroRoleId) {
        this.shiroRoleId = shiroRoleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "shiroUserId=" + shiroUserId +
                ", shiroRoleId=" + shiroRoleId +
                '}';
    }
}
