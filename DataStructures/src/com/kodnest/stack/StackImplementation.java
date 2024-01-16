package com.kodnest.stack;

import java.util.Scanner;

public class StackImplementation {
	static Scanner scan = new Scanner(System.in);
	static int[] stack = new int[5];
	static int top = -1;
	static int size = stack.length;

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			push();
		}

		// printing stack after filling all position
		System.out.print("Stack after filling all the positions ---> ");
		for(int x: stack) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		// Make top = 4
		top = stack.length-1;
		for(int i=0;i<=6;i++) {
			pop();
		}
		System.out.print("Stack after emptying all the positions ---> ");
		for(int x: stack) {
			System.out.print(x+" ");
		}
		System.out.println();
	}

	public static void push() {
		// PUSH OPERATION
		++top;
		if(top == size) {
			System.out.println("Push not possible");
		}else {				
			System.out.println("Enter your element to push->");
			int element = scan.nextInt();
			stack[top] = element;
		}
	}
	
	public static void pop() {
		// POP OPERATION
		if(top == -1) {
			System.out.println("Pop not possible");
		}
		else {
			System.out.println("Element deleted is: "+stack[top]);
			stack[top] = 0;
			top--;
		}
	}

}
