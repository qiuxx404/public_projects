package com.qiuxx.java.testsubject.sysout.package6;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 12:21 2018/6/25
 */
public class Myprogram {

    public static void throwit(){
        throw new RuntimeException();
    }

    public static void main(String args[]){
        try{
            System.out.println("Hello World ");
            throwit();
            System.out.println("Done with try block ");
        } finally {
            System.out.println("FInally executing");
        }
    }
}
