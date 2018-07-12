package com.qiuxx.java.testsubject.sysout.package4;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 12:11 2018/6/25
 */
public class TestOperator {

    public static void main(String[] args){
        int x=0;
        int y=0;
        for (int z=0;z<5;z++){
            if ((++x > 2) && (++y > 2))
            x++;
        }
        System.out.println(x+" "+y);
    }
}
