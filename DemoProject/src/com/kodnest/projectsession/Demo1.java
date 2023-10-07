package com.kodnest.projectsession;

import java.util.Scanner;

public class Demo1 {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter an Byte value");
		byte b=scan.nextByte();
		
		
		System.out.println("Enter an Short value");
		short s=scan.nextShort();
		
		
		System.out.println("Enter an  Int value");
		int i=scan.nextInt();
		
		
		System.out.println("Enter an Long value");
		long l=scan.nextLong();
		
		
		System.out.println("Enter an Float value");
		float f=scan.nextFloat();
		
		
		System.out.println("Enter an Double value");
		double d=scan.nextDouble();
		
		
		System.out.println("Enter an Char");
		char c=scan.next().charAt(0);
		
		
		System.out.println("Enter an Boolean value");
		boolean bool=scan.nextBoolean();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);

	}

}
