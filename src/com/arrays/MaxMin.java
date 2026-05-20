package com.arrays;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");

		int size = sc.nextInt();

		int[] num = new int[size];

		System.out.println("Enter elements:");

		for (int i = 0; i < num.length; i++) {

			num[i] = sc.nextInt();
		}

		int min = num[0];

		int max = num[0];

		System.out.println("Array elements:");

		for (int i = 0; i < num.length; i++) {

			System.out.print(num[i] + " ");
		}

		for (int i = 0; i < num.length; i++) {

			if (num[i] < min) {

				min = num[i];
			}

			if (num[i] > max) {

				max = num[i];
			}
		}

		System.out.println();

		System.out.println("Min of the number: " + min);

		System.out.println("Max of the number: " + max);

		sc.close();
	}
}