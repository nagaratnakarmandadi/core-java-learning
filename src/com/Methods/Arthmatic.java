package com.Methods;

import java.util.Scanner;

public class Arthmatic {
	static int addition(int i, int j) {
		int sum = 0;
		sum = i + j;
		return sum;

	}

	static int subtraction(int i, int j) {
		int sub = 0;
		sub = i - j;
		return sub;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		display();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("enter another number");
		int b = sc.nextInt();
		int add = addition(a, b);
		System.out.println("addition of two numbers" + add);
		System.out.println("enter a number");
		int a1 = sc.nextInt();
		System.out.println("enter another number");
		int b1 = sc.nextInt();
		int sub = subtraction(a1, b1);
		System.out.println("subtraction of two numbers" + sub);

		sc.close();

	}

	static void display() {
		System.out.println("display method started ");
		System.out.println(addition(5000, 6000));
	}

}
