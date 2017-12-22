package com.qiuxx.shiro.service.impl;

import com.qiuxx.shiro.beans.Role;
import com.qiuxx.shiro.beans.RolePremission;
import com.qiuxx.shiro.beans.User;
import com.qiuxx.shiro.dao.AuthoDao;
import com.qiuxx.shiro.service.AuthoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * @Description: 权限service实现
 * @Author: qiuxx
 * @Date: 9:02 2017/12/20
 */
@Service("authoService")
public class AuthoServiceImpl implements AuthoService {

    @Autowired
    private AuthoDao authoDao;

    @Override
    public User getUserByUserName(String shiroUserName) {
        return authoDao.getUserByUserName(shiroUserName);
    }

    @Override
    public Set<String> getRolesByUserId(String shiroUserName) {
        return authoDao.getRolesByUserId(shiroUserName);
    }

    @Override
    public Set<String> getPremissionsByRoleId(Set<String> shiroRoleName) {
        return authoDao.getPremissionsByRoleId(shiroRoleName);
    }

    @Override
    public List<User> getUserList() {
        return authoDao.getUserList();
    }
}
