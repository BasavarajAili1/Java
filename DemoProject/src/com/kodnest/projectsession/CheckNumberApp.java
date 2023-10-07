package com.kodnest.projectsession;
import java.util.Scanner;
public class CheckNumberApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an number");
		int num = scanner.nextInt();
		CheckNumber.check(num);

	}
}
