package com.kodnest.ExceptionHandlingLevel2;
import java.util.Scanner;
public class DrivingLicenseApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Driving License Application");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		try {
			checkEligibility(age);
		}
		catch (UnderAgeException uae){
			uae.printStackTrace();
		}
		catch (OverAgeException oae) {
			oae.printStackTrace();
		}
		finally {
			System.out.println("Driving license application ended");
		}

	}
	public static void checkEligibility(int age) throws UnderAgeException, OverAgeException{
		System.out.println("Cheking you eligibility...");
		if(age > 18 && age < 65) {
			System.out.println("Congrats! You are eligible");
			System.out.println("Application submited.");
		}
		else {
			if (age < 18) {
				throw new UnderAgeException("You are too young. Kindly Wait for some time.");
			}
			else {
				throw new OverAgeException("You are too old. Can't issue the license.");
			}
		}
	}
}

