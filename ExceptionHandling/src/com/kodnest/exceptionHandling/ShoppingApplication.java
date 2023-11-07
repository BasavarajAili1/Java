package com.kodnest.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingApplication {
	public static void main(String[] args) {
		System.out.println("Welvcome to shopping application");
		shop();
		System.out.println("****main() method ended****");
	}
	
	public static void shop() {
		System.out.println("---> shop() method started");
		try {
			pay();
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Shopping not completed due to inapropriated input");
		}
		
		System.out.println("****shop() method ended****");
	}
	
	public static void pay() throws InputMismatchException{
		System.out.println("---> pay() method started");
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			System.out.println("Enter amount to be paid: ");
			double amount = scan.nextDouble();
			System.out.println("Amount paid = "+amount);
		} 
		catch (InputMismatchException ime) {
			// TODO: handle exception
			System.out.println("Exception Occured and Handled in pay() method");
			throw ime; // Re-throwing exception
		}
		
		scan.close();
		System.out.println("**** pay() method ended ****");
	}
}
