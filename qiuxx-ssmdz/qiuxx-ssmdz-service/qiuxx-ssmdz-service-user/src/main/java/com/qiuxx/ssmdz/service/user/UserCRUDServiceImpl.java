package com.qiuxx.ssmdz.service.user;

import com.qiuxx.ssmdz.api.beans.user.UserDto;
import com.qiuxx.ssmdz.api.beans.user.UserVo;
import com.qiuxx.ssmdz.api.rest.user.UserCRUDService;
import com.qiuxx.ssmdz.orm.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: user增删改查
 * @Author: qiuxx
 * @Date: 9:17 2017/12/7
 */
@Service("userCRUDService")
public class UserCRUDServiceImpl implements UserCRUDService {
    @Autowired
    private UserDao userDao;

    @Override
    public Long insertUser(UserDto dto) {
        return userDao.insertUser(dto);
    }

    @Override
    public Integer updateUserByName(UserDto dto) {
        return userDao.updateUserByName(dto);
    }

    @Override
    public Integer deleteUserByName(UserDto dto) {
        return userDao.deleteUserByName(dto);
    }

    @Override
    public UserVo getUserByName(UserDto dto) {
        return userDao.getUserByName(dto);
    }

    @Override
    public List<UserVo> getUserList() {
        return userDao.getUserList();
    }
}
