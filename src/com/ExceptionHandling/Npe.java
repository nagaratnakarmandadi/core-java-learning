package com.ExceptionHandling;

public class Npe {

	private static String s;

	public static void main(String[] args) {
		try {
			s = null;
			System.out.println("inn try");
			System.out.println(s.length());
		
			try {
				String a = "java";
				System.out.println(a.charAt(0));
				System.out.println(a.charAt(6));
			} catch (StringIndexOutOfBoundsException se) {
				System.out.println("in catch1");
				se.printStackTrace();
			}
		} catch (NullPointerException ne) {
			System.out.println("in catch2");
			ne.printStackTrace();
		}

	}

}
