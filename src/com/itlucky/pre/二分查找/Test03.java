package com.itlucky.pre.二分查找;

public class Test03 {

    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 6, 8, 11, 15, 21, 35, 44, 124, 233, 268, 682};

        int target = 35;

        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {

        int left = 0;

        int right = nums.length-1;

        while (left<right) {

            int mid = (right-left)/2+left;

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
