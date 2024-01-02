package com.kodnest.practice28thOct;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = scan.nextLine();
		String res = findLongest(input);
		System.out.println("Longest word in the string is: "+res);
	}
	public static String findLongest(String str) {
		String[] strArr = str.split("[\\p{Punct}\\s]");
		
		String longArr = "";
		for(int i=0;i<=strArr.length-1;i++) {
			if(strArr[i].length() > longArr.length()) {
				longArr = strArr[i];
			}
		}
		return longArr;
	}

}
