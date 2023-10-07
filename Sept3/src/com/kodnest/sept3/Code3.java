package com.kodnest.sept3;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String s1=scanner.next();
        
        for(int i=1;i<=s1.length()-1;i=i+2) {
        	System.out.println(s1.charAt(i));
        }

	}

}
