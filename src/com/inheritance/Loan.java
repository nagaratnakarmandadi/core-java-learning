package com.inheritance;

import java.util.Scanner;

public class Loan {
	static Scanner sc = new Scanner(System.in);

	String getAddressInfo() {
		String address = "";
		System.out.println("Enter your flatno :");
		String flatno = sc.nextLine();
		System.out.println("enter your street :");
		String street = sc.nextLine();
		System.out.println("enter your city :");
		String city = sc.nextLine();
		System.out.println("enter your state :");
		String state = sc.nextLine();
		System.out.println("enter your pin :");
		long pin = sc.nextLong();
		address = "flat no : " + flatno + "street  : " + street + "city : " + city + "state : " + state + "pin : "
				+ pin;
		return address;

	}

	int getCibil() {
		System.out.println("enter your cibil score : ");
		int cibil = sc.nextInt();
		return cibil;
	}

	double getSalary() {
		System.out.println("enter your salary :");
		double salary = sc.nextDouble();
		return salary;
	}

	double getROI() {
		double roi = 10.5;
		return roi;
	}

}
