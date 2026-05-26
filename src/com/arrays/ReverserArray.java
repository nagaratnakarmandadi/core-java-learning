package com.arrays;

public class ReverserArray {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7 };
		int n1 = num.length;
		System.out.println("Reverse number");
		reverseArray(num, 0, n1 - 1);
		for (int n : num) {
			System.out.print(n + " ");

		}

	}
	

	public static void reverseArray(int[] num, int start, int end) {
		int temp = 0;
		while (start <= end) {
			temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			start++;
			end--;

		}
	}
}
