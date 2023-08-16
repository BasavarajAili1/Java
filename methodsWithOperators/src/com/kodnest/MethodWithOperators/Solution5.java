package com.kodnest.MethodWithOperators;
import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double first_num=scan.nextInt();
		System.out.println("Enter the second number: ");
		double second_num=scan.nextInt();
		System.out.println("Enter the operator(+, -, *, /): ");
		char operator=scan.next().charAt(0);
		double result=calculator(first_num, second_num, operator);
		System.out.println("Result: "+result);
	}
	public static double calculator(double first_num, double second_num, char operator) {
		switch (operator) {
		case '+':return calculate(first_num, second_num, "add") ;

		case '-':return calculate(first_num, second_num, "sub") ;

		case '*':return calculate(first_num, second_num, "mul") ;

		case '/':return calculate(first_num, second_num, "div");

		}
	    return 0;

	}

	static double calculate(double first_num, double second_num, String operator) {
		switch (operator) {
		case "add": return first_num+second_num;
		
		case "sub": return first_num-second_num;
		
		case "mul": return first_num*second_num;
		
		case "div": return first_num/second_num;
		
		default: return 0;
		}
	}
}
