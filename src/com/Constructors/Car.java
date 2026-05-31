package com.Constructors;

 class Car {
	String name;
	String brand;
	String color;
	double prize;

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

	public Car(String name, String brand, String colour, double prize) {
		this.name = name;
		this.brand = brand;
		this.color = colour;
		this.prize = prize;
	}

	void display2() {
		System.out.println("name of the car :" + name);
		System.out.println("brand of the car :" + brand);
		System.out.println("color of the car :" + color);
		System.out.println("prize of the car :" + prize);

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
		Car c3 = new Car("base model", "bmw", "balck", 10000000);
		c3.display2();

	}
	final  class paid{
		 double cost =200;
		
	}

}
 
