package com.LogicalOperator;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int balance = 1000;

		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
		System.out.println("4. Mini Statement");
		System.out.println("5. Exit");

		System.out.println("Enter your choice");
		int choice = sc.nextInt();

		switch (choice) {

		case 1 -> {

			System.out.println("Enter deposit amount");
			int amount = sc.nextInt();

			balance = balance + amount;

			System.out.println("Updated Balance = " + balance);

		}

		case 2 -> {

			System.out.println("Enter withdraw amount");
			int amount = sc.nextInt();

			if (amount <= balance) {

				balance = balance - amount;

				System.out.println("Remaining Balance = " + balance);

			} else {

				System.out.println("Insufficient Balance");

			}

		}

		case 3 -> System.out.println("Current Balance = " + balance);

		case 4 -> {

			System.out.println("Mini Statement");
			System.out.println("Available Balance = " + balance);

		}

		case 5 -> System.out.println("Thank You");

		default -> System.out.println("Invalid Choice");

		}

		sc.close();

	}

}