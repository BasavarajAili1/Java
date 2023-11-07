package com.kodnest.ExceptionHandlingLevel2;
import java.util.InputMismatchException;
import java.util.Scanner;
class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Calculator Application Started");
		addition();
		subtraction();
		try {
			multi();
		}catch(InputMismatchException E) {
			System.out.println("For multiplication exception handled in main() method, Input Mismatch Exception");
			E.printStackTrace();
		}
		try {
			div();
		}catch(InputMismatchException E) {
			System.out.println("In subtraction -> Exception Handled, Invalid Input");
		}
		catch(ArithmeticException E) {
			System.out.println("In subtraction -> Exception Handled denominator must not be zero");
		}
		
		System.out.println("Calculator Application Ended");
	}
	public static void addition() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Addition is started");
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		int c = a + b;
		System.out.println("Adiition is: "+c);
		System.out.println("Addition completed successfully");
	}
	public static void subtraction() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Subtraction is started");
		try {
			System.out.println("Enter first number");
			int a = scan.nextInt();
			System.out.println("Enter second number");
			int b = scan.nextInt();
			int c = a - b;
			System.out.println("Subtraction is: "+c);
		}catch(ArithmeticException E) {
			System.out.println("In subtraction -> Exception Handled (Denominator can't be zero)");
		}
		catch(InputMismatchException E) {
			System.out.println("In subtraction -> Exception Handled (Enter valid input)");
		}
		finally {
			System.out.println("Subtraction completed successfully");
		}
		

	}
	public static void multi() throws InputMismatchException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Multiplication is started");
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		int c = a * b;
		System.out.println("Multiplication is: "+c);
		System.out.println("Multiplication completed successfully");

	}
	public static void div() throws InputMismatchException, ArithmeticException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Division is started");
		try {
			System.out.println("Enter numenator");
			int a = scan.nextInt();
			System.out.println("Enter denominator");
			int b = scan.nextInt();
			int c = a / b;
			System.out.println("Division is: "+c);
		}
		catch(ArithmeticException E) {
			throw  E;
		}
		catch(InputMismatchException E) {
			throw  E;
		} 
		finally {
			System.out.println("Division completed successfully");
		}
		
	}
}
