package com.qiuxx.java.base.algorithm.sortalgorithm;

import java.util.HashMap;

/**
 * @Description: 排序算法
 * @Author: qiuxx
 * @Date: 22:42 2018/6/30
 */
public class SortAlgorithm {

    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] arrs) {
        for (int i=0;i<arrs.length;i++){
            for (int j=0;j<arrs.length-1;j++){
                if (arrs[j] > arrs[j+1]){
                    int temp = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序
     */
    public static void selectSort(int[] arrs){
        for (int i=0;i<arrs.length;i++){
            int temp = arrs[i];
            int index = i;
            for (int j=i+1;j<arrs.length;j++){
                if (temp > arrs[j]){
                    temp = arrs[j];
                    index = j;
                }
            }
            if (i != index) {
                arrs[index] = arrs[i];
                arrs[i] = temp;
            }
        }
    }

    /**
     * 插入排序
     */
    public static void insertSort(int[] arrs){
        for (int i=1;i<arrs.length;i++){
            int temp = arrs[i];
            int j = i-1;
            if (arrs[j] > arrs[i]){
                while (j>=0 && temp < arrs[j]){
                    arrs[j+1] = arrs[j];
                    j--;
                }
                arrs[j+1] = temp;
            }
        }
    }

    /**
     * 快速排序
     */
    public static void fastSort(int[] arrs,int startNum,int endNum){
        if (startNum >= endNum){
            return;
        }
        int i = startNum;
        int j = endNum;
        int temp = arrs[i];
        if (i<j){
            while (i<j && arrs[j]>temp){
                j--;
            }
            if (i<j){
                arrs[i++] = arrs[j];
            }
            while (i<j && arrs[i]<temp){
                i++;
            }
            if (i<j){
                arrs[j--] = arrs[i];
            }
            arrs[i] = temp;
            fastSort(arrs,startNum,i-1);
            fastSort(arrs,i+1,endNum);
        }
    }


    public static void main(String[] args) {
        int[] arrs = {2, 10, 3, 65, 13, 14, 546, 548, 31, 12, 6, 1};
        //fastSort(arrs, 0, arrs.length-1);
        //bubbleSort(arrs);
        //insertSort(arrs);
        selectSort(arrs);
        System.out.print("快速排序(fastSort)结果：");
        for (int i : arrs) {
            System.out.print(i + " ");
        }
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(dichotomyAlgorithm(arrs,546));
    }

    public static int dichotomyAlgorithm(int[] arrs, int num){
        if (arrs!= null && arrs.length >0){
            int startNum = 0;
            int endNum = arrs.length-1;
            while (startNum <= endNum){
                int midNum = (startNum+endNum)/2;
                if (arrs[midNum] > num){
                    endNum = midNum-1;
                } else if (arrs[midNum] < num){
                    startNum = midNum+1;
                } else {
                    return midNum;
                }
            }
        }
        return -1;
    }

}
