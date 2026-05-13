package com.Operators;

public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("java");
		System.out.println(s);
		System.out.println(s instanceof String);
		Integer i = 100;
		System.out.println(i);
		System.out.println(i instanceof Integer);
		InstanceOf t = new InstanceOf();
		System.out.println(t instanceof InstanceOf);

	}

}
