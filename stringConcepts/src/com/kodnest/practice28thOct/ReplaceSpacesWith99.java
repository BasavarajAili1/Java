package com.kodnest.practice28thOct;

import java.util.Scanner;
// Q9
public class ReplaceSpacesWith99 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = scan.nextLine();
		System.out.println("Modidfied string is: "+replaceSpacesWith99(input));
	}
	public static String replaceSpacesWith99(String str) {
		str = str.replace(" ", "99");
		return str;
	}

}
