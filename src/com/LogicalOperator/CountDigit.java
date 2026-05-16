package com.LogicalOperator;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		System.out.println("count digit");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int num = sc.nextInt();
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
