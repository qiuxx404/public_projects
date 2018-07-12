package com.qiuxx.java.testsubject.sysout.package7;

import java.util.HashSet;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 12:27 2018/6/25
 */
public class TestString {

    public static void main(String[] args){
        /*String x = "abc";
        String y = "abc";
        x.concat(y);
        System.out.println(x);*/

        HashSet hashSet = new HashSet();
        for (short i =0; i<100;i++){
            hashSet.add(i);
            hashSet.remove(i - 1);
        }
        System.out.println(hashSet.toString());
        System.out.println(hashSet.size());
    }

}
