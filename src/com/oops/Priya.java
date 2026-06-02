package com.oops;

public class Priya implements Animal {

	@Override
	public void sound() {
		System.out.println("faah faah");
	}

	@Override
	public void eat() {
		System.out.println("grass ");
	}

	@Override
	public void sleep() {
		System.out.println("24 hrous per day");
	}

}
