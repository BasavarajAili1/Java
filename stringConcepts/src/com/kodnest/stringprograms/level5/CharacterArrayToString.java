package com.kodnest.stringprograms.level5;

import java.util.Scanner;

public class CharacterArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character array: ");
        char[] charArray = scanner.nextLine().toCharArray();

        String createdString = createStringFromArray(charArray);
        System.out.println("Created string: " + createdString);
	}
	private static String createStringFromArray(char[] charArray) {
        StringBuffer stringBuffer = new StringBuffer();
        for (char c : charArray) {
            stringBuffer.append(c).append(" ");
        }
        return stringBuffer.toString();
    }

}
