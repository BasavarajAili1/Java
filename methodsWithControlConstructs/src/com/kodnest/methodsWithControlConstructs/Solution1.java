package com.kodnest.methodsWithControlConstructs;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int sum=sumOfFactorials(num);
		System.out.println("Sum of Factorials of each numbers is "+sum);
	}
	
	static int sumOfFactorials(int num) {
		int sum=0; 
		for(int i=1;i<=num;i++) {
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
		}
		return sum;
	}
}
