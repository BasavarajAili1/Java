package com.kodnest.stringprograms.level2;
import java.util.Scanner;

public class UnicodePrinter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String s1=new String(scan.next());
		System.out.println(s1);
		unicodePrinter(s1);

	}
	public static void unicodePrinter(String s1) {
		for(int i=0;i<=s1.length()-1;i++) {
			int unicode=(int)s1.charAt(i);
			System.out.print(unicode+" ");
		}
	}
}
