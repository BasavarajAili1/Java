package com.kodnest.MethodWithOperators;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is input valid (true/false): ");
		boolean first_condition=scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false): ");
		boolean second_condition=scan.nextBoolean();
		boolean output= isValidInput(first_condition, second_condition);
		if(output==true) {
			System.out.println("Input is valid.");
		}
		else {
			System.out.println("Input is not valid.");
		}

	}
	public static boolean isValidInput(boolean first_condition, boolean second_condition) {
		return first_condition && second_condition;
	}
}
