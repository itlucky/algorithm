package com.itlucky.pre.二分查找;

import java.util.Arrays;


/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 * 思路分析
 * 关于二分查找法维基百科给出的定义是：
 *
 * 二分查找法是一种在有序数组中查找某一特定元素的搜索算法。
 * 搜索过程从数组的中间元素开始，如果中间元素正好是要查找的元素，
 * 则搜索过程结束；如果某一特定元素大于或者小于中间元素，
 * 则在数组大于或小于中间元素的那一半中查找，而且跟开始一样从中间元素开始比较。
 * 如果在某一步骤数组为空，则代表找不到。这种搜索算法每一次比较都使搜索范围缩小一半。
 *
 */
public class MidSearch {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        Arrays.sort(nums);
        int target = 9;
        System.out.println(search(nums, target));
    }

    /**
     * 输入: nums = [-1,0,3,5,9,12], target = 9
     * 输出: 4
     */
    public static int search(int[] nums, int target) {
        // 在区间[left,right]中查找元素，左闭右闭
        int left = 0;
        int right = nums.length-1;
        while (left<=right) {
            int mid = left+(right-left)/2;
            if (target==nums[mid]) {
                return mid;
            } else if (target<nums[mid]) {
                right = mid-1;
            } else if (target>nums[mid]) {
                left = mid+1;
            }
        }
        return -1;
    }

}
