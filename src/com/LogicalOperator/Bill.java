package com.LogicalOperator;

import java.util.Scanner;

public class Bill {
	static void display() {
		System.out.println("rate the food");
		System.out.println("please pay the bill");
		System.out.println("thank you visti again");

	}

	public static void main(String[] args) {
		System.out.println("welcome to kfc");
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your order");
		String order = sc.nextLine();

		switch (order) {
		case "pizza" -> {
			System.out.println("pizza");
			display();
		}
		case "Briyani" -> {
			System.out.println("Briyani");
			display();
		}
		case "Chicken 665" -> {
			System.out.println("Chicken 665");
			display();
		}
		case "Curd Rice" -> {
			System.out.println("Curd Rice");
			display();
		}
		default -> System.out.println("item is not ready");

		}
		sc.close();

	}

}