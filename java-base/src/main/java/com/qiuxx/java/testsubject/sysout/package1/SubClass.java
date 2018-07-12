package com.qiuxx.java.testsubject.sysout.package1;

/**
 * @Description: 同一方法，在只有返回值不相同时是编译不通过的
 * @Author: qiuxx
 * @Date: 11:53 2018/6/25
 */
public class SubClass extends SuperClass {

    //编译不通过
    /**
     * public Long getLength(){
         return new Long(5);
         }
     */
    public Integer getLength(){
        return new Integer(5);
    }

    public static void main(String[] args){
        SuperClass superClass = new SuperClass();
        SubClass subClass = new SubClass();
        System.out.println(superClass.getLength()+"."+ subClass.getLength().toString());
    }
}
