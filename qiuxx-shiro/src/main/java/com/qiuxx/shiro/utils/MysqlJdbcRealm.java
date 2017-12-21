package com.qiuxx.shiro.utils;

import com.qiuxx.shiro.beans.User;
import com.qiuxx.shiro.service.AuthoService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @Description: 自定义mysql数据源
 * @Author: qiuxx
 * @Date: 14:23 2017/12/19
 */
public class MysqlJdbcRealm extends JdbcRealm{

    @Autowired
    private AuthoService authoService;

    /**
     * 登录验证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println(">>>>>>>>>>>>>>>>> doGetAuthenticationInfo >>>>>>>>>");
        String shiroUserName = token.getPrincipal().toString(); //获取用户名
        User user = authoService.getUserByUserName(shiroUserName);
        if(user == null){
            return null;
        } else {
            //将查询到的shiroUserName，shiroPassword存入到authenicationInfo中，用于后面的权限判断，第三个参数传入realmName
            AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getShiroUserName(),
                    user.getShiroUserPassword(),"mysqlRealm");
            return authenticationInfo;
        }
    }

    /**
     * 权限认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println(">>>>>>>>>>>>>>>>> doGetAuthorizationInfo >>>>>>>>>");
        String shiroUserName = principals.getPrimaryPrincipal().toString();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> shiroRoleName = authoService.getRolesByUserId(shiroUserName);
        System.out.println(shiroRoleName.toArray().toString()+">>>>>>>>>>>>");
        Set<String> shiroPremissionName = authoService.getPremissionsByRoleId(shiroRoleName);
        System.out.println(shiroPremissionName.toArray().toString()+">>>>>>>>>>>>>>>>");
        info.setRoles(shiroRoleName);
        info.setStringPermissions(shiroPremissionName);
        return info;
    }
}
