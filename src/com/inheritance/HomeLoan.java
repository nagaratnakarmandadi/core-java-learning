package com.inheritance;

public class HomeLoan extends Loan {

	public static void main(String[] args) {
		System.out.println("welcome to vcube banking");
		HomeLoan h = new HomeLoan();
		double salary = h.getSalary();
		int cibil = h.getCibil();
		if (salary <= 700000.00 && cibil <= 700) {
			System.out.println("your loan was apporved ");
			System.out.println("your rate of intrest :" + h.getROI());
			System.out.println("enter your address");
			System.out.println(h.getAddressInfo());

		} else {
			System.out.println("sorry");
		}

	}

	void getHomeInfoDocumentation() {
		System.out.println("all home loan documents are verfied ");

	}
}
