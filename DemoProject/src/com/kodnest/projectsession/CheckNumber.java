package com.kodnest.projectsession;

public class CheckNumber {
	static void check(int num) {
		if(num%4==0) {
			System.out.println("Yes! "+num+" is divisible by 4");
		}
		else {
			System.out.println("No! "+num+" is not divisible by 4");
		}
	}
}
