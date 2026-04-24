package com.Methods;

import java.util.Scanner;

public class BankAccount {
	String gc = "thank you visit again ";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account holder name:");
		String name = sc.nextLine();

		System.out.println("Enter account number:");
		long accNo = sc.nextLong();

		System.out.println("Enter balance:");
		double balance = sc.nextDouble();

		System.out.println("Is account active? (true/false):");
		boolean isActive = sc.nextBoolean();

		System.out.println("\n--- Account Details ---");
		System.out.println("Name: " + name);
		System.out.println("Account No: " + accNo);
		System.out.println("Balance: " + balance);
		System.out.println("Active: " + isActive);
		BankAccount b1 = new BankAccount();
		System.out.println(b1.gc);

	
	}
}
