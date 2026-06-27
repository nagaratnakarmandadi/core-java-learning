package com.leetcode;

public class CharacterCounter {
	public static void main(String[] args) {

		String str = "Java@2026#AI";

		int upper = 0, lower = 0, digit = 0, special = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch))
				upper++;
			else if (Character.isLowerCase(ch))
				lower++;
			else if (Character.isDigit(ch))
				digit++;
			else
				special++;
		}

		System.out.println("Uppercase : " + upper);
		System.out.println("Lowercase : " + lower);
		System.out.println("Digits    : " + digit);
		System.out.println("Special   : " + special);
	}
}
