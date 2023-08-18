package com.kodnest.methodsWithControlConstructs;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to find number of divisers of it: ");
		int num=scan.nextInt();
		int count=findDivisers(num);
		System.out.println("Total Number of divisers of "+num+" is "+count);
	}
	
	static int findDivisers(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		return count;
	}
}
