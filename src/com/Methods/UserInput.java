package com.Methods;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		method1();
	}

	static void method1() {
		System.out.println("hello !!!");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter your name : ");
		String name = sc.nextLine();
		System.out.println("enter your age : ");
		int age = sc.nextInt();
		System.out.println("enter your phone number  : ");
		long number = sc.nextLong();
		System.out.println("enter your gender : ");
		char g = sc.next().charAt(0);
		System.out.println("user name :" + name);
		System.out.println("User age is : " + age);
		System.out.println("User mobile number  is : " + number);
		System.out.println("User gender is : " + g);
		sc.close();

	}
}