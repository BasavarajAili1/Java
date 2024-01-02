package com.kodnest.practice28thOct;

import java.util.Scanner;
//Q12 and Q11
public class ReverseSentence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = scan.nextLine();
		System.out.println("Reversed sentence is: "+reverseSentence(input));

	}
	public static String reverseSentence(String str) {
		String[] strArray = str.split(" ");
		StringBuilder reversed = new StringBuilder();
		
		for(int i=strArray.length-1;i>=0;i--) {
			reversed.append(strArray[i]).append(" ");
		}
		return reversed.toString();
	}

}
