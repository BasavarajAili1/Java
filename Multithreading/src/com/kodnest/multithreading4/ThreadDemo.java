package com.kodnest.multithreading4;

public class ThreadDemo {

	public static void main(String[] args) {
		
		PrintNumbers pn = new PrintNumbers();
		PrintCharacters pc = new PrintCharacters();
		
		Thread t1 = new Thread(pn);
		Thread t2 = new Thread(pc);
		
		t1.start();
		t2.start();

	}

}
