package com.LogicalOperator;

import java.util.Scanner;

public class Sum {
	public static void main(String[] arg) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;

		}
		System.out.println("sum of all digits :" + sum);
		sc.close();
	}

}
