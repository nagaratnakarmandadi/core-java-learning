package com.leetcode;

public class LeetCode01 {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 6, 8, 3, 4, 5, 1 };
		int target = 9;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					System.out.println(nums[i] +" "+nums[j]);

				}
			}
		}
	}

}