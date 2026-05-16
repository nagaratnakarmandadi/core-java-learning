package com.LogicalOperator;

import java.util.Scanner;

public class PerfectNumA {
	static boolean isperfect(int num) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			status = true;
		}
		return status;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		boolean status = isperfect(num);
		if (status) {
			System.out.println("perfect number");
			System.out.println("naga");
		
		} else {
			System.out.println("not a perfect number");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
