package com.LogicalOperator;

import java.util.Scanner;

public class Bill {

	static void display() {

		System.out.println("Rate the food");
		System.out.println("Please pay the bill");
		System.out.println("Thank you visit again");

	}

	public static void main(String[] args) {

		System.out.println("Welcome to KFC");

		Scanner sc = new Scanner(System.in);

		String yn = "";

		do {

			System.out.println("Enter your order");

			String order = sc.nextLine();

			switch (order) {

			case "pizza" -> System.out.println("Pizza Added");

			case "Briyani" -> System.out.println("Briyani Added");

			case "Chicken 665" -> System.out.println("Chicken 665 Added");

			case "Curd Rice" -> System.out.println("Curd Rice Added");

			default -> System.out.println("Item is not ready");

			}

			System.out.println("Do you want to continue? Click Y or N");

			yn = sc.nextLine();

		} while (yn.equalsIgnoreCase("Y"));

		display();

		sc.close();

	}

}