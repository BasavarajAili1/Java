package com.kodnest.practice28thOct;

import java.util.Scanner;
//Q8
public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = scan.nextLine();
		String result = removeDuplicates(input);
		System.out.println("Modified string is: "+result);

	}
	public static String removeDuplicates(String str) {
		String str2 = "";
		
		for(int i=0;i<=str.length()-1;i++) {
			if(!str2.contains(String.valueOf(str.charAt(i)))) {
				str2 = str2+str.charAt(i);
			}
		}
		return str2;
	}

}
