package com.qiuxx.shiro.controller;

import com.qiuxx.shiro.beans.User;
import com.qiuxx.shiro.common.ResultVo;
import com.qiuxx.shiro.service.AuthoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 权限demo controller层
 * @Author: qiuxx
 * @Date: 10:04 2017/12/20
 */
@RequestMapping(value = "/qiuxx/authc")
@Controller
public class AuthoController {

    @Autowired
    private AuthoService authoService;

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResultVo login(@RequestBody User user){
        System.out.println(">>>>>>>>>>>> login >>>>>>>>>>>>>>>>>>>");
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getShiroUserName(), user.getShiroUserPassword());
        try {
            subject.login(token);
            System.out.println(("用户" + user.getShiroUserName() + "登录成功"));
            return  new ResultVo();
        } catch (Exception e){
            //打印异常，登录失败，会自动抛出异常
            //model.addAttribute("error", "用户名或密码错误");
            System.out.println(("用户" + user.getShiroUserName() + "登录失败"));
            return new ResultVo();
        }
    }

    /**
     * 退出登录
     */
    @RequestMapping(value = "/loginout", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public ResultVo loginOut(@RequestBody User user){
        System.out.println(">>>>>>>>>>>> loginOut >>>>>>>>>>>>>>>>>>>");
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存

                System.out.println(("用户" + user.getShiroUserName() + "退出登录"));
        }
        return new ResultVo();
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
