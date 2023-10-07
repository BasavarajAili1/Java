package com.kondest.polymorphism;

public class Payment {
	public void checkBalance() {
		System.out.println("Checking balance for payment");
	}
	
	public void sendNotification() {
		System.out.println("Sending notification for user");
	}
	
	public void applyCode() {
		System.out.println("Applying promocode");
	}
	
	public void pay() {
		System.out.println("Payment done");
	}
}
