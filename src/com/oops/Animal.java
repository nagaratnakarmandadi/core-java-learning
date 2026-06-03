package com.oops;

public interface Animal {
	public static final int x = 10;

	public abstract void sound();

	public abstract void eat();

	public abstract void sleep();

	public default void walk() {
		System.out.println("every animal can walk");
	}

	default void method1() {
		System.out.println("hello method 1");
	}

	public static void main(String[] args) {
		System.out.println("main method");

	}

}
