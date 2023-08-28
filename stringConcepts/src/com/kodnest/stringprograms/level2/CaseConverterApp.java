package com.kodnest.stringprograms.level2;
import java.util.Scanner;

public class CaseConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=new String(scan.nextLine());
		String new_s1=caseConvert(s1);
		System.out.println("Case Converted String: "+new_s1);


	}
	static String caseConvert(String s1) {
		char arr[]=s1.toCharArray();

		for(int i=0;i<=arr.length-1;i++) {

			if(Character.isUpperCase(arr[i])) {
				arr[i]=Character.toLowerCase(arr[i]);
			}

			else if(Character.isLowerCase(arr[i])) {
				arr[i]=Character.toUpperCase(arr[i]);
			}
		}
		return new String(arr);
	}
}
