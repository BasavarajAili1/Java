package com.kodnest.practice28thOct;

import java.util.Scanner;

public class ReverseWordsAtTheirOwnPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = scan.nextLine();
		String result = reverseWordsInOwnPosition(input);
		System.out.println("Modified string is: "+result);

	}
	public static String reverseWordsInOwnPosition(String str) {
		
		StringBuilder reversed = new StringBuilder();
		String[] words = str.split(" ");
		for(String word: words) {
			//if(!word.isEmpty()) {
				char[] wordArray = word.toCharArray();
				for(int i=wordArray.length-1;i>=0;i--) {
					reversed.append(wordArray[i]);
				//}
				//reversed.append(" ");
			}
				reversed.append(" ");
			
		}
		return reversed.toString();
	}

}
