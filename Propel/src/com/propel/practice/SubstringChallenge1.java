package com.propel.practice;
import java.util.*;
public class SubstringChallenge1 {

	public static void main(String[] args) {
		String input1 = "2aabbacbaa";
        String input2 = "3aabacbebebe";
        String result = longestSubstringWithKUniqueCharacters(input1);
        String result2 = longestSubstringWithKUniqueCharacters(input2);
        System.out.println(result);
        System.out.println(result2);
	}

	private static String longestSubstringWithKUniqueCharacters(String str) {
		int k = Integer.parseInt(""+str.charAt(0));
		System.out.println(k);
		int start = 1, end = 1, uniqueCount = 0;
		int maxLength = 0;
		String longString = "";
		Map<Character, Integer> charCount = new HashMap<>();
		
		while(end < str.length()) {
			char currChar = str.charAt(end);
			charCount.put(currChar, charCount.getOrDefault(currChar, 0)+1);
			
			if(charCount.get(currChar) == 1) {
				uniqueCount++;
			}
			
			while(uniqueCount > k) {
				char startChar = str.charAt(start);
				
				charCount.put(startChar, charCount.get(startChar) - 1);
				if(charCount.get(startChar) == 0) {
					uniqueCount--;
				}
				start++;
			}
			
			int currLength = end - start + 1;
			if(currLength > maxLength) {
				maxLength = currLength;
				longString = str.substring(start, end+1);
			}
			end++;
		}

		return longString;
	}

}
