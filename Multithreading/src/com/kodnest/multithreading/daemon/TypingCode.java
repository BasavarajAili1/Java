package com.kodnest.multithreading.daemon;

public class TypingCode extends Thread{
	//main activity
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Type code");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
