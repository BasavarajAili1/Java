package com.kodnest.stringprograms.level3;

public class ReverseWordLogic {
	String reverse(String s1) {
		String wordArr[]=s1.split(" ");

		String revWord=null;
		String revString="";
		
		for(int i=0;i<=wordArr.length-1;i++) {
			String word=wordArr[i];
			char wa[]=word.toCharArray();

			char rwa[]=new char[wa.length];
			int j=rwa.length-1;
			for(int k=0;k<=wa.length-1;k++) {
				rwa[j]=wa[k];
				j--;
			}

			revWord=new String(rwa);
			revString=revString+revWord+" ";
		}
		return revString;
	}
}
