package com.qiuxx.ssmdz.api.rest.user;

import com.qiuxx.ssmdz.api.beans.user.UserDto;
import com.qiuxx.ssmdz.api.beans.user.UserVo;

import java.util.List;

/**
 * @Description:  user增删改查servic
 * @Author: qiuxx
 * @Date: 11:11 2017/12/6
 */
public interface UserCRUDService {

    /**
     * 保存User信息
     */
    public Long insertUser(UserDto dto);

    /**
     * 更新user信息,根据userName修改，不支持修改userName
     */
    public Integer updateUserByName(UserDto dto);

    /**
     * 删除user，根据userName删除user
     */
    public Integer deleteUserByName(UserDto dto);

    /**
     * 查询用户信息，根据userName查询
     */
    public UserVo getUserByName(UserDto dto);

    /**
     * 查询所有用户信息
     */
    public List<UserVo> getUserList();
}
