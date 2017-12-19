package com.qiuxx.shiro.beans;

/**
 * @Description: 角色
 * @Author: qiuxx
 * @Date: 17:14 2017/12/19
 */
public class Role {

    private long shiroRoleId; //角色id
    private String shiroRoleName;//角色名

    public long getShiroRoleId() {
        return shiroRoleId;
    }

    public void setShiroRoleId(long shiroRoleId) {
        this.shiroRoleId = shiroRoleId;
    }

    public String getShiroRoleName() {
        return shiroRoleName;
    }

    public void setShiroRoleName(String shiroRoleName) {
        this.shiroRoleName = shiroRoleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "shiroRoleId=" + shiroRoleId +
                ", shiroRoleName='" + shiroRoleName + '\'' +
                '}';
    }
}
