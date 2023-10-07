package com.kodnest.practice;
import java.util.Scanner;

public class Session1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("== ADDITION ==");
		System.out.println("Enter an byte value");
		byte b=scan.nextByte();
		System.out.println("Enter an short value");
		short s=scan.nextShort();
		System.out.println("Byte and Short values are: "+b+" "+s);
		System.out.println("Addition of given Byte and Short values is: "+(b+s));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("== SUBTRACTION ==");
		System.out.println("Enter an long value");
		long l=scan.nextLong();
		System.out.println("Enter an integer value");
		int i=scan.nextInt();
		System.out.println("Long and Integer values are: "+l+" "+i);
		System.out.println("Subtraction of Byte from Long is: "+(l-i));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("== FIND REMAINDER ==");
		System.out.println("Enter an float value");
		float f=scan.nextFloat();
		System.out.println("Enter an byte value");
		byte byt=scan.nextByte();
		System.out.println("Float and Byte values are: "+f+" "+byt);
		System.out.println("The Remainder after dividing Float by Byte is: "+(f%byt));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("== FIND QUETIONT==");
		System.out.println("Enter an double value");
		double d=scan.nextDouble();
		System.out.println("Enter an integer value");
		int integer=scan.nextInt();
		System.out.println("Double and Integer values are: "+d+" "+integer);
		System.out.println("Quetiont of double and integer value after dividing: "+(d/integer));
		
	}

}
