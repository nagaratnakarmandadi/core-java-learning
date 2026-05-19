package com.arrays;

public class MaxMin {

	public static void main(String[] args) {
		int[] n = { 12, 32, 54, 654, -23, 543 };
		int min = n[0];
		int max = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] < min) {
				min = n[i];
			} else if (n[i] > max) {
				max = n[i];
			}
		}
		System.out.println("min of the number  :" + min);
		System.out.println("max of the number :" + max);

	}

}
