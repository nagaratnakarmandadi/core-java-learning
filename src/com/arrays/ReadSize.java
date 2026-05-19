package com.arrays;

import java.util.Scanner;

public class ReadSize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a array size");
		int size = sc.nextInt();
		int[] num = new int[size];

		System.out.println("enter the elements " + size);
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("representing an array");
		for (int i = 0; i < size; i++) {
			System.out.print(num[i] + " ");

		}
		System.out.println();
		System.out.println("representing an array in reverse");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
		sc.close();

	}

}
