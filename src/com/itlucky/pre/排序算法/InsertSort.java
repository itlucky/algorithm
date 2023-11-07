package com.itlucky.pre.排序算法;

/**
 * 插入排序：   从右向左
 *
 * 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 * 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
 * （如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 */
public class InsertSort {

    // 插入排序第一种写法
    public static void insertSort(int[] arr) {

        if (arr==null||arr.length<2) {
            return;
        }
        int[] arrtmp = new int[arr.length];

        // 0-0
        // 0-1
        // 0-2
        // 0-n
        int n = arr.length;
        for (int end = 1; end<n; end++) {
            int newNumIndex = end;
            // 当左边没有数据 并且 要比较的数据大于它左边的数据(说明已经是排序的)就停止比较
            while (newNumIndex-1>=0&&arr[newNumIndex-1]>arr[newNumIndex]) {
                swap(arr, newNumIndex, newNumIndex-1);
                newNumIndex--;
            }
        }

    }

    // 插入排序算法第二种写法
    public static void insertSort2(int[] arr) {

        if (arr==null||arr.length<2) {
            return;
        }

        int N = arr.length;
        // 逻辑思想其实跟写法1是一样的。
        for (int end = 1; end<N; end++) {
            // pre:要比较数的前一个位置    end-1 end
            for (int pre = end-1; pre>=0&&arr[pre]>arr[pre+1]; pre--) {
                swap(arr, pre, pre+1);
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArry(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 77, 23, 2, 4, 7, 16, 1, 99};

        // insertSort(arr);
        insertSort2(arr);
        printArry(arr);
    }
}
