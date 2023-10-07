package com.kodnest.commandline.arguments;

public class Addition {

	public static void main(String[] args) {
		System.out.println("First Argument: "+args[0]);
		System.out.println("Second Argument: "+args[1]);
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		System.out.println("Addition: "+(a+b));
	}

}
