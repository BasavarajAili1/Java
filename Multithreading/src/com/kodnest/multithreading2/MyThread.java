package com.kodnest.multithreading2;

public class MyThread extends Thread {
	@Override //task of thread
	public void run() 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1);
	}
}
