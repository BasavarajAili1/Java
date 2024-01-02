package com.kodnest.stringprograms.level1;
import java.util.Scanner;

public class UnicodePrinter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String s1=new String(scan.next());
		System.out.print("Entered String is--> ");
		System.out.println(s1);
		unicodePrinter(s1);
		

	}
	public static void unicodePrinter(String s1) {
		char arr[]=s1.toCharArray();
		//System.out.println(arr);
		for(int i=0;i<=arr.length-1;i++) {
			char j=arr[i];
			int unicode = (int) j;
			System.out.print(unicode+" ");
		}
	}
}
