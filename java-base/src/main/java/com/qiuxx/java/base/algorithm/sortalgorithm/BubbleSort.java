package com.qiuxx.java.base.algorithm.sortalgorithm;

import java.util.Arrays;

/**
 * @Description: 冒泡排序
 *      以递增排序为例：冒泡排序的思想是从左到右（从又到左）进行相邻元素的大小判断，如果后一个元素小于前一个元素，
 *                  交换位置，一轮循环后最大值将会在最右边
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

    public static void testBulleSort(int[] arrs){
        for (int i=0;i<arrs.length;i++){
            for (int j=0;j<arrs.length-i-1;j++){
                if (arrs[j] > arrs[j+1]){
                    int temp = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arrs = {2,10,3,65,13,14,546,548,31,12,6,1};
        testBulleSort(arrs);
        System.out.print("冒泡排序(BulleSort)结果："+ Arrays.toString(arrs));
    }
}
