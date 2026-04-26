package com.Constructors;

public class Student {
	int sid;
	String sname;
	int age;

	Student() {
		this(1, "chandu", 21);
		System.out.println("noarg  constructor");
	}

	Student(int sid, String sname, int age) {
		System.out.println("parameterized called");
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Student s1 = new Student(101, "kiran", 22);
		s1.disply();
		Student s2 = new Student();
		s2.disply();

	}

	void disply() {
		System.out.println("enter name of the student" + sname);
		System.out.println("enter id :" + sid);
		System.out.println("enter age" + age);
	}

}
