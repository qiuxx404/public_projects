package com.qiuxx.java.datastructure.myhashmap;

import java.util.HashMap;

/**
 * @Description: 测试 MyHashMap 是否可用
 * @Author: qiuxx
 * @Date: 22:27 2018/6/27
 */
public class TestMyHashMap {

    public static void main(String[] args){
        MyMap myMap = new MyHashMap<String, String>();

        for (int i = 0; i < 500; i++){
            myMap.put("key"+i,"value"+i);
        }
        for (int i = 0; i < 500; i++){
            System.out.println("key"+i+",value is : "+myMap.get("key"+i));
        }
    }
}
