package com.oops;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("meow ");

	}

	@Override
	public void eat() {
		System.out.println("cat can eat rat ");

	}

	@Override
	public void sleep() {
		System.out.println("sleep at night");

	}

	public void method2() {
		System.out.println("hello");

	}

}
