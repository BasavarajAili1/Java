package com.kodnest.datastructures;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Queue size-->");
		int n = scan.nextInt();
		
		Queue queue = new Queue(n);
		while(true) {
			System.out.println("Press 1 -----> INSERT");
			System.out.println("Press 2 -----> DELETE");
			System.out.println("Press 3 -----> DISPLAY");
			System.out.println("Any other number -----> STOP");
			System.out.println("Enter your choice: ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				queue.insert();
				break;
			case 2:
				queue.delete();
				break;
			case 3:
				queue.display();
				break;
			default:
				System.exit(0);
			}
		}
		
	}

}
