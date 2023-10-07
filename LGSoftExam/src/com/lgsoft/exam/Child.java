package com.lgsoft.exam;

public class Child extends Parent {
		Child(){
			System.out.println("Child");
		}
		int sub(int a, int b) {
			return a-b;
		}
}
