package com.Constructors;

public class Laptop {
	String brand;
	String processor;
	int ram;
	double price;
	String color;
	String weight;

	Laptop(String brand, String processor,String color, String weight) {
		this.brand = brand;
		this.processor = processor;
	}

	Laptop(int ram, double price) {
		this.ram = ram;
		this.price = price;
	}

	Laptop(String color, String weight) {
		this.color = color;
		this.weight = weight;
	}

	Laptop(Laptop l1, Laptop l2,Laptop l3) {
		this.brand = l1.brand;
		this.processor = l1.processor;
		this.ram = l2.ram;
		this.price = l2.price;
		this.color=l3.color;
		this.weight=l3.weight;
		
	}

	void show() {
		System.out.println("Brand: " + brand);
		System.out.println("Processor: " + processor);
		System.out.println("RAM: " + ram);
		System.out.println("Price: " + price);
		System.out.println("color :" + color);
		System.out.println("weight :" + weight);
	}

	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell", "i7");
		Laptop l2 = new Laptop(16, 80000);

		Laptop l3 = new Laptop("black", "l20");
		Laptop l4= new Laptop(l1,l2,l3);
		l4.show();
	}
}
