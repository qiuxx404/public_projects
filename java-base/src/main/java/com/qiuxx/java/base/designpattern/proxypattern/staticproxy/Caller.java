package com.qiuxx.java.base.designpattern.proxypattern.staticproxy;

/**
 * @Description: 调用方（访问代理对象方法，做被代理对象的事情）
 * @Author: qiuxx
 * @Date: 19:55 2018/6/18
 */
public class Caller {

    public static void main(String[] args){
        ProxiedPersonB proxiedPersonB = new ProxiedPersonB();//被代理对象B
        //创建代理对象A
        ProxyPersonA proxyPersonA = new ProxyPersonA(proxiedPersonB);
        //看似在访问代理对象A的方法，实际是调用了被代理对象B的方法
        proxyPersonA.shopping();
        proxyPersonA.bringFood();
    }
}
