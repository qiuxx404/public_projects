package com.qiuxx.java.base.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description: 测试获取类信息
 * @Author: qiuxx
 * @Date: 22:02 2018/7/12
 */
public class ReflectClass {

    private String username;
    protected String password;
    public int age;

    private void printUsername(String username) {
        System.out.println("属性username="+this.username);
        System.out.println("入参username="+username);
    }

    protected void printPassord(String password) {
        System.out.println("属性password="+this.password);
        System.out.println("入参password="+password);
    }

    protected void printAge(String age) {
        System.out.println("属性age="+this.age);
        System.out.println("入参age="+age);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("************************类信息**********************************");
        Class clazz = Class.forName("com.qiuxx.java.base.reflect.ReflectClass");
        System.out.println("类信息clazz ==> "+clazz);

        System.out.println("*************************共有属性信息*********************************");
        Field[] publicFields = clazz.getFields();
        for (Field field : publicFields) {
            System.out.println(field);
        }

        System.out.println("*************************所有属性信息*********************************");
        Field[] allFields = clazz.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println(field);
        }

        System.out.println("*************************公有方法信息*********************************");
        Method[] publicMethods = clazz.getMethods();//包括Object的公有方法与当前main
        for (Method method : publicMethods) {
            System.out.println(method);
        }

        System.out.println("*************************所有方法信息*********************************");
        Method[] allMethods = clazz.getDeclaredMethods();//不包含Object的方法与当前main
        for (Method method : allMethods) {
            System.out.println(method);
        }


    }

}
