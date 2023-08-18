package com.kodnest.methodsWithControlConstructs;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter from where the Prime Numbers have to printed: ");
		int from=scan.nextInt();
		System.out.println("Enter upto where the Prime Numbers have to printed: ");
		int to=scan.nextInt();
		
		for(int i=from;i<=to;i++) {
			int prime=isPrime(i);
			if(prime>0) {
				System.out.println(prime);
			}
		}
	}

	static int isPrime(int n) {
		if(n==2) {
			return n;
		}
		else if(n==3) 
		{
			return n;
		}
		else if(n<2)
		{
			return 0;
		}
		else if (n%2==0)
		{
			return 0;
		}
		else return n;
	}
}
