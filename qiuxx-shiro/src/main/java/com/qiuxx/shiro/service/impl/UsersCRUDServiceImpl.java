package com.qiuxx.shiro.service.impl;

import com.qiuxx.shiro.beans.users.UserDto;
import com.qiuxx.shiro.beans.users.UserVo;
import com.qiuxx.shiro.dao.UsersDao;
import com.qiuxx.shiro.service.UsersCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: user增删改查
 * @Author: qiuxx
 * @Date: 9:17 2017/12/7
 */
@Service("userCRUDService")
public class UsersCRUDServiceImpl implements UsersCRUDService {
    @Autowired
    private UsersDao usersDao;

    @Override
    public Long insertUser(UserDto dto) {
        return usersDao.insertUser(dto);
    }

    @Override
    public Integer updateUserByName(UserDto dto) {
        return usersDao.updateUserByName(dto);
    }

    @Override
    public Integer deleteUserByName(UserDto dto) {
        return usersDao.deleteUserByName(dto);
    }

    @Override
    public UserVo getUserByName(UserDto dto) {
        return usersDao.getUserByName(dto);
    }

    @Override
    public List<UserVo> getUserList() {
        return usersDao.getUserList();
    }
}

