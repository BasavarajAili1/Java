package com.kodnest.practice28thOct;
import java.util.Scanner;

//Q1
public class CharacterExtractor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = scan.nextLine();
		System.out.println("Enter the index");
		int index = scan.nextInt();
		char res = charExtracter(input, index);
		if(res != '\0') {
			System.out.println(res);
		}
		else {
			System.out.println("Enter valid index.");
		}
		

	}
	
	public static char charExtracter(String str, int index) {
		if(index >= 0 && index <=str.length()) {
			return str.charAt(index);
		}
		else {
			return '\0';
		}

	}

}
