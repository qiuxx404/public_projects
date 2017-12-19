package com.qiuxx.shiro.beans;

/**
 * @Description: 角色与权限
 * @Author: qiuxx
 * @Date: 18:39 2017/12/19
 */
public class RolePremission {

    private long shiroRoleId;
    private long shiroPremissionId;

    public long getShiroRoleId() {
        return shiroRoleId;
    }

    public void setShiroRoleId(long shiroRoleId) {
        this.shiroRoleId = shiroRoleId;
    }

    public long getShiroPremissionId() {
        return shiroPremissionId;
    }

    public void setShiroPremissionId(long shiroPremissionId) {
        this.shiroPremissionId = shiroPremissionId;
    }

    @Override
    public String
    toString() {
        return "RolePremission{" +
                "shiroRoleId=" + shiroRoleId +
                ", shiroPremissionId=" + shiroPremissionId +
                '}';
    }
}
