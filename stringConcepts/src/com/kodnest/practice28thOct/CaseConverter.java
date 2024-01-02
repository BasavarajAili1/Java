package com.kodnest.practice28thOct;
import java.util.Scanner;
//Q2
public class CaseConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String input = scan.nextLine();
		System.out.println("Modified string is: "+caseConverter(input));

	}
	public static String caseConverter(String str) {
		char[] arr = str.toCharArray();
		for(int i=0;i<=arr.length-1;i++) {
			if(Character.isUpperCase(arr[i])) {
				arr[i]= Character.toLowerCase(arr[i]);
			}
			else if(Character.isLowerCase(arr[i])) {
				arr[i] = Character.toUpperCase(arr[i]);
			}
		}
		return new String(arr);
	}
}
