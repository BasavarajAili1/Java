package com.kodnest.practice28thOct;

import java.util.Scanner;
//Q4
public class CreateStringFromCharArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = scan.nextLine();
		char[] charArray = input.toCharArray();
		System.out.println("Converted string is: "+createStringFromCharArray(charArray));

	}
	public static String createStringFromCharArray(char[] charArray) {
		StringBuffer stringBuffer = new StringBuffer();
		for(char c: charArray) {
			stringBuffer.append(c);
		}
		return new String(stringBuffer);
	}

}
