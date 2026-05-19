package com.LogicalOperator;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		System.out.println("find factorial  ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i > num; i++) {

			sum = i * i;

		}
		System.out.println(sum);
		sc.close();

		// TODO Auto-generated method stub

	}

}
