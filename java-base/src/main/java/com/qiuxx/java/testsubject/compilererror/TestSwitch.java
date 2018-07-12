package com.qiuxx.java.testsubject.compilererror;

/**
 * @Description:
 * @Author: qiuxx
 * @Date: 12:14 2018/6/25
 */
public class TestSwitch {

    public static void main(String[] args){
        int i = 1,j=-1;
        switch (i)
        {
            //case 0,1 :j=1;//编译不通过，只能接入一个值
        }
    }
}
