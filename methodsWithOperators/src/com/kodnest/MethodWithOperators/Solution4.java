package com.kodnest.MethodWithOperators;
import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num=scan.nextInt();
		int count=countSetBits(num);
		System.out.println("Number of set bits: "+count);
	}
	public static int countSetBits(int num) {
		int count=0;
		while(num>0) {
			if((num & 1)==1) {
				count=count+1;
			}
			num=num >> 1;
		}
		return count;
	}
}
