package com.LogicalOperator;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("To check palindrome or not");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int temp = num;
		int r = 0;
		int rev = 0;
		while (num != 0) {
			r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;

		}
		if (temp == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
		sc.close();

	}

}
