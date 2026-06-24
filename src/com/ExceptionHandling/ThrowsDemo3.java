package com.ExceptionHandling;

public class ThrowsDemo3 {

	static void display() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Hello Java");
	}

	public static void main(String[] args) {
		try {
			display();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}
}
