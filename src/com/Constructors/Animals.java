package com.Constructors;

public class Animals {
	Animals() {
		System.out.println("no arg constructor called from animal ");
	}

	Animals(String sound) {
		System.out.println("perameterized construct called from animal");
	}

	public static void main(String[] args) {
		System.out.println("main method from animals");

	}

}

class Cat extends Animals {
	String drink;

	Cat() {
		super();
		System.out.println("no arg constructor called cat ");
	}

	Cat(String drink) {
		super("milk");

		this.drink = drink;
		System.out.println("parameterized constructor called from cat" + drink);
	}

	public static void main(String[] args) {
		System.out.println("main method from  cat");
		System.out.println("hello");
		new Cat("memo");
		System.out.println("wellcome");
		new Cat();

	}

}
