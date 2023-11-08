package com.kodnest.multithreading3;

public class MyThread {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.println("This is main()****");
		}
		PrintNumbers t1 = new PrintNumbers();
		t1.start();
		
		PrintCharacters t2 = new PrintCharacters();
		t2.start();

	}

}
