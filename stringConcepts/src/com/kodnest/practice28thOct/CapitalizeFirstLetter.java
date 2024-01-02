package com.kodnest.practice28thOct;
import java.util.Scanner;
public class CapitalizeFirstLetter {
	//Q3
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String input = scan.nextLine();
		String result = CapitalizeEachFirstLetter(input);
		System.out.println("Formatted string is: "+result);
	}
	public static String CapitalizeEachFirstLetter(String str) {
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();
		for(String word: words) {
			char ch = Character.toUpperCase(word.charAt(0));
			String restString = word.substring(1).toLowerCase();
			result.append(ch).append(restString).append(" ");

		}
		return result.toString();
	}

}
