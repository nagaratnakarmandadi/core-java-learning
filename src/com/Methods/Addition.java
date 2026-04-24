package com.Methods;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two integers:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Enter two floats:");
		float a1 = sc.nextFloat();
		float b1 = sc.nextFloat();

		System.out.println("Enter two doubles:");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();

		System.out.println("Enter two long values:");
		long l1 = sc.nextLong();
		long l2 = sc.nextLong();

		addition(a, b, a1, b1, d1, d2, l1, l2);
		sc.close();// ✅ correct call
	}

	static void addition(int i, int j, float l, float m, double d1, double d2, long l1, long l2) {

		System.out.println("addition method with multiple arguments");

		int sum = i + j;
		int diff = i - j;
		float mul = l * m;
		double mod = d1 % d2;
		long div = l1 / l2;

		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);
		System.out.println("Multiplication: " + mul);
		System.out.println("Modulus: " + mod);
		System.out.println("Division: " + div);

	}

}
