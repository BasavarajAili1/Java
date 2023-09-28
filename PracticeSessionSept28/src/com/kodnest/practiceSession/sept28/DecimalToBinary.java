package com.kodnest.practiceSession.sept28;

public class DecimalToBinary {

	public static void main(String[] args) {
		int num = 10;
		
		int rem = 0;
		String br = "";
		while(num > 0) {
			rem = num % 2;
			br = rem + br;
			num = num/2;// here taking quotient and assigning it num
		}
//		int res = Integer.valueOf(br);
		System.out.println(br);
//		System.out.println(res);

	}

}
