package com.Methods;

import java.util.Scanner;

public class DivisionModulus {

	static int division(int a, int b) {
		return a / b;
	}

	static int modulus(int a, int b) {
		return a % b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (b != 0) {
			System.out.println("Division: " + division(a, b));
			System.out.println("Remainder: " + modulus(a, b));
		} else {
			System.out.println("Cannot divide by zero");
		}

		sc.close();
	}
}
