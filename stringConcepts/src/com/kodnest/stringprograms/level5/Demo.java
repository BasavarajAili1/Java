package com.kodnest.stringprograms.level5;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String inputSentence = scanner.nextLine();

		String formattedSentence = formatTitleCase(inputSentence);
		System.out.println("Formatted Sentence: " + formattedSentence);

	}
	private static String formatTitleCase(String sentence) {
        StringBuilder formattedSentence = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : sentence.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (capitalizeNext) {
                    formattedSentence.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    formattedSentence.append(Character.toLowerCase(c));
                }
            } else {
                formattedSentence.append(c);
                if (c == ' '|| c == ',' || c == '?' || c == '-') {
                    capitalizeNext = true;
                }
            }
        }

        return formattedSentence.toString();
    }

}
