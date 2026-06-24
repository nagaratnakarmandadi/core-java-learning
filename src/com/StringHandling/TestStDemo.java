package com.StringHandling;

public class TestStDemo {

	public static void main(String[] args) {
		try {
			String s = "sanjay keerthi";
			System.out.println(s.charAt(16));
		} catch (Exception e) {
			System.err.println("exception ");
			e.getMessage();
		}
		System.out.println("hello");

	}

}
