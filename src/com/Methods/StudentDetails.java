package com.Methods;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter student name:");
		String name = sc.nextLine();

		System.out.println("Enter age:");
		int age = sc.nextInt();

		System.out.println("Enter marks:");
		double marks = sc.nextDouble();

		System.out.println("Enter gender:");
		char gender = sc.next().charAt(0);

		System.out.println("\n--- Student Details ---");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Marks: " + marks);
		System.out.println("Gender: " + gender);

		sc.close();
	}
}
