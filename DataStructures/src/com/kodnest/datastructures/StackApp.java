package com.kodnest.datastructures;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter stack length");
		int n = scan.nextInt();
		Stack stack = new Stack(n);
		
		while(true) {
			System.out.println("Press 1 ------> PUSH");
			System.out.println("Press 2 ------> POP");
			System.out.println("Press 3 ------> DISPLAY");
			System.out.println("Any other key ------> STOP");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				stack.push();
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				stack.display();
				break;
			default:
				System.exit(0);
			}
		}
		
	}

}
