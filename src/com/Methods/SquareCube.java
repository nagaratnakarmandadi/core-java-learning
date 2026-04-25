package com.Methods;

import java.util.Scanner;

public class SquareCube {

	static int square(int n) {
		return n * n;
	}

	static int cube(int n) {
		return n * n * n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int n = sc.nextInt();

		System.out.println("Square: " + square(n));
		System.out.println("Cube: " + cube(n));

		sc.close();
	}
}
