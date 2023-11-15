package com.kodnest.multithreading.daemon;

public class CompilingCode extends Thread{
	// supporting activity
	@Override
	public void run() {
		for(;;) { // infinite loop
			System.out.println("Compile code");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
