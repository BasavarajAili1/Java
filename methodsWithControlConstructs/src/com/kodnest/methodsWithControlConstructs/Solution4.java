package com.kodnest.methodsWithControlConstructs;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an number to check it is Perfect Number or not!");
		int num=scan.nextInt();
		int res=perfectNumberChecker(num);
		if(res==num) {
			System.out.println(num+" is Perfect Number");
		}
		else {
			System.out.println(num+" is not Perfect Number");
		}
		
	}
	static int perfectNumberChecker(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
