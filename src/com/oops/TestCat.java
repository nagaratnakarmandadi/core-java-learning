package com.oops;

public class TestCat {

	public static void main(String[] args) {
		System.out.println("main method");
		Animal c = new Cat();
		c.sound();
		c.eat();
		c.sleep();
		Animal d = new Dog();
		d.sound();
		d.eat();
		d.sleep();

	}

}
