package com.qiuxx.java.base.designpattern.proxypattern.staticproxy;

/**
 * @Description: 被代理对象B
 * @Author: qiuxx
 * @Date: 19:50 2018/6/18
 */
public class ProxiedPersonB implements CommonPerson {

    @Override
    public void shopping() {
        System.out.println("我是被代理的对象B，现在出去购物去");
    }

    @Override
    public void bringFood() {
        System.out.println("我是被代理的对象B，现在帮别人带饭去");
    }
}
