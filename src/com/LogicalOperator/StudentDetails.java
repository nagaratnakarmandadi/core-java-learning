package com.LogicalOperator;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {

		System.out.println("Enter student details");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name:");

		String name = sc.nextLine();

		if (!name.isEmpty()) {

			System.out.println("Okay, add your further details");

			System.out.println("Enter your years of experience:");

			int yoe = sc.nextInt();

			if (yoe >= 0 && yoe <= 2) {

				System.out.println("Nice");

				System.out.println("Do you have project experience? true/false");

				boolean project = sc.nextBoolean();

				if (project) {

					System.out.println("Project experience available");
					System.out.println("enter number of poject");
					int projcount = sc.nextInt();
					if (projcount >= 0 && projcount <= 2) {
						System.out.println("your are going well");
						System.out.println("what are your tech");
						String stack = sc.nextLine();
						if (!stack.isEmpty()) {
							System.out.println("can you join a interview");
						} else {
							System.out.println("our team will contact your");
						}
					} else {
						System.out.println("not a problem");
					}

				} else {

					System.out.println("No project experience");
				}

			} else {

				System.out.println("Experienced candidate");
			}

		} else {

			System.out.println("Invalid details");
		}

		sc.close();
	}
}
