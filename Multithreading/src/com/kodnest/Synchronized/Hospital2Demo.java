package com.kodnest.Synchronized;

public class Hospital2Demo {

	public static void main(String[] args) {
		Hospital2 h = new Hospital2();
		
		Tom tom = new Tom(h);
		Jerry jerry = new Jerry(h);
		
		Thread t1 = new Thread(tom);
		Thread t2 = new Thread(jerry);
		
		t1.start();
		t2.start();

	}

}
