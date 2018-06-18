package com.qiuxx.java.base.scopedefalutprivateprotectpublic.package1;

import com.qiuxx.java.base.scopedefalutprivateprotectpublic.package2.Student2;

/**
 * @Description: 测试default（即不写时）作用域
 * @Author: qiuxx
 * @Date: 13:50 2018/6/2
 */
public interface TestDefaultScope {

    public static void main(String[] args){
        Student1 student1 = new Student1();
        student1.name = "张三";

        Student2 student2 = new Student2();
        //student2.name= "张三";//编译错误
    }
    /**
     * 结论：：
     * 当属性不写时（default），子类与父类在同一包下，并且！调用类（如这里的main）也与子类、父类同一包下，才能编译通过。
     * 其他任何情况都编译错误
     */
}
