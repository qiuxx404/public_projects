package com.qiuxx.java.base.algorithm.sortalgorithm;

/**
 * @Description: 选择排序
 *  以递增排序为例：通过内部循环第一次遍历数组，找到最小的元素，与数组的第一个元素交换位置，第二次遍历数组找到第二小的元素
 *                与数组的第二个元素交换位置，（当内存循环找到最小的元素并交换位置后，下次遍历时边开这个最小元素）。
 *      这种排序方法对任何结构的数组都是O(n2)的时间复杂度
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

    public static void testSelectSort(int[] arrs){
        for (int i=0;i<arrs.length;i++){
            int temp = arrs[i];
            int flag = i;
            for (int j=i+1;j<arrs.length;j++){
                if (arrs[j] < temp) {
                    temp = arrs[j];
                    flag = j;
                }
            }
            if (flag != i){
                arrs[flag] = arrs[i];
                arrs[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arrs = {2, 10, 3, 65, 13, 14, 546, 548, 31, 12, 6, 1};
        testSelectSort(arrs);
        System.out.print("选择排序(SelectSort)结果：");
        for (int i : arrs) {
            System.out.print(i + " ");
        }
    }
}
