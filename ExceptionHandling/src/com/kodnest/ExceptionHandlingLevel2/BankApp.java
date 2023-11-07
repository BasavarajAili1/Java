package com.kodnest.ExceptionHandlingLevel2;
import java.util.Scanner;
public class BankApp {

	public static void main(String[] args) {
		System.out.println("Bank Application started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw = ");
		double withdrawalAmount = scan.nextDouble();
		try {
			withdraw(withdrawalAmount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void withdraw(double withdrawanlAmount) throws Exception {
		double accountBalance = 15000.00;
		System.out.println("Withdrawal process started.");

		if (withdrawanlAmount <= accountBalance) {
			System.out.println(withdrawanlAmount + " has deducted from account");
		} else {
			System.out.println("Insufficient Balance");
			throw new InsufficientFundsException("Requested withdrawl amount exceeded account balance");
		}

	}

}
