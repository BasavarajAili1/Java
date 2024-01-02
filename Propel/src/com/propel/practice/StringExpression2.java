package com.propel.practice;
import java.util.*;
public class StringExpression2 {

	static String[] list = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	
	static int getValue(String temp) {
		for(int x=0;x<list.length;x++) {
			if(temp.equals(list[x])) {
				return x;
			}
		}
		return -1;
	}
	
	static String getExpression(char digit) {
		int index = Character.getNumericValue(digit);
		return list[index];
	}
	
	public static void main(String[] args) {
		System.out.println(stringExpression("onezeropluseight")); // Output: oneeight
		System.out.println(stringExpression("oneminusoneone")); // Output: negativeonezero
		System.out.println(stringExpression("foursixminustwotwoplusonezero")); // Output: threefour
	}

	private static String stringExpression(String str) {
		String temp = "";
		String intermediate = "";
		List<Integer> numberList = new ArrayList<>();
		
		
		for(int x=0 ; x<str.length(); x++) {
			temp += str.charAt(x);
			
			int value = getValue(temp);
			
			if(value >= 0 && value <= 9) {
				intermediate += value;
				temp = "";
			}
			
			if(temp.equals("plus") || temp.equals("minus") || x == str.length() - 1) {
				int result = Integer.parseInt(intermediate);
				numberList.add(result);
				intermediate = "";
				
				if(temp.equals("plus")) {
					numberList.add(0);
				}else if(temp.equals("minus")) {
					numberList.add(1);
				}
				temp="";
			}
		}
		
		int total = numberList.get(0);
		for(int i=1;i<numberList.size() - 1;i+=2) {
			if(numberList.get(i) == 0){
				total += numberList.get(i+1);
			}else {
				total -= numberList.get(i+1);
			}
		}
		String numString = String.valueOf(total);
		String finalString = "";
		
		if(total<0) {
			finalString += "negative";
			numString  = numString.substring(1);
		}
		for(int x=0;x < numString.length();x++) {
			finalString += getExpression(numString.charAt(x));
		}
		return finalString;
	}

}
