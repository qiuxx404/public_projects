package com.qiuxx.java.testsubject.sysout.package8;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 22:37 2018/6/25
 */
public class TestDemo {

    private int count;
    public static void main(String[] args){
        TestDemo testDemo = new TestDemo(88);
        System.out.println(testDemo.count);
    }

    TestDemo(int a){
        count = a;
    }
}
