package com.LogicalOperator;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter jersey number");
		int jn = sc.nextInt();
		sc.close();
		switch (jn) {
		case 18 -> System.out.println("virat");
		case 45 -> System.out.println("hitman");
		case 7 -> System.out.println("MSD");
		case 17 -> System.out.println("ABD");
		case 333 -> System.out.println("BOSS");
		default -> System.out.println("invalid jersey number");
		}
	}

}
