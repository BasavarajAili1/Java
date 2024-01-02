package com.propel.practice;

import java.util.ArrayList;
import java.util.List;

public class CommandLineLengths1 {

	public static void main(String[] args) {
		String input1 = "SampleNumber=3234 provider=Dr. M. Welby patient=John Smith priority=High";
        String input2 = "letters=A B Z T numbers=1 2 26 20 combine=true";
        String output1 = CommandLine(input1);
        String output2 = CommandLine(input2);
        
        
        System.out.println(output1);
        System.out.println(output2);
	}

	public static String CommandLine(String str) {
		String[] splittedArray = str.split("=");
		List<Integer> argsArray = new ArrayList<>();
		StringBuilder finalString = new StringBuilder();
		
		for(int i=0;i<splittedArray.length;i++) {
			if(i == 0 || i == splittedArray.length-1) {
				argsArray.add(splittedArray[i].length());
			}else {
				int lastIndexSpace = splittedArray[i].lastIndexOf(" ");
				argsArray.add(splittedArray[i].substring(0, lastIndexSpace).length());
				argsArray.add(splittedArray[i].substring(lastIndexSpace+1).length());
			}
		}
		
		for(int i=0;i<argsArray.size();i++){
			if(i % 2 != 0) {
				finalString.append("=");
			}
			
			finalString.append(argsArray.get(i));
			
			if(i % 2 != 0) {
				finalString.append(" ");
			}
		}		
		return finalString.toString().trim();
	}

}
