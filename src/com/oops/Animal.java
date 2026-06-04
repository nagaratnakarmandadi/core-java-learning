package com.oops;

public interface Animal {
	public static final int x = 10;

	public abstract void sound();

	public abstract void eat();

	public abstract void sleep();

	public default void walk() {
		System.out.println("every animal can walk");
	}

	static void breath() {
		System.out.println("every animal can breath");
	}

	default void method1() {
		System.out.println("hello method 1");
		method2();

	}

	public static void main(String[] args) {
		System.out.println("main method");
		method3();
		breath();

	}

	static void method3() {
		System.out.println("in method 3 ");
	}

	private void method2() {
		System.out.println("hello");
		System.out.println("good morning");
		System.out.println("good day");
	}

}
