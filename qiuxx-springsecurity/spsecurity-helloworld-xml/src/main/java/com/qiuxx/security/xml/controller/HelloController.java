package com.qiuxx.security.xml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 17:16 2017/12/27
 */
//TODO Logout时找不到页面
@Controller
public class HelloController {

    @RequestMapping(value = {"/","/welcome**"}, method = RequestMethod.GET)
    public ModelAndView welcomeAction(){
        ModelAndView model = new ModelAndView();
        model.addObject("title","Spring Security Hello World");
        model.addObject("message","This is welcome page");
        model.setViewName("hello");
        return model;
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminAction(){
        ModelAndView model = new ModelAndView();
        model.addObject("title","Spring Security Hello World");
        model.addObject("message","This is admin page");
        model.setViewName("admin");
        return model;
    }
}
