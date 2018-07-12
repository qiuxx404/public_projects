package com.qiuxx.java.base.designpattern.proxypattern.staticproxy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @Description: 代理对象A
 * @Author: qiuxx
 * @Date: 19:50 2018/6/18
 */
public class ProxyPersonA implements CommonPerson {

    private CommonPerson commonPerson;

    private ProxyPersonA(){

    }

    public ProxyPersonA(CommonPerson commonPerson){
        this.commonPerson = commonPerson;
    }

    @Override
    public void shopping() {
        this.commonPerson.shopping();
    }

    public static void main(String[] args){
        final String str1 = "a";
        final String str2 = "b";
        String s1 = "abab";
        String s2 = str1+str2;
        System.out.println(s1==s2);
        String a = "ab"+"cd";
    }

    @Override
    public void bringFood() {
        this.commonPerson.bringFood();
    }
}
