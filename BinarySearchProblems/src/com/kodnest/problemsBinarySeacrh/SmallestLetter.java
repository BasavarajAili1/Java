package com.kodnest.problemsBinarySeacrh;
// Question: return smallest letter larger than target
public class SmallestLetter {

	public static void main(String[] args) {
		char[] letters = {'a', 'b', 'c', 'd', 'e'};
		char target = 'a'; // ans: b
		char res = findSmallest(letters, target);
		System.out.println(res);

	}
	
	static char findSmallest(char[] letters, char target) {
		int start = 0;
		int end = letters.length-1;
		
		while(start<=end) {
			int mid = start + (end - start) / 2;
			
			if(target >= letters[mid]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return letters[start % letters.length];
	}
}
