package com.propel.practice;

public class LongestSubstring1 {

	public static void main(String[] args) {
		String input1 = "helloosannasmith";
		String input2 = "abcdefgg";

		String output1 = longestSubstring(input1);
		System.out.println(output1);
		String output2 = longestSubstring(input2);
		System.out.println(output2);
	}

	private static String longestSubstring(String str) {
		int maxLength = 0;
		String longestSubstring = "none";
		
		for(int i=0;i<str.length();i++) {
			String oddPalindrome = expandAroundCenter(str, i, i);
			
			String evenPalindrome = expandAroundCenter(str, i, i+1);
			
			if(evenPalindrome.length() > maxLength && evenPalindrome.length() > 2) {
				maxLength = evenPalindrome.length();
				longestSubstring = evenPalindrome;
			}
			
			if(oddPalindrome.length() > maxLength && oddPalindrome.length() > 2) {
				maxLength = oddPalindrome.length();
				longestSubstring = oddPalindrome;
			}
		}
		return longestSubstring;
	}

	private static String expandAroundCenter(String str, int left, int right) {
		while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}
		
		return str.substring(left+1, right);
	}

}
