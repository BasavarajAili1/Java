package com.kodnest.arrays;

public class FindEvenDigits {

	public static void main(String[] args) {
		int[] arr = {141, 124, 58, 1584, 25, 0};
		
		int ans = countEven(arr);
		System.out.println(ans);

	}
	
	static int countEven(int[] arr) {
		
		int count=0;
		
		for(int num: arr) {
			if(even(num)) {
				count++;
			}
		}
		
		return count;
	}

	static boolean even(int num) {
		//return true if even digits
		int noOfDigits = digits(num);
		if(noOfDigits % 2 == 0) {
			return true;
		}
		return false;
	}
	
	
	//count the number of digits
	static int digits(int num) {
		
		int count = 0 ;
		
		if(num < 0) {
			num = num * -1;
		}
		if(num == 0) {
			return 1;
		}
		
		while(num>0) {
			count++;
			num /= 10;
		}
		return count;
	}

}
