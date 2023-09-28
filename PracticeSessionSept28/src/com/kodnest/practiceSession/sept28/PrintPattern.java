package com.kodnest.practiceSession.sept28;

public class PrintPattern {

	public static void main(String[] args) {
		String s = "SAMSUNG ELECTRONICS";
		
		String str = s.replaceAll(" ", "");
		System.out.println(str);
		
		for(int i=0; i<3 ;i++) {
			for(int j=i; j<str.length(); j=j+3) {
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
	}

}
