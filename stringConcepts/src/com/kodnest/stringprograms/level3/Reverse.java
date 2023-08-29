package com.kodnest.stringprograms.level3;

public class Reverse {
	String reverse(String s1){
		char arr[]=s1.toCharArray();
		char revArr[]= new char[arr.length];

		//Search for spaces(' ') and copy them to rev[]
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==' ') {
				revArr[i]=arr[i];
			}
		}

		//rev the arr
		int j=revArr.length-1;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=' ') {
				if (revArr[j]==' ') {
					j--;
				}
				revArr[j]=arr[i];
				j--;
			}
		}
		s1=new String(revArr);
		return s1;
	}
}
