package com.oops;

import java.util.ArrayList;
import java.util.List;

// 1. SIMPLE CLASS representing an item
class Item {
	private String name;
	private double price;

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
}

// 2. SIMPLE CLASS representing a person
class Customer {
	private String name;
	private String email;

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}
}

// 3. COMPOSITION: The Order class "has a" Customer and "has a" List of Items.
class Order {
	private String orderId;
	private Customer customer; // Composition!
	private List<Item> cart; // Composition!
	private double totalAmount;

	public Order(String orderId, Customer customer) {
		this.orderId = orderId;
		this.customer = customer;
		this.cart = new ArrayList<>();
		this.totalAmount = 0.0;
	}

	public void addItem(Item item) {
		cart.add(item);
		totalAmount += item.getPrice();
		System.out.println("Added: " + item.getName());
	}

	// 4. METHOD OVERLOADING: Same method name, different parameters.
	// Discount by percentage
	public void applyDiscount(double percentage) {
		double discountAmount = totalAmount * (percentage / 100);
		totalAmount -= discountAmount;
		System.out.println("Applied " + percentage + "% discount.");
	}

	// Discount by flat amount
	public void applyDiscount(int flatRateDiscount) {
		totalAmount -= flatRateDiscount;
		System.out.println("Applied $" + flatRateDiscount + " flat discount.");
	}

	public void printReceipt() {
		System.out.println("\n=== Receipt for Order " + orderId + " ===");
		System.out.println("Customer: " + customer.getName());
		System.out.println("Items purchased: " + cart.size());
		System.out.println("Final Total: $" + totalAmount);
		System.out.println("=================================\n");
	}
}

public class VedhaDigitalGalaxyOrders {
	public static void main(String[] args) {
		// Creating the independent objects first
		Customer vipUser = new Customer("Aarav", "aarav@email.com");
		Item phoneCase = new Item("Silicone Phone Case", 25.00);
		Item screenProtector = new Item("Tempered Glass", 15.00);

		// Building the complex object using Composition
		Order order1 = new Order("ORD-9082", vipUser);

		System.out.println("Processing new order...");
		order1.addItem(phoneCase);
		order1.addItem(screenProtector);

		// Using Method Overloading
		// Java knows which applyDiscount method to use based on what we pass (double vs
		// int)
		order1.applyDiscount(10.0); // 10% off
		// order1.applyDiscount(5); // We could also do $5 off

		order1.printReceipt();
	}
}
