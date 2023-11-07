package com.itlucky.pre.二分查找;

public class Test02 {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6, 7, 13, 55, 66, 68, 79, 121, 222, 870};

        int target = 1121;

        System.out.println(search(nums, target));

    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;

        while (left<right) {

            int mid = left+(right-left)/2;

            if (nums[mid]==target) {
                return mid;
            } else if (target>nums[mid]) {
                left = mid+1;
            } else if (target<nums[mid]) {
                right = mid-1;
            }
        }

        return -1;
    }
}
