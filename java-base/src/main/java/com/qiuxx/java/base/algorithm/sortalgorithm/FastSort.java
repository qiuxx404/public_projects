package com.qiuxx.java.base.algorithm.sortalgorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 快速排序的原理：选择一个关键值作为基准值。比基准值小的都在左边序列（一般是无序的），
 *                              比基准值大的都在右边（一般是无序的）。一般选择序列的第一个元素。
 *               一次循环：从后往前比较，用基准值和最后一个值比较，如果比基准值小的交换位置，如果没有继续比较下一个，
 *                       直到找到第一个比基准值小的值才交换。找到这个值之后，又从前往后开始比较，如果有比基准值大的，交换位置，
 *                       如果没有继续比较下一个，直到找到第一个比基准值大的值才交换。直到从前往后的比较索引>从后往前比较的索引，
 *                       结束第一次循环，此时，对于基准值来说，左右两边就是有序的了。接着分别比较左右两边的序列，重复上述的循环。
 * @Author: qiuxx
 * @Date: 15:37 2018/6/10
 */
public class FastSort {

    /**
     * 快速排序
     * @param arrs 待排序数组
     * @param startNum 起始下标
     * @param endNum 终止下标
     */
    public static void fastSort(int[] arrs,int startNum,int endNum){
        int i,j,index;
        if (startNum >= endNum){//数组合法性判断
            return;
        }
        i = startNum;
        j = endNum;
        index = arrs[i];//拷贝第一个元素
        /**
         * 以下循环主要讲数组平分成两部分，左边部分的每一个值均小于右边的每一个值
         * 原理：一次循环中分别从尾端想首端遍历找到一个小于index的元素，
         * 并赋值给arrs[i]（arrs[i]的值保存到index中不会丢失），这时候尾端的元素可通过
         * j作为下标找到，接下来通过首端向尾端遍历，找到一个大于index的元素并赋值给之前
         * 已经赋值到左边的元素，这些条件都是在i<j的情况下执行的，保证了遍历不会过节的问题
         */
        while (i<j){
            while(i<j && arrs[j]>index){
                j--;
            }
            if (i<j){
                arrs[i++] = arrs[j];
            }
            while (i<j && arrs[i]<index){
                i++;
            }
            if (i<j){
                arrs[j--] = arrs[i];
            }
        }
        arrs[i]=index;
        //递归，直到只有一个元素的数组，这时候整个数组就已经排好序
        fastSort(arrs,startNum,i-1);
        fastSort(arrs,i+1,endNum);
    }

    public static void testastSort(int[] arrs,int startNum,int endNum){
        int i,j,index;
        if (startNum >= endNum){
            return;
        }

        i = startNum;
        j = endNum;
        index = arrs[i];
        while (i<j){
            while (i<j && arrs[j]>index){
                j--;
            }
            if (i<j){
                arrs[i++] = arrs[j];
            }
            while (i<j && arrs[i]<index){
                i++;
            }
            if (i<j){
                arrs[j--] = arrs[i];
            }
        }
        arrs[i] = index;
        //递归，知道只有一个元素的数组，这时候整个数组就一句排好序了
        fastSort(arrs, startNum,i-1);
        fastSort(arrs,i+1,endNum);
    }

    public static void main(String[] args) {
        int[] arrs = {2, 10, 3, 65, 13, 14, 546, 548, 31, 12, 6, 1};
        testastSort(arrs, 0, arrs.length-1);
        System.out.print("快速排序(fastSort)结果：");
        for (int i : arrs) {
            System.out.print(i + " ");
        }
    }
}
