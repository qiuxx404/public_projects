package com.qiuxx.shiro.dao;

import com.qiuxx.shiro.beans.Role;
import com.qiuxx.shiro.beans.RolePremission;
import com.qiuxx.shiro.beans.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * @Description: 权限dao
 * @Author: qiuxx
 * @Date: 19:41 2017/12/19
 */
@Repository
public interface AuthoDao {

    /**
     * 根据用户名查询用户信息
     */
    User getUserByUserName(String shiroUserName);

    /**
     * 根据用户userId 查询用户拥有角色Role id
     */
    Set<String> getRolesByUserName(String shiroUserName);

    /**
     * 根据角色roleId 查询用户所拥有的资源id
     */
    Set<String> getPremissionsByUserName(String shiroUserName);

    /**
     * 获取user列表
     */
    List<User> getUserList();
}
