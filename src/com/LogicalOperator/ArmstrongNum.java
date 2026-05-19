package com.LogicalOperator;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		System.out.println("check armstrong or not ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int r = 0;
		while (num != 0) {
			r = num % 10;
			sum = sum + (r * r * r);
			num = num / 10;

		}
		if (temp == sum) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
