package com.qiuxx.java.testsubject.compilererror;

/**
 * @Description: 编译错误问题
 * @Author: qiuxx
 * @Date: 10:21 2018/6/25
 */
public class CompilerError1 {

    //1.Which cause a compiler error?
    int[] scores1 = {3,5,7};//正确

    //int[][] scores2 = {2,7,6},{9,3,45};//编译失败
    int[][] scores2 = {{2,7,6},{9,3,45}};//正确

    Integer scores3[] = {new Integer(3),new Integer(4)};


    public static void main(String[] args){
        for (String str : args){
            System.out.println(str);
        }
    }


}
