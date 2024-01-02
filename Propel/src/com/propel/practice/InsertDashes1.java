package com.propel.practice;


public class InsertDashes1 {

	public static void main(String[] args) {
		String input1 = "454793";
		String input2 = "99946";
		String input3 = "56730";
		String token = "2in493zkeb";
		
		String out1 = insertDashes(input1, token);
		System.out.println(out1);
		String out2 = insertDashes(input2, token);
		System.out.println(out2);
		String out3 = insertDashes(input3, token);
		System.out.println(out3);
	}
	
	public static String insertDashes(String str, String token) {
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		
		for(int i=0;i<str.length()-1;i++) {
			int v1 = Integer.parseInt(""+str.charAt(i));
			int v2 = Integer.parseInt(""+str.charAt(i+1));
			
			if(v1!=0 && v2!=0 && v1%2!=0 && v2%2!=0) {
				sb.append("-");
			}
			sb.append(str.charAt(i+1));
		}
		
		String firstOutput = sb.toString();
		System.out.println("---->"+firstOutput);
		
		StringBuilder finalString = new StringBuilder();
		
		char[] outArr = firstOutput.toCharArray();
		char[] tokenArr = token.toCharArray();
		
		for(int i=0;i<outArr.length;i++) {
			char currChar = outArr[i];
			boolean present = false;
			
			for(int j=0;j<tokenArr.length;j++) {
				if(currChar == tokenArr[j]) {
					present = true;
					break;
				}
			}
			
			if(!present) {
				finalString.append(currChar);
			}
		}
		
		
		
		return finalString.toString();
	}

}

