package com.qiuxx.ssm.entity;

import java.io.Serializable;

/**
 * @Description: 用户实体
 * @Author: qiuxx
 * @Date: 13:48 2018/3/18
 */
public class User implements Serializable {
    private static final long serialVersionUID = -6823425319761466829L;

    private String userName;
    private String userEmail;
    private String userDescription;
    private String userTelephone,userAddress;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
