package com.kodnest.Synchronized;

public class Hospital2 {
	
	String resource1 = "doctor";
	String resource2 = "bed";
	
	public void treatTom(){
		try {
			synchronized (resource1) {
				System.out.println("Tom is using: "+resource1);
				Thread.sleep(2000);
				synchronized (resource2) {
					System.out.println("Tom is using: "+resource2);
				}
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void treatJerry(){
		try {
			synchronized (resource1) {
				System.out.println("Jerry is using: "+resource1);
				Thread.sleep(2000);
				synchronized (resource2) {
					System.out.println("Jerry is using: "+resource2);
				}
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
