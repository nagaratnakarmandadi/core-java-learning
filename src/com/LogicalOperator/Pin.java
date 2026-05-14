
package com.LogicalOperator;

import java.util.Scanner;

public class Pin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your pin");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		if (pin == 3232) {
			System.out.println("enter amount");
		} else {
			System.out.println("enter vaild pin");
		}
		sc.close();

	}

}
