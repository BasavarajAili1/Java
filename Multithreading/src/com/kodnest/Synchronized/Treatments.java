package com.kodnest.Synchronized;

public class Treatments implements Runnable{
	Hospital h;

	public Treatments(Hospital h) {
		super();
		this.h = h;
	}

	@Override
	
	 synchronized public void run() {
		try {
			System.out.println("Treatment started for: "+Thread.currentThread().getName());
			Thread.sleep(2000);
			
			System.out.println("Treatment in progress for: "+Thread.currentThread().getName());
			Thread.sleep(2000);
			
			System.out.println("Treatment completed for: "+Thread.currentThread().getName());
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
