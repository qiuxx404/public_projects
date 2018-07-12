package com.qiuxx.java.testsubject.sysout.package5;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 12:18 2018/6/25
 */
public class TestException {

    public static void main(String[] args){
        try{
            throw new Exc1();
        } catch (Exc0 exc0){
            System.out.println("Exc0 caught");
        } catch (Exception e){
            System.out.println("Exception caught");
        }
    }
}
