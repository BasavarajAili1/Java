package com.kodnest.multithreading.daemon;

public class SavingCode extends Thread {
	//supporting activity
	@Override
	public void run() {
		for(;;) { // infinite loop
			System.out.println("Save code");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
