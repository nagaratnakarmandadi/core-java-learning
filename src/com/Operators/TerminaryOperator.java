package com.Operators;

public class TerminaryOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int c = 140;
		int d = 50;
		int max = 0;
		max = (a > b) ? a : b;
		max = (max > c) ? max : c;
		max = (max > d) ? max : d;
		System.out.println("max of the value :" + max);

	}

}
