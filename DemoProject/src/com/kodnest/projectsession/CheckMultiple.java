package com.kodnest.projectsession;
import java.util.Scanner;
public class CheckMultiple {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an number");
		int num = scanner.nextInt();
		CheckMultipleLogic checkMultipleLogic = new CheckMultipleLogic();
		checkMultipleLogic.check3and5(num);
		
		
	}

}
