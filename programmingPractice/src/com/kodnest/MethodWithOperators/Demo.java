package com.kodnest.MethodWithOperators;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an number");
		int num=scan.nextInt();
		int right_shift_num=num>>1;
		System.out.println(right_shift_num);
	}

}
