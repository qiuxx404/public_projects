package com.qiuxx.shiro.service;

import com.qiuxx.shiro.beans.Role;
import com.qiuxx.shiro.beans.RolePremission;
import com.qiuxx.shiro.beans.User;

import java.util.List;
import java.util.Set;

/**
 * @Description: 权限service
 * @Author: qiuxx
 * @Date: 17:02 2017/12/19
 */
public interface AuthoService {

    /**
     * 根据用户名查询用户信息
     */
    public User getUserByUserName(String shiroUserName);

    /**
     * 根据用户shiroUserName 查询用户拥有角色Role
     */
    public Set<String> getRolesByUserName(String shiroUserName);

    /**
     * 根据shiroUserName查询用户所拥有的资源
     */
    public Set<String> getPremissionsByUserName(String shiroUserName);

    /**
     * 获取用户列表
     */
    public List<User> getUserList();
}
