package com.qiuxx.security.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//TODO config 文件跑不起来
/**
 * @Description:
 * @Author: qiuxx
 * @Date: 9:54 2017/12/28
 */
@Controller
public class HelloController {

    @RequestMapping(value = {"/","welcome**"}, method = RequestMethod.GET)
    public ModelAndView welcomeAction(){
        ModelAndView model = new ModelAndView();
        model.addObject("title","Spring Security Hello World");
        model.addObject("message","This is welcome page");
        model.setViewName("hello");
        return model;
    }

    @RequestMapping(value = "admin**", method = RequestMethod.GET)
    public ModelAndView adminAction(){
        ModelAndView model = new ModelAndView();
        model.addObject("title","Spring Security Hello World");
        model.addObject("message","This is protected page - Admin page");
        model.setViewName("admin");
        return model;
    }

    @RequestMapping(value = "dba**", method = RequestMethod.GET)
    public ModelAndView dbaAction(){
        ModelAndView model = new ModelAndView();
        model.addObject("title","Spring Security Hello World");
        model.addObject("message","This is protected page - Dba page");
        model.setViewName("admin");
        return model;
    }
}
