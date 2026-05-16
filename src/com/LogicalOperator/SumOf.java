package com.LogicalOperator;

import java.util.Scanner;

public class SumOf {

	public static void main(String[] args) {
		System.out.println("sum of given number");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		// TODO Auto-generated method stub
		System.out.println(sum);
		sc.close();

	}

}
