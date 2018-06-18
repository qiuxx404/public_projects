package com.qiuxx.java.base.algorithm.sortalgorithm;

/**
 * @Description: 选择排序
 * @Author: qiuxx
 * @Date: 22:49 2018/6/5
 */
public class SelectSort {

    public static int[] orderBySelect(int[] arrs){
        for (int i=0;i< arrs.length;i++){
            int temp = arrs[i];
            int flag = i;
            for (int j=i+1;j<arrs.length;j++){
                if (temp > arrs[j]) {
                    temp = arrs[j];
                    flag = j;
                }
            }
            if (flag != i){
                arrs[flag] = arrs[i];
                arrs[i] = temp;
            }
        }
        return arrs;
    }

    public static void main(String[] args) {
        int[] arrs = {2, 10, 3, 65, 13, 14, 546, 548, 31, 12, 6};
        orderBySelect(arrs);
        System.out.print("选择排序(SelectSort)结果：");
        for (int i : arrs) {
            System.out.print(i + " ");
        }
    }
}
