package com.kodnest.sept3;
import java.util.Scanner;
public class Code2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Split the full name into first name, middle name, and last name
        String[] nameParts = fullName.split(" ");

        String middleName="", firstName="", lastName="";
        if (nameParts.length == 3) {
            middleName = nameParts[1];
            firstName = nameParts[0];
            lastName = nameParts[2];

        } else {
            System.out.println("Please enter a full name with first, middle, and last names.");
        }
        System.out.print(middleName+" : "+firstName+" : "+lastName);

        scanner.close();

	}

}
