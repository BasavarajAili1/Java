package com.kodnest.practice;
import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("=== IMPLICIT TYPE CASTNG ===");
		System.out.println("Enter an Byte value");
		byte byt=scan.nextByte();
		int i=byt;
		System.out.println("Integer containing byte value is: "+i);
		
		System.out.println("Enter an Integer value");
		int integer=scan.nextInt();
		float f=integer;
		System.out.println("Float value containing integer value is: "+f);
		double d=integer;
		System.out.println("Double value containing integer value is: "+d);
		
		System.out.println("=== EXPLICIT TYPE CASTNG ===");
		System.out.println("Enter an Integer value");
		int a=scan.nextInt();
		System.out.println("Storing Integer in  Byte variable");
		byte b=(byte)a;
		System.out.println(b);
		
		System.out.println("Enter Double value");
		double db=scan.nextDouble();
		System.out.println("Storing Double value in Float variable");
		float f1=(float) db;
		System.out.println(f1);
		
	}

}
