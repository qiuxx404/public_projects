package com.qiuxx.shiro.beans;

/**
 * @Description: 用户
 * @Author: qiuxx
 * @Date: 17:03 2017/12/19
 */
public class User {

    private long shiroUserId;//用户id
    private String shiroUserName;//用户名
    private String shiroPassword;//用户密码

    public long getShiroUserId() {
        return shiroUserId;
    }

    public void setShiroUserId(long shiroUserId) {
        this.shiroUserId = shiroUserId;
    }

    public String getShiroUserName() {
        return shiroUserName;
    }

    public void setShiroUserName(String shiroUserName) {
        this.shiroUserName = shiroUserName;
    }

    public String getShiroPassword() {
        return shiroPassword;
    }

    public void setShiroPassword(String shiroPassword) {
        this.shiroPassword = shiroPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "shiroUserId=" + shiroUserId +
                ", shiroUserName='" + shiroUserName + '\'' +
                ", shiroPassword='" + shiroPassword + '\'' +
                '}';
    }
}
