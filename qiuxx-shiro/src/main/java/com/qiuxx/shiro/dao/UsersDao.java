package com.qiuxx.shiro.dao;

import com.qiuxx.shiro.beans.users.UserDto;
import com.qiuxx.shiro.beans.users.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: user增删改查，管理员可以执行所有操作，
 *                  zhangsan只允许查看user表，
 *                  qiuxx允许select，update，insert
 * @Author: qiuxx
 * @Date: 9:49 2017/12/25
 */
public interface UsersDao {

    /**
     * 保存用户信息,根据userName
     */
    public Long insertUser(@Param(value="dto")UserDto dto);

    /**
     * 修改用户信息,根据userName
     */
    public Integer updateUserByName(@Param(value="dto")UserDto dto);

    /**
     * 删除用户信息,根据userName
     */
    public Integer deleteUserByName(@Param(value="dto")UserDto dto);

    /**
     * 获取用户详情信息,根据userName
     */
    public UserVo getUserByName(@Param(value="dto")UserDto dto);

    /**
     * 获取用户信息列表
     */
    public List<UserVo> getUserList();
}
