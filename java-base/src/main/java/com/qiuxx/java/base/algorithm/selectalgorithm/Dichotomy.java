package com.qiuxx.java.base.algorithm.selectalgorithm;

/**
 * @Description: 二分法
 * @Author: qiuxx
 * @Date: 14:43 2018/6/10
 */
public class Dichotomy {


    /**
     * 二分法
     * 简介：在二分搜寻发中，从数列的中间开始搜寻，如果这个数小于我们所搜索的数，由于数列已排序，则该数左边的数一定都小于要
     *      搜寻的对象，所以无需浪费时间在左边的数；如果搜寻的数大于所搜寻的对象，则右边的数无需再搜寻，直接搜寻左边的数。
     */
    public static int dichotomyAlgorithm(int[] arrs,int num){
        int startNum = 0;
        int endNum = arrs.length - 1;
        while (startNum <= endNum){
            int midNum = (startNum + endNum)/2;
            /** 与中间值比较确定在左边还是右边的区间，以调整区域 **/
            if (num > arrs[midNum]){
                startNum = midNum + 1;
            } else if (num < arrs[midNum]){
                endNum = midNum - 1;
            } else {
                return midNum;
            }
        }
        return -1;
    }

    /** 二分查找的实现 **/
    public static void main(String[] args){
        int[] arrs = {2,3,4,5,6,8,9,34,87,90,94,102};
        int findIndex =  Dichotomy.dichotomyAlgorithm(arrs,34);
        if (findIndex != -1){
            System.out.println("找到数值索引" + findIndex);
            System.out.println(arrs[findIndex]);
        } else {
            System.out.println("找不到数值");
        }
    }
}
