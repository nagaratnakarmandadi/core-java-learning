package com.oops;

public class TestStudentDemo {
	public static void main(String[] args) {
		System.out.println("main method");
		Student s1 = new Student();
		s1.setSid(23);
		s1.setSname("ratnakar");
		s1.setSage(22);
		System.out.println("Student id :" + s1.getSid());
		System.out.println("Student id :" + s1.getSname());
		System.out.println("Student id :" + s1.getSage());
	}

}
