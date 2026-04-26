package com.Constructors;

public class Car {
	String name;
	String brand;
	String color;

	Car() {
		System.out.println("constructor called");
	}

	public Car(String name, String brand, String color) {
		this.name = name;
		this.brand = brand;
		this.color = color;
	}

	public Car(String name, String brand) {
		this.name = name;
		this.brand = brand;

	}

	void disply1() {
		System.out.println("name of the car :" + name);
		System.out.println("brand of the car :" + brand);
	}

	void disply() {
		System.out.println("name of the car :" + name);
		System.out.println("brand of the car :" + brand);
		System.out.println("color of the car :" + color);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Car c1 = new Car("boolino", "suziki", "black");
		c1.disply();
		Car c = new Car("swift", "suziki", "white");
		c.disply();
		Car c2 = new Car("swift", "suziki");
		c2.disply1();

	}

}
