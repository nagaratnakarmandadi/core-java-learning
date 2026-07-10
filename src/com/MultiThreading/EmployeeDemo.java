package com.MultiThreading;

class Employee extends Thread {

	private int id;
	private String name;

	public void setId(int id) {
		this.id = id;
	}

	public int getIdValue() {
		return id;
	}

	public void setNameValue(String name) {
		this.name = name;
	}

	public String getNameValue() {
		return name;
	}

	@Override
	public void run() {

		System.out.println("Employee Id : " + getIdValue());
		System.out.println("Employee Name : " + getNameValue());

	}

}

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.setId(101);
		e1.setNameValue("Virat");

		e1.start();

	}
}
