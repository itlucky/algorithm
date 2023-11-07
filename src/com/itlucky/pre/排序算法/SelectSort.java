package com.itlucky.pre.排序算法;

/**
 * 选择排序：选择排序是一种简单直观的排序算法，无论什么数据进去都是 O(n²) 的时间复杂度。
 *          所以用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间了吧。
 *
 * 算法步骤：
 *      1：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
 *      2：再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 *      3：重复第二步，直到所有元素均排序完毕。
 *
 */
public class SelectSort {

    /**
     * 选择排序算法实现
     *
     * 从以下数组下标中逐一选择：
     * 0~n-1
     * 1~n-1
     * 2~n-1
     *
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {

        if (arr==null||arr.length<2) {
            return;
        }
        // 数组长度
        int n = arr.length;

        for (int i = 0; i<n; i++) {
            int minIndex = i;
            for (int j = i+1; j<n; j++) {
                minIndex = arr[j]<arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }
 
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // 打印数组内容
    public static void printArry(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 3, 1, 9, 12, 8, 3, 1, 9};

        printArry(arr);

        selectSort(arr);
        System.out.println();
        printArry(arr);

    }
}
