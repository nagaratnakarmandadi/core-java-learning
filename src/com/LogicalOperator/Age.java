package com.LogicalOperator;

import java.util.Scanner;

public class Age {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age:");
		int age = sc.nextInt();
		if (age >= 0 && age <= 5) {
			System.out.println(" your are  kid");

		} else if (age >= 6 && age <= 12) {
			System.out.println("your  are children");
		} else if (age >= 13 && age <= 18) {
			System.out.println("your are teen age");
		} else if (age >= 24 && age <= 35) {
			System.out.println("your are young age");
		} else if (age >= 36 && age <= 59) {
			System.out.println("your are adult age");
		} else if (age >= 60) {
			System.out.println("your are old age");
		} else if (age < 0) {
			System.out.println("invalid number");
		}
		sc.close();
	}

}
