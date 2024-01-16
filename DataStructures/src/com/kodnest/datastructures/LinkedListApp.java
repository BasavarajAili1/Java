package com.kodnest.datastructures;

import java.util.Scanner;

public class LinkedListApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		while(true) {
			System.out.println("Press 1 -----> INSERT REAR");
			System.out.println("Press 2 -----> DELETE REAR");
			System.out.println("Press 3-----> INSERT FRONT");
			System.out.println("Press 4 -----> DELETE FRONT");
			System.out.println("Press 5 -----> DISPLAY");
			System.out.println("Any other number -----> STOP");
			System.out.println("Enter your choice: ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				ll.insertrear();
				break;
			case 2:
				ll.deleterear();
				break;
			case 3:
				ll.insertfront();
				break;
			case 4:
				ll.deletefront();
				break;
			case 5:
				ll.display();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
