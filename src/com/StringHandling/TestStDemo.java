package com.StringHandling;

public class TestStDemo {

	public static void main(String[] args) {
		try {
			String s = "sanjay keerthi";
			System.out.println(s.charAt(3));
			System.out.println(s.codePointAt(3));
			System.out.println(s.codePointBefore(4));
			System.out.println(s.codePointCount(1, 14));
		} catch (Exception e) {
			System.err.println("exception ");
			e.getMessage();
		}
		System.out.println("hello");

	}

}