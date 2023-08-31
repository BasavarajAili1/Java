package com.kodnest.stringprograms.level4;

public class RemoveDuplicates {
	String remove(String s1) {
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(!s2.contains(String.valueOf(s1.charAt(i)))) {
				s2=s2+s1.charAt(i);
			}
		}
		return s2;
	}
}
