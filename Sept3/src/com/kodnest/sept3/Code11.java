package com.kodnest.sept3;
import java.util.Scanner;
public class Code11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to insert: ");
        char characterToInsert = scanner.next().charAt(0);

        if (inputString.length() <= 2) {
            System.out.println("Please enter a longer string.");
        } else {
            String outputString = inputString.substring(0, 3) + characterToInsert + inputString.substring(3);
            System.out.println("Output: " + outputString);
        }

        scanner.close();

	}

}
