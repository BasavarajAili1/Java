package com.kodnest.MultiThread.SingleRunMethod;

public class MyThread extends Thread {
	
	synchronized public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("numbers")) {
			printNumbers();
		}
		printCharacters();
	}
	
	//method to print numbers
	public void printNumbers() {
		System.out.println("------Printing numbers started------");
		for(int i=0;i<=10;i++) {
			System.out.println("***"+i);
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("------Printing numbers ended------");
	}
	
	public void printCharacters() {
		System.out.println("------Printing characters started------");
		for(int i=65;i<=74;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("------Printing characters ended------");
	}
}
