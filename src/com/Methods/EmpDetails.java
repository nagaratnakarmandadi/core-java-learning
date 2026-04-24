package com.Methods;

import java.util.Scanner;

public class EmpDetails {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started ");
		EmpDetails t = new EmpDetails();
		String fullname = t.getEmpName();
		int age = t.getEmpAge();
		double sal = t.getEmpSal();
		double bonus = t.getEmpBonus();
		double totsal = sal + bonus;
		System.out.println("fullname of emp : " + fullname);
		System.out.println("fullname of emp : " + age);
		System.out.println("fullname of emp : " + sal);
		System.out.println("fullname of emp : " + bonus);
		System.out.println("total salary of emp :" + totsal);
		t.sc.close();

	}

	String getEmpName() {
		System.out.println("enter your name  :");
		String name = sc.nextLine();
		return name;

	}

	int getEmpAge() {
		System.out.println("Enter your age..:");
		int age = sc.nextInt();
		return age;
	}

	double getEmpSal() {
		System.out.println("enter your salary..:");
		double sal = sc.nextDouble();
		return sal;
	}

	double getEmpBonus() {
		System.out.println("enter your bonus ..");
		double bonus = sc.nextDouble();
		return bonus;
	}

}
