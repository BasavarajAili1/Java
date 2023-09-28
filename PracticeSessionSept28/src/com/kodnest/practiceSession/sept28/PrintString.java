package com.kodnest.practiceSession.sept28;

public class PrintString {

	public static void main(String[] args) {
		String str = "Hello World!";
		char ch = 'l';
		int count = 0;
		for(int i=0; i<str.length() ;i++) {
			if(ch == str.charAt(i)) {
				count++;
				for(int j=i+1; j<str.length(); j++) {
					System.out.print(str.charAt(j));
//					break;
				}
				System.out.println();
			}
		}
		
		if(count == 0) {
			System.out.println(str);
		}
//		String ans = findSubString(str, ch);
//		if(ans.length() == 0) {
//			System.out.println(str);
//		}
//		else {
//			System.out.println(ans);
//		}
	}
	
//	static String findSubString(String str, char ch) {
//		String ans="";
//		for(int i=0;i<=str.length()-1;i++) {
//			if(str.charAt(i) == ch) {
//				ans = str.substring(i+1);
//				break;
//			}
//		}
//		return ans;
//	}

}
