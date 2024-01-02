package practiceHere;

import java.util.Scanner;

public class PaymentApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Add initial store opening balance: ");
		int account = scan.nextInt();
		account = withdraw(account); // t1
		account = deposit(account); // t2
		account = transfer(account); // t3
		account = deposit(account); // t4
		account = charges(account); // t5
		displayBalance(account); // t6
		
	}
	
	public static int withdraw(int account) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter withdraw amount: ");
		int withdraw = scan.nextInt();
		account = account - withdraw;
		return account;
	}
	
	public static int deposit(int account) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter deposit amount: ");
		int deposit = scan.nextInt();
		account = account + deposit;
		return account;
	}
	
	public static int  transfer(int account) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter amount to be transfered: ");
		int transfer = scan.nextInt();
		account = account - transfer;
		return account;
	}
	
	public static int charges(int account) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter charges to be applied: ");
		int charges = scan.nextInt();
		account = account - charges;
		return account;
	}
	
	public static void displayBalance(int account) {
		System.out.println("Account Balance: "+account);
	}
}
