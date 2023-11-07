package com.itlucky.pre.数据结构_简单;

/**
 * 案例：
 * 有一个数组arr,需要频繁的获取数组L到R位置的元素之和。
 * 因为访问这个方法很频繁，需要设计一个数据结构来存储L到R位置之和，
 * 这样等到调用该方法的时候直接获取就行。
 *
 *
 */
public class Test1 {

    /**
     * 前缀和算法
     * 计算数组L到R的元素之和是多少？
     *
     * 结合sumH()方法的计算逻辑，我们知道当L为0时，就是sumH(arr,R)的值。
     *                                当L大于0时，就用0~H减去0~(R-1)的值
     *
     *
     */
    public static int preSum(int[] arr, int L, int R) {
        if (L==0)
            return sumH(arr, R);
        return sumH(arr, R)-sumH(arr, L-1);
    }

    /**
     * 先计算出 0-H的和
     *
     * 0    sum(0) = arr[0]               1
     * 0-1  sum(1) = sum(0) + arr[1]      2
     * 0-2  sum(2) = sum(1) + arr[2]      3
     * 0-3  sum(3) = sum(2) + arr[3]      4
     *
     *
     */
    public static int sumH(int[] arr, int H) {

        if (arr==null||H<0||H>arr.length) {
            return -999999999;
        }

        int len = arr.length;
        int sum = arr[0];
        for (int i = 1; i<len; i++) {
            if (i<H) {
                sum += arr[i];
            } else {
                break;
            }
        }
        return sum;

    }

    public static void main(String[] args) {

        int[] arr = {1, 3, -5, 8, 2, 5, 12, -4, 9};

        // 其实经过sumH之后，把0到H 的位置的和放到一个新的数组中。那么这里的arr计算之后得到一个新的数组结果：
        // {1, 4, -1, 7, 9, 14, 26, 22, 31}
        // 0到H 的位置就是H之前的元素之和
        System.out.println(sumH(arr, 99));

        System.out.println(preSum(arr, 2, 7));

    }

}
