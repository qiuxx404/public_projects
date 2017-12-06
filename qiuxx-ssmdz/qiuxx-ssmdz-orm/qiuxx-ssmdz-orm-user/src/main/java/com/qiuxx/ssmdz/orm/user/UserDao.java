package com.qiuxx.ssmdz.orm.user;

import com.qiuxx.ssmdz.api.beans.user.UserDto;
import com.qiuxx.ssmdz.api.beans.user.UserVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:    user增删改查Dao
 * @Author: qiuxx
 * @Date: 13:14 2017/12/6
 */
@Repository
public interface UserDao {

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
