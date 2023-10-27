package com.kodnest.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Connection established.");
		int[] arr = null;
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 2 numbers for division");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a / b;
			System.out.println("Division result is "+c);
			System.out.println("Enter array length: ");
			arr = new int[scan.nextInt()];
			System.out.println("Enter element to insert into array");
			int element = scan.nextInt();
			System.out.println("Enter position that where to insert an element");
			int pos = scan.nextInt();
			arr[pos] = element;
			System.out.println("Element "+element+" is inserted into position "+pos);
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmatic exception..How can any number divide by 0?");
		}
		catch (InputMismatchException e) {
			System.out.println("Input mismatch exception..Please try again");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException You only eneterd the length. So, please enter position between 0 to "+arr.length);
		}
		catch (NegativeArraySizeException e) {
			System.out.println("You entered negative array size. How can I create the array with negative size? Can you create?");
		}
		catch (Exception e) {
			System.out.println("Some problem has occured, Please try again");
		}
		System.out.println("Connection terminated bye bye..");
	}
}
