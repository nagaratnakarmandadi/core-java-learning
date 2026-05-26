package com.arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int k = 3;
		rotateArray(arr, k);
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	public static void rotateArray(int[] arr, int k) {
		int n = arr.length;
		reverseArray(arr, 0, n - 1);
		reverseArray(arr, 0, k - 1);
		reverseArray(arr, k, n - 1);

	}

	public static void reverseArray(int[] arr, int start, int end) {
		int temp = 0;

		while (start <= end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}

	}

}
