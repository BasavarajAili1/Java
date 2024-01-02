package com.propel.practice;
import java.util.*;
/*
 * Searching Challenge
take the str parameter being passed and find the longest substring that contains k unique characters, 
where k will be the first character from the string. The substring will start from the second position in 
the string because the first character will be the integer k. For example: if str is "2aabbacbaa" there are 
several substrings that all contain 2 unique characters, namely: ['aabba", "ac", "cb", "ba"], but your program 
should return "aabba" because it is the longest substring. If there are multiple longest substrings, then 
return the first substring encountered with the longest length. k will range from 1 to 6. Once your function 
is working, take the final output string and remove any characters (case-insensitive) from it that appear in you ChallengeToken. 
If the new final string is empty, return the string EMPTY.
 * 
 */
public class SubstringChallenge2 {

	public static void main(String[] args) {
		String input1 = "2aabbacbaa";
        String input2 = "3aabacbebebe";
        String token = "f4rmu89A1?";
        String result = longestSubstringWithKUniqueCharacters(input1, token);
        String result2 = longestSubstringWithKUniqueCharacters(input2, token);
        System.out.println(result);
        System.out.println(result2);
	}

	private static String longestSubstringWithKUniqueCharacters(String str, String token) {
		int k = Integer.parseInt(""+str.charAt(0));
		Map<Character, Integer> charCount = new HashMap<>();
		int start = 1, end = 1, uniqueCount = 0;
		int maxLength = 0;
		String longSubstring = "";
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
				longSubstring = str.substring(start, end+1);
			}
			end++;
		}
		System.out.println(longSubstring);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<longSubstring.length();i++) {
			char currChar = longSubstring.charAt(i);
			boolean present = false;
			
			for(int j=0;j<token.length();j++) {
				char currChar1 = Character.toLowerCase(currChar);
				char tokenChar1 = Character.toLowerCase(token.charAt(j));
				if(currChar1 == tokenChar1) {
					present = true;
					break;
				}
			}
			
			if(!present) {
				sb.append(currChar);
			}
		}
		return sb.toString();
	}

}
