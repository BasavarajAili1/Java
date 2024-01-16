package com.kodnest.datastructures;

import java.util.Scanner;

public class Stack {
	private int[] s;
	private int size;
	private int top = -1;
	private Scanner scan = new Scanner(System.in);
	
	public Stack(int n) {
		s = new int[n];
		size = s.length;
	}
	
	
	public void push() {
		if(top == size - 1) {
			System.out.println("PUSH not possible");
		}
		else {
			System.out.println("Enter your element:");
			top++;
			int elem = scan.nextInt();
			s[top] = elem;
		}
	}
	
	public void pop() {
		if(top == -1) {
			System.out.println("POP not possible");
		}
		else {
			System.out.println("Element deleted is: "+s[top]);
			--top;
		}
	}
	
	public void display() {
		if(top == -1) {			
			System.out.println("Display not possible");
		}
		else {
			for(int i=top; i>=0 ;i--) {
				System.out.println(s[i]);
			}
		}
	}
}
