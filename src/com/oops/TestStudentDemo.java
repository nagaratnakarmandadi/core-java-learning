package com.oops;

public class TestStudentDemo {
	public static void main(String[] args) {
		System.out.println("main method");
		Student s1 = new Student();
		s1.setSid(23);
		s1.setSname("ratnakar");
		s1.setSage(22);
		s1.setSmarks(99);
		System.out.println("Student id :" + s1.getSid());
		System.out.println("Student name :" + s1.getSname());
		System.out.println("Student age :" + s1.getSage());
		System.out.println("student marks :" + s1.getSmarks());
		System.out.println("*********");
		Student s2 = new Student();
		s2.setSid(24);
		s2.setSname("prasad");
		s2.setSage(22);
		s2.setSmarks(89);
		System.out.println("Student id :" + s2.getSid());
		System.out.println("Student name :" + s2.getSname());
		System.out.println("Student age :" + s2.getSage());
		System.out.println("student marks :" + s2.getSmarks());

	}

}
