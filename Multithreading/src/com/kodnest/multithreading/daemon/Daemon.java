package com.kodnest.multithreading.daemon;

public class Daemon {

	public static void main(String[] args) {
		// Instantiate the thread objects
		TypingCode t1 = new TypingCode();
		SavingCode t2 = new SavingCode();
		CompilingCode t3 = new CompilingCode();
		
		//Set thread as daemon thread
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		
		// start all threads
		t1.start();
		t2.start();
		t3.start();
	}

}
