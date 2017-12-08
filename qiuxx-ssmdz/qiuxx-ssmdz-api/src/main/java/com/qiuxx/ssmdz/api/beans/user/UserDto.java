package com.qiuxx.ssmdz.api.beans.user;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 11:19 2017/12/6
 */
public class UserDto extends User {
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
