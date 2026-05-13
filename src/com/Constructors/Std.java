package com.Constructors;

public class Std {
	int id;
	String name;
	double marks;
	String course;

	Std() {
		this(101);
		System.out.println("no arg called");
	}

	Std(int id) {
		this(id, "naga");
		System.out.println("one arg called");
	}

	Std(int id, String name) {
		this(id, name, 88.9);
		System.out.println("two arg called");
	}

	Std(int id, String name, double marks) {
		this(id, name, marks, "java full stack");
		System.out.println("three arg called");

	}

	Std(int id, String name, double marks, String course) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	public static void main(String[] arg) {
		System.out.println("main method started");
		Std s = new Std();
		s.show();
	}

	void show() {
		System.out.println("id ofthe student :" + id);
		System.out.println("name ofthe student :" + name);
		System.out.println("marks ofthe student :" + marks);
		System.out.println("course ofthe student :" + course);

	}

}
