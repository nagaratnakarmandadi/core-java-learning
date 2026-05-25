package com.arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] num = { 50, 40, 30, 10, 20, 5 };
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			int min = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[min]) {
					min = j;
				}
			}
			temp = num[i];
			num[i] = num[min];
			num[min] = temp;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
