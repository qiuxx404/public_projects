package com.qiuxx.java.base.algorithm.sortalgorithm;

/**
 * @Description: 插入排序
 *    以递增排序为例：假定第一个元素为最小元素，判断第二个与第一个元素的大小，如果第二个小于第一个，则交换位置，这时候第一
 *                  个与第二个已经排好序，通过第三个元素与前面已经排好的第二个元素进行比较，如果大于第二个元素，则进行
 *                  下一轮循环，否则继续与第一个元素进行比较，当比较处于两数之间时插入到两数之间，外部控制循环达到
 *                  数组末端。这种排序方式相对于选择排序有个好处就是如果数组本省已经有部分排好序，则在后面的比较中，
 *                  当与前面已经排好序的最大值进行比较是，如果大于最大值的元素就会直接忽略掉与其他元素的比较，节省时间
 * @Author: qiuxx
 * @Date: 23:48 2018/6/5
 */
public class InsertSort {

    public static int[] orderByInsert(int[] arrs){
        for (int i=1;i< arrs.length;i++){
            int temp = arrs[i];
            int j = i-1;
            if (temp<arrs[j]){
                while (j>=0 && arrs[j]>temp){
                    arrs[j+1] = arrs[j];
                    j--;
                }
                arrs[j+1] = temp;
            }
        }
        return arrs;
    }

    public static void testInsertSort(int[] arrs){
        for (int i=1;i<arrs.length;i++){
            int temp = arrs[i];
            int j = i-1;
            if (temp < arrs[j]){
                while (j >= 0 && arrs[j]>temp){
                    arrs[j+1] = arrs[j];
                    j--;
                }
                arrs[j+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arrs = {2, 10, 3, 65, 13, 14, 546, 548, 31, 12, 6,1};
        orderByInsert(arrs);
        System.out.print("插入排序(InsertSort)结果：");
        for (int i : arrs) {
            System.out.print(i + " ");
        }
    }
}
