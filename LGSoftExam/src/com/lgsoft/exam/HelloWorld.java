package com.lgsoft.exam;

public class HelloWorld {
	public static void main(String[] args) {

	Object s = "test";
	String s1 = s;
	method(s1);
	}
	public static void method(String s) { 
		System.out.print("Im a string");
	}
}
