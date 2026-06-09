package com.oops;

//1. ABSTRACTION: Hiding the implementation details. 
//You cannot create a generic "Product", only specific types like a phone or charger.
abstract class Product {

	// 2. ENCAPSULATION: Hiding data using 'private' and providing public
	// getters/setters.
	private String productId;
	private String name;
	private double price;

	// Constructor to initialize the product
	public Product(String productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	// Public Getters and Setters (The safe gateway to the private data)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) { // Encapsulation allows us to add validation logic
			this.price = price;
		} else {
			System.out.println("Invalid price update. Price must be greater than 0.");
		}
	}

	// Abstract method: Forces every subclass to implement its own version.
	public abstract void displayDetails();
}

//3. INHERITANCE: Smartphone inherits the properties of Product.
class Smartphone extends Product {
	private String brand;
	private int ramGb;

	public Smartphone(String productId, String name, double price, String brand, int ramGb) {
		// 'super' calls the constructor of the parent class (Product)
		super(productId, name, price);
		this.brand = brand;
		this.ramGb = ramGb;
	}

	// 4. POLYMORPHISM: Overriding the parent's abstract method with specific
	// behavior.
	@Override
	public void displayDetails() {
		System.out.println("📱 Smartphone Details:");
		System.out.println("Name: " + getName() + " | Brand: " + brand);
		System.out.println("RAM: " + ramGb + "GB | Price: $" + getPrice());
		System.out.println("-----------------------------------");
	}
}

//3. INHERITANCE: Accessory also inherits from Product.
class Accessory extends Product {
	private String accessoryType;

	public Accessory(String productId, String name, double price, String accessoryType) {
		super(productId, name, price);
		this.accessoryType = accessoryType;
	}

	// 4. POLYMORPHISM: Overriding with behavior specific to accessories.
	@Override
	public void displayDetails() {
		System.out.println("🎧 Accessory Details:");
		System.out.println("Name: " + getName() + " | Type: " + accessoryType);
		System.out.println("Price: $" + getPrice());
		System.out.println("-----------------------------------");
	}
}

//The Main execution class
public class VedhaDigitalGalaxyInventory {
	public static void main(String[] args) {
		System.out.println("=== Vedha Digital Galaxy Inventory System ===\n");

		// POLYMORPHISM IN ACTION:
		// Using the parent type 'Product' to store subclass objects.
		Product item1 = new Smartphone("PH-001", "iPhone 15", 799.99, "Apple", 8);
		Product item2 = new Accessory("AC-001", "20W USB-C Power Adapter", 19.99, "Charger");

		// Java knows exactly which displayDetails() to run at runtime.
		item1.displayDetails();
		item2.displayDetails();

		// Testing Encapsulation: Changing a price securely
		System.out.println("Applying a discount to the phone...");
		item1.setPrice(749.99); // Safe update through the setter

		System.out.println("Update: The " + item1.getName() + " is now on sale for $" + item1.getPrice());
	}
}
