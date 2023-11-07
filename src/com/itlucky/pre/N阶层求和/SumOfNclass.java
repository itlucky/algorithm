package com.itlucky.pre.N阶层求和;

/**
 * 给定参数N，计算  1!+2!+3!+...+ N! 的结果
 *
 *  N!= 1*2*3...*(n-1)*n
 *
 *  1!=1
 *  2!=1*2          =1!*2
 *  3!=1*2*3        =2!*3
 *  4!=1*2*3*4      =3!*4
 *
 */
public class SumOfNclass {

    /**
     * 算法1
     * @param n
     * @return
     */
    public static long f1(int n) {
        long res = 0;
        for (int i = 1; i<=n; i++) {
            res += calcN(i);
        }
        return res;
    }

    public static long calcN(int a) {
        long x = 1;
        for (int i = 1; i<=a; i++) {
            x *= i;
        }
        return x;
    }

    /**
     * 算法2
     * @param n
     * @return
     */
    public static long f2(int n) {

        long res = 0;
        long cur = 1;
        for (int i = 1; i<=n; i++) {
            cur *= i;
            res += cur;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(f1(5));
        System.out.println(f2(5));
    }

}
