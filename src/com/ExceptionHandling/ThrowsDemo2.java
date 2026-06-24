package com.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo2 {

	static void readFile() throws IOException {
		FileReader fr = new FileReader("sample.txt");
		fr.close();
	}

	public static void main(String[] args) {
		try {
			readFile();
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}
}
