package com.qiuxx.java.base.designpattern.proxypattern.staticproxy;

/**
 * @Description: 统一上级接口（让代理对象与被代理对象拥有同样的方法才能做同样的事情）
 * @Author: qiuxx
 * @Date: 19:48 2018/6/18
 */
public interface CommonPerson {

    /**
     * 购物
     */
    public void shopping();

    /**
     * 带饭
     */
    public void bringFood();
}
