package com.propel.practice;
import java.util.*;
public class LetterCount2 {

	public static void main(String[] args) {
		String input1 = "Hello apple pie";
		String input2 = "No words";
		String input3 = "hiiiiiii words";

		System.out.println(LetterCountI(input1)); // Output: Hello
		System.out.println(LetterCountI(input2)); // Output: -1
		System.out.println(LetterCountI(input3)); // Output: hiiiiiii
	}

	public static String LetterCountI(String str) {
		String finalWord = "";
		String[] words = str.split(" ");
		int maxRepeated = 0;
		
		for(String word: words) {
			Map<Character, Integer> charCount = new HashMap<>();
			
			for(char ch: word.toCharArray()) {
				charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
			}
			
			
			int repeatedCount = 0;
			for(int count: charCount.values()) {
				if(count>1) {
					repeatedCount += count;
				}
			}
			
			if(repeatedCount > maxRepeated) {
				maxRepeated = repeatedCount;
				finalWord = word;
			}
		}
		
		if(maxRepeated > 0) {
			return finalWord;
		}
		else {
			return "-1";
		}
		
		
	
	}

}
