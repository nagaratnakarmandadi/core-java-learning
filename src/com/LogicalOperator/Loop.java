package com.LogicalOperator;

import java.util.Scanner;

public class Loop {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;

		}
		System.out.println(count);
		sc.close();

	}

}