package com.kodnest.multithreading4;

public class PrintCharacters implements Runnable{
	
	public void run() {
		
		for(int i=65;i<=75;i++) {
			
			System.out.println((char) (i));
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
