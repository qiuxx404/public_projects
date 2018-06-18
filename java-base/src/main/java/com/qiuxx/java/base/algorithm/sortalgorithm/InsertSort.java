package com.qiuxx.java.base.algorithm.sortalgorithm;

/**
 * @Description: 插入排序
 * @Author: qiuxx
 * @Date: 23:48 2018/6/5
 */
public class InsertSort {

    public static int[] orderByInsert(int[] arrs){
        for (int i=1;i< arrs.length;i++){
            int temp = arrs[i];
            int j = i-1;;
            if (temp<arrs[j]){
                while (j>0 && arrs[j]>temp){
                    arrs[j+1] = arrs[j];
                    j--;
                }
                arrs[j+1] = temp;
            }
        }
        return arrs;
    }

    public static void main(String[] args) {
        int[] arrs = {2, 10, 3, 65, 13, 14, 546, 548, 31, 12, 6};
        orderByInsert(arrs);
        System.out.print("插入排序(InsertSort)结果：");
        for (int i : arrs) {
            System.out.print(i + " ");
        }
    }
}
