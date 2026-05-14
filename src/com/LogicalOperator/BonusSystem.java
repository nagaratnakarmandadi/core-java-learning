package com.LogicalOperator;

import java.util.Scanner;

public class BonusSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BONUS DETAILS OF THE EMP");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year of experience");
		int exp = sc.nextInt();
		if (exp == 0 && exp <= 2) {
			System.out.println("5%");

		} else if (exp >= 3 && exp <= 5) {
			System.out.println("15%");
		} else if (exp >= 6) {
			System.out.println("20%");
		}
		sc.close();

	}

}
