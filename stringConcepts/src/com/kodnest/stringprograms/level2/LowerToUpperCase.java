package com.kodnest.stringprograms.level2;
import java.util.Scanner;

import java.util.Scanner;

public class LowerToUpperCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String str=new String(scan.nextLine());
		System.out.println("Upper case: "+convertLowerToUpper(str));

	}
static String convertLowerToUpper(String str) {
		return str.toUpperCase();
	}

}
