package com.code.regext;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

public class ScannerRead {

	public static BufferedReader input = new BufferedReader(new StringReader(
			"Artificial intelligence\n 1 3.14"));

	public static void main(String[] args) {
		Scanner stdin = new Scanner(ScannerRead.input);
		System.out.println("What is your name?");
		String name = stdin.nextLine();
		System.out.println(name);
		System.out.println("How old are you? What is you favorite double?");
		System.out.println("(input:<age> <double>)");
		int age = stdin.nextInt();
		double favorite = stdin.nextDouble();
		System.out.println("age:" + age + ", favorite:" + favorite);
	}

}
