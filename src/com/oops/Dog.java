package com.oops;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("bow bow");

	}

	@Override
	public void eat() {
		System.out.println("dog can eat in anything");
	}

	@Override
	public void sleep() {
		System.out.println("sleep at morning");
	}

}
