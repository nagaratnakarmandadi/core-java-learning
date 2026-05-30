package com.AccessModifier02;

import com.AccessModifier01.TestDemo01;

public class TestDemo03 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		TestDemo01 t1 = new TestDemo01();
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		//t1.method3();

	}
}