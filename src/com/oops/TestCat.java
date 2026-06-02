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
		Animal c1 = new Cow();
		c1.sound();
		c1.eat();
		c1.sleep();

	}

}
