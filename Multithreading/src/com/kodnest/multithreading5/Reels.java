package com.kodnest.multithreading5;

public class Reels extends Thread {
	
	public void run() {
		try {
			System.out.println("Creating reels");
			Thread.sleep(2000);
			
			System.out.println("Uploading reels");
			Thread.sleep(2000);
			
			System.out.println("Sharing reels");
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
