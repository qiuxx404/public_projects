package com.qiuxx.java.testsubject.sysout.package2;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 12:02 2018/6/25
 */
public class TestSwitch {

    public static void main(String[] args){
        for (int i=0;i<3;i++){
            switch (i){
                case 0:
                    break;
                case 1:
                    System.out.print("one ");
                case 2:
                    System.out.print("two ");
                case 3:
                    System.out.print("three ");
                default:
                    System.out.print("default ");
            }
        }
        System.out.print("done");
    }
}
