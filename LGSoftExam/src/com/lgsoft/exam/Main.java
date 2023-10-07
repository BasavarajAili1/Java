package com.lgsoft.exam;

public class Main {
	Main(){
		System.out.println("Block3");
	}
	{
		System.out.println("Block1");
	}
	static {
		System.out.println("Block2");
	}
	public static void main(String[] args) {
		new Main();
	}
}
