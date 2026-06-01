package com.oops;

public class TestEmployeDemo {

	public static void main(String[] args) {
		System.out.println("main method");
		Employe e = new Employe();
		e.setEid(18);
		e.setEname("virat");
		e.setSalary(200000);
		e.setDid(169);
		System.out.println("employe id :" + e.geteid());
		System.out.println("employe name :" + e.getEname());
		System.out.println("employee salary :" + e.getSalary());
		System.out.println("employee did :" + e.getDid());

	}

}
