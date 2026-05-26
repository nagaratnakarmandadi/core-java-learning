package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] num = { 40, 50, 20, 30, 5, 10 };
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
		System.out.println("second largest :" + num[num.length - 2]);

	}

}
