package com.qiuxx.ssmdz.api.beans.user;

import java.io.Serializable;

/**
 * @Description:   user bean
 * @Author: qiuxx
 * @Date: 11:06 2017/12/6
 */
public class User implements Serializable{
    private String userName;
    private String userTelephone;
    private String userAddress;
    private String userEmail;
    private String userDescription;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    @Override
    public String toString() {
        return "user{" +
                "userName='" + userName + '\'' +
                ", userTelephone='" + userTelephone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userDescription='" + userDescription + '\'' +
                '}';
    }
}
