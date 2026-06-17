package com.ExceptionHandling;

public class Exception01 {

	public static void main(String[] args) {
		System.out.println("main method");
		System.out.println("good morning");
		try {
			System.out.println(10 / 0);
			try {
				System.out.println("in try ");

			} catch (ArithmeticException ae) {
				System.err.println(" in catch");
			}
		} catch (Exception e) {
			System.out.println("in catch");
			e.printStackTrace();
		}
		System.out.println("main method ended");

	}

}
