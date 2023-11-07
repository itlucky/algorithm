package com.itlucky.pre.二分查找;

public class Test01 {

    public static void main(String[] args) {

        int[] nums = {1, 3, 7, 8, 9, 11, 15, 16, 19, 23, 55, 99, 102, 300};

        int target = 99;

        System.out.println(search(nums, target));

    }

    public static int search(int[] nums, int target) {

        int left = 0;

        int right = nums.length-1;

        while (left<=right) {
            int mid = left+(right-left)/2;
            if (nums[mid]==target) {
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
