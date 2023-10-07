package com.kondest.polymorphism;

public class PaymentApplication {

	public static void main(String[] args) {
		Payment ref;
		
		ref = new Upi();
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();
		System.out.println();
		
		ref = new Card();
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();
		System.out.println();
		
		ref = new Wallet();
		ref.checkBalance();
		ref.sendNotification();
		ref.applyCode();
		ref.pay();

	}

}
