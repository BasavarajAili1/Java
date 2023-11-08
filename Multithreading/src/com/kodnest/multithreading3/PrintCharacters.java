package com.kodnest.multithreading3;

public class PrintCharacters extends Thread{
	
	public void run() {
		
		for(int i=65;i<=75;i++) {
			System.out.println((char)(i));
		}
	}
}
