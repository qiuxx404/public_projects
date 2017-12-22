package com.qiuxx.shiro.test;

import static org.junit.Assert.*;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 16:41 2017/12/21
 */
public class JdbcRealmTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        // 1.获取SecurityManager工厂，此处使用ini配置文件初始化SecurityManager
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-jdbc-realm.ini");
        // 2.获取SecurityManager实例，并绑定到SecurityUtils
        SecurityManager sm = factory.getInstance();
        SecurityUtils.setSecurityManager(sm);

        // 3.得到Subject
        Subject subject = SecurityUtils.getSubject();
        // 4.创建用户登录凭证
        UsernamePasswordToken token = new UsernamePasswordToken("chris.mao.zb@163.com", "cmao");
        // 5.登录，如果登录失败会抛出不同的异常，根据异常输出失败原因
        try {
            subject.login(token);
            // 6.判断是否成功登录
            assertEquals(true, subject.isAuthenticated());
            System.out.println("登录成功！！");
            // 7.注销用户
            subject.logout();
        } catch (IncorrectCredentialsException e) {
            System.out.println("登录密码错误. Password for account " + token.getPrincipal() + " was incorrect.");
        } catch (ExcessiveAttemptsException e) {
            System.out.println("登录失败次数过多");
        } catch (LockedAccountException e) {
            System.out.println("帐号已被锁定. The account for username " + token.getPrincipal() + " was locked.");
        } catch (DisabledAccountException e) {
            System.out.println("帐号已被禁用. The account for username " + token.getPrincipal() + " was disabled.");
        } catch (ExpiredCredentialsException e) {
            System.out.println("帐号已过期. the account for username " + token.getPrincipal() + "  was expired.");
        } catch (UnknownAccountException e) {
            System.out.println("帐号不存在. There is no user with username of " + token.getPrincipal());
        }
    }

}