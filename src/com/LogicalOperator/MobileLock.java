package com.LogicalOperator;

import java.util.Scanner;

public class MobileLock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int correctPin = 1234;

		int attempts = 0;

		while (attempts < 3) {

			System.out.println("Enter PIN:");

			int pin = sc.nextInt();

			if (pin == correctPin) {

				System.out.println("Phone Unlocked");

				break;

			} else {

				attempts++;

				System.out.println("Wrong PIN");

				System.out.println("Attempts left: " + (3 - attempts));
			}
		}

		if (attempts == 3) {

			System.out.println("Phone Locked");
		}

		sc.close();
	}
}
