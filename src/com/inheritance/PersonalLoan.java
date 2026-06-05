package com.inheritance;

public class PersonalLoan extends Loan {

	public static void main(String[] args) {
		System.out.println("welcome to vcube banking ");
		PersonalLoan p = new PersonalLoan();
		double salary = p.getSalary();
		int cibil = p.getCibil();
		if (salary >= 500000.00 && cibil >= 700) {
			System.out.println("your loan was apporved ");
			System.out.println("your rate of intrest :" + p.getROI());
			System.out.println("enter your address");
			System.out.println(p.getAddressInfo());

		} else {
			System.out.println("sorry");
		}

	}

	void getHomeInfoDocumentation() {
		System.out.println("all home loan documents are verfied ");

	}

}
