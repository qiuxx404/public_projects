package com.qiuxx.shiro.controller;

import com.qiuxx.shiro.beans.User;
import com.qiuxx.shiro.service.AuthoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 权限demo controller层
 * @Author: qiuxx
 * @Date: 10:04 2017/12/20
 */
@Controller
public class AuthoController {

    @Autowired
    private AuthoService authoService;

    @RequestMapping("/login")
    public String login(User user, Model model){
        System.out.println(">>>>>>>>>>>> loginAdmin >>>>>>>>>>>>>>>>>>>");
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getShiroUserName(), user.getShiroUserPassword());
        try {
            subject.login(token);
            return  "success";
        } catch (Exception e){
            //打印异常，登录失败，会自动抛出异常
            model.addAttribute("error", "用户名或密码错误");
            return "login";
        }
    }


    @RequestMapping("/tourist")
    public String testst(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>"+authoService.getUserList().toString()+">>>>>>>>>>>>>>>>");
        return "success";
    }

    @RequestMapping("/list")
    public String list(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>"+authoService.getUserList().toString()+">>>>>>>>>>>>>>>>");
        return "success";
    }
}
