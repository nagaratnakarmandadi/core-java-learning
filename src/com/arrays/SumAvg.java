package com.arrays;

public class SumAvg {
	public static void main(String[] arg) {
		int[] num = { 12, 45, 78, -89, -67, 88 };
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		avg = sum / num.length;
		System.out.println("sum of numbers" + sum);
		System.out.println("avg of the numbers" + avg);
	}

}
