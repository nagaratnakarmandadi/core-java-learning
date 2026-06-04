package com.oops;

public class TestCat {

	public static void main(String[] args) {
		System.out.println("main method");
		Animal c = new Cat();
		c.sound();
		c.eat();
		c.sleep();
		c.walk();
		Animal.breath();
		c.method1();
		Animal d = new Dog();
		d.sound();
		d.eat();
		d.sleep();
		d.walk();
		Animal.breath();
		Animal c1 = new Cow();
		c1.sound();
		c1.eat();
		c1.sleep();
		c1.walk();
		Animal.breath();
		Animal p = new Priya();
		p.sound();
		p.eat();
		p.sleep();
		p.walk();
		Animal.breath();

	}

}
