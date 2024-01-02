package com.kodnest.MultiThread.SingleRunMethod;

public class ThreadDemo {

	public static void main(String[] args) {
		//create object of MyThread
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.setName("Numbers");
		t2.setName("Characters");
		
		t1.start();
		t2.start();

	}

}
