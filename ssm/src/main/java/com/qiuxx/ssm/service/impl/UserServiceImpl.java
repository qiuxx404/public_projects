package com.qiuxx.ssm.service.impl;

import com.qiuxx.ssm.entity.User;
import com.qiuxx.ssm.dao.UserDao;
import com.qiuxx.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 13:15 2017/12/21
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
