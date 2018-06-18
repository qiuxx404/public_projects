package com.qiuxx.java.base.algorithm.sortalgorithm;

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


    public static void fastSort(int[] arrs){
        int startNum = 0;
        int endNum = arrs.length-1;
        int key = arrs[startNum];
        while (endNum > startNum){
            //从后往前比较
            while (endNum > startNum && arrs[endNum] >= key){
                //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                endNum --;
                if (arrs[endNum] <= key){
                    int temp = arrs[endNum];
                    arrs[endNum] = arrs[startNum];
                    arrs[startNum] = temp;
                }
                //从前往后比较
                while (endNum > startNum && arrs[startNum] <= key){
                    //如果没有比关键值打的，比较下一个，知道有比关键值大的交换
                    startNum ++ ;

                }
            }
        }
    }
}
