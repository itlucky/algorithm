package com.itlucky.pre.二分查找;

/**
 * @Author itLucky
 * @Date 2023/11/7 22:04
 * @Description: 查找某个数字在数组中的位置（索引下标），已知数组是有序的
 */
public class Search1 {

    public static void main(String[] args) {

        int[] digital = {1, 3, 5, 6, 7, 9, 10, 14, 16, 23, 29, 33, 38};
        int target = 99;

        System.out.println(findIndex(digital, target));

        System.out.println(findIndex_2(digital, target));

        System.out.println(findIndex_3(digital, target));

    }

    /**
     * 二分查找-基础版
     * <p>
     * i和j代表的索引范围是：[i,j]
     *
     * @param args
     * @param target
     * @return
     */
    private static int findIndex(int[] args, int target) {

        int i = 0;
        int j = args.length - 1;

        while (i <= j) {
            // 这里位运算，相当于(i+j)/2，使用>>> 可以避免数组长度为int最大值时出现的问题。
            int m = (i + j) >>> 1;
            if (target < args[m]) {
                j = m - 1;
            } else if (args[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 二分查找-改动版
     * <p>
     * 时间复杂度是O(log_2(n))，比findIndex时间复杂度优。
     * <p>
     * 注意与上面写法的区分，i和j代表的索引范围是：[i,j），此时的j代表的是不包含要查找的范围
     * <p>
     * arr   [1,3,5,6,9,11,15,25]
     * index  0 1 2 3 4  5  6  7
     *
     * @param args
     * @param target
     * @return
     */
    private static int findIndex_2(int[] args, int target) {
        int i = 0;
        int j = args.length;
        // 注意：这里不能加上等于，否则会出现死循环
        while (i < j) {
            int m = (i + j) >>> 1;
            if (target < args[m]) {
                j = m;
            } else if (args[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }

        return -1;
    }

    /**
     * 线性查询，时间复杂度为O(n),相对上面两种是最差的
     * <p>
     * 虽然代码看起来简单，但是算法不是最优
     *
     * @param args
     * @param target
     * @return
     */
    private static int findIndex_3(int[] args, int target) {
        for (int i = 0; i < args.length; i++) {
            if (target == args[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 二分查找--平衡版
     * <p>
     * 减少循环中的判断次数，将最后一个数的比较放在循环外判断，循环中要处理的就是不断缩小范围。
     *
     * @param a
     * @param target
     * @return
     */
    private static int findIndex_4(int[] a, int target) {


        return -1;
    }


}
