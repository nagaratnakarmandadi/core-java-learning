package com.LogicalOperator;

import java.util.Scanner;

public class Loop {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// for (int i = 1; i <= num; i++) {

		// System.out.println(num + "*" + i + "=" + (num * i));

		// int sum = 0;
		for (int i = 1; i <= num; i++) {
			num = num * i;

		}
		System.out.println(num);
	}

}