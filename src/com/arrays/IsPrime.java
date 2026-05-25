package com.arrays;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		int[] num = new int[size];

		System.out.println("enter number");
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();

		}
		for (int i = 0; i < size; i++) {

			for (int j = 0; j < num[i]; j++) {
				if (num[i] % j == 0) {
					System.out.println(num[i]);
				}
			}
		}

	}
}
