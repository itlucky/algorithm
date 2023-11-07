package com.itlucky.pre.排序算法;

/**
 * 冒泡排序：
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        if (arr==null||arr.length<2) {
            return;
        }

        int len = arr.length;

        for (int j = len-1; j>1; j--) {

            for (int i = 0; i<j; i++) {

                int maxIndex = i;
                maxIndex = arr[i]>arr[i+1] ? i+1 : maxIndex;

                swap(arr, maxIndex, i);
            }
        }
    }

    public static void printArry(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {

        int[] arr = {5, 15, 3, 11, 8, 4, 2, 9, 2};

        bubbleSort(arr);

        printArry(arr);

    }
}