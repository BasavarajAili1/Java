package com.kodnest.mavenirDrive;
import java.util.Scanner;

public class FindTax {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double income=scan.nextDouble();
		double tax=findTax(income);
		System.out.println((int)tax);

	}
	public static double findTax(double income) {
		double tax;
		if(income<=250000) {
			tax=0;
		}
		else if(income<=500000) {
			tax=(income - 250000) * 0.05;
		}
		else if(income<=1000000) {
			tax=(income - 500000) * 0.2 + 12500;
		}
		else {
			tax=(income - 1000000) * 0.3 + 112500;
		}
		return tax;
	}
}
