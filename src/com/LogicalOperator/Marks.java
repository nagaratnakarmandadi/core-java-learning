package com.LogicalOperator;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student grade");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student marks");
		int marks = sc.nextInt();
		if (marks > 100 || marks <= 0) {
			System.out.println("enter valid marks");

		} else if (marks <= 99 && marks >= 90) {
			System.out.println("Grade A");
		} else if (marks <= 89 && marks >= 80) {
			System.out.println("grade B");
		} else if (marks <= 79 && marks >= 70) {
			System.out.println("grade C");
		} else if (marks <= 69 && marks >= 60) {
			System.out.println("grade D");
		} else if (marks <= 59 && marks >= 35) {
			System.out.println("grade E");
		} else if (marks < 35) {
			System.out.println("grade F");
		}
		sc.close();

	}

}
