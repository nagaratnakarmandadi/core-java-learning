package com.oops;

public class Cow implements Animal {

	@Override
	public void sound() {
		System.out.println("ambaa ambaa");

	}

	@Override
	public void eat() {
		System.out.println("cow eat grass ");

	}

	@Override
	public void sleep() {
		System.out.println("sleep at night");
	}

}
