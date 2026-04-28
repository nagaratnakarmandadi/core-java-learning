package com.Operators;

import java.util.Scanner;

public class AirthmeticOperator {
	int a;
	int b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.print("enter another number");
		int b = sc.nextInt();
		System.out.println("addition" + (a + b));
		System.out.println("addition" + (a - b));
		System.out.println("addition" + (a * b));
		System.out.println("addition" + (a % b));
		System.out.println("addition" + (a / b));

		sc.close();

	}

	void show() {
		System.out.println("addition" + (a + b));
		System.out.println("subtraction" + (a - b));
		System.out.println("multiplication" + (a * b));
		System.out.println("modulus" + (a % b));
		System.out.println("division" + (a / b));
	}
}
 