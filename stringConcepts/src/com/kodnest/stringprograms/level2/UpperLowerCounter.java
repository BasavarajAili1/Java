package com.kodnest.stringprograms.level2;

public class UpperLowerCounter {
	void countUpperLower(String str) {
		int lcount=0;
		int ucount=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				ucount++;
			}
			else {
				lcount++;
			}
		}
		System.out.println("UPPERCASE COUNT: "+ucount);
		System.out.println("LOWERCASE COUNT: "+lcount);
	}

}
