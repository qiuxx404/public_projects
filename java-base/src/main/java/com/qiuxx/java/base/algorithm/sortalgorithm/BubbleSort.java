package com.qiuxx.java.base.algorithm.sortalgorithm;

import java.util.Arrays;

/**
 * @Description: 冒泡排序
 * @Author: qiuxx
 * @Date: 22:04 2018/6/5
 */
public class BubbleSort {

    public static int[] bulleSort(int[] arrs){
        for (int i=0;i< arrs.length;i++){
            for (int j=0;j< arrs.length-i-1;j++){
                if (arrs[j] > arrs[j+1]){
                    int temp = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = temp;
                }
            }
        }
        return arrs;
    }

    public static void main(String[] args){
        int[] arrs = {2,10,3,65,13,14,546,548,31,12,6};
        bulleSort(arrs);
        System.out.print("冒泡排序(BulleSort)结果："+ Arrays.toString(arrs));
    }
}
