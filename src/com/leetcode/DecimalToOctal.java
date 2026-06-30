package com.leetcode;

public class DecimalToOctal {
	public static void main(String[] args) {
		int decimal = 156;
		int[] octal = new int[20];
		int i = 0;

		while (decimal > 0) {
			octal[i] = decimal % 8;
			decimal = decimal / 8;
			i++;
		}

		System.out.print("Octal Number = ");
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(octal[j]);
		}
	}
}
