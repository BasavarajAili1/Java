package com.kodnest.stringprograms.level4;
import java.util.Scanner;

public class ReplaceSpaceWith99 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=new String(scan.nextLine());
		
		s1=s1.replace(" ","99");
		System.out.println("New String: "+s1);
	}
}
