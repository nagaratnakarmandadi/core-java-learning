package com.arrays;

public class MinMax {

	public static void main(String[] args) {
		int[] num = { 50, 40, 30, 10, 20, 5 };
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1 - i; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j + 1];
					num[j + 1] = num[j];
					num[j] = temp;

				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("min value :" + num[0]);
		System.out.println("max value :" + num[num.length - 1]);
		System.out.println("second largest value :" + num[num.length - 2]);

	}

}
