package com.inheritance;

public class TestDemo1 implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		TestDemo1 t1 = new TestDemo1();
		System.out.println(t1.clone());
		TestDemo1 t2 = new TestDemo1();
		System.out.println(t1.equals(t2));
		System.out.println(t1.hashCode());
		System.out.println(t1.getClass());

	}

}
