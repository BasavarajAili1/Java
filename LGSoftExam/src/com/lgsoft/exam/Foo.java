package com.lgsoft.exam;

public class Foo {

	public static void main(String[] args) {
		String og = "opengenus";
		String og2 = new String(og);
		System.out.println((og==og2)+" "+(og.equals(og2)));
	}
}
