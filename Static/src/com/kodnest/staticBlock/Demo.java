package com.kodnest.staticBlock;

public class Demo {
	static {
		System.out.println("Hello");
	}
	
	static {
		System.out.println("Hi");
	}
	
	{
		System.out.println("Bye");
	}
	
	{
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		System.out.println("World");
		new Demo();
	}
}
