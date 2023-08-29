package com.kodnest.stringprograms.level3;
import java.util.Scanner;

public class ReverseStringPreserveWspace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=new String(scan.nextLine());
		
		System.out.println("Original String is: "+s1);
		Reverse reverse = new Reverse();
		String RevString=reverse.reverse(s1);
		System.out.println("Reversed String is: "+RevString);

	}

}
