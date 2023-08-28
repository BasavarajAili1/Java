package com.kodnest.stringprograms.level2;
import java.util.Scanner;

public class ULCounterWithoutBuiltin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string!");
		String str=new String(scan.nextLine());
		ulcounter(str);
	}
	
	static void ulcounter(String str) {
		int ucount=0;
		int lcount=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			int ch=str.charAt(i);
			if (ch>=97 && ch<=122) {
				lcount++;
			}
			else {
				ucount++;
			}
		}
		System.out.println("UPPERCASE COUNT: "+ucount);
		System.out.println("LOWERCASE COUNT: "+lcount);
	}
}
