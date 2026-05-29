package com.AccessModifier01;

public class TestDemo01 {
	static {
		System.out.println("hello static block ");
		System.out.println("good morning ");
	}
	{
		System.out.println("hello instance block");
		System.out.println("welcome to kiet");
	}
	private int id1 = 18;
	private String name1 = "virat";
	 public int id2 = 45;
	 public String name2 = "hitman";

	 public TestDemo01() {
		System.out.println("hello construstor");
	}

	private void method1() {

	}
	public void method3() {
		System.out.println("method 3");
	}

	static void method2() {
		System.out.println("method 2");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDemo01 t1 = new TestDemo01();
		System.out.println(t1.id1);
		System.out.println(t1.name1);
		t1.method1();
		t1.method3();

	}

	private class TestInDemo1 {

	}

}