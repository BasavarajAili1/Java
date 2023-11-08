package com.kodnest.multithreading5;

public class Chatting extends Thread {
	
	@Override
	public void run(){
		
		try {
			System.out.println("Chatting started...");
			Thread.sleep(2000);
			
			System.out.println("Chit chat chit chat bla bla...");
			Thread.sleep(2000);
			
			System.out.println("Chatting stoped..");
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
