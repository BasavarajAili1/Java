package com.kodnest.practice;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		EmployeeManager em = new EmployeeManager(5);
		boolean b = true;
		while(b) {
			System.out.println("Enter the input: ");
			int in = scan.nextInt();
			if(in == 1) {
				System.out.println("Enter the employee name");
				String name = scan.next();
				System.out.println("Enter the employee salary");
				int sal = scan.nextInt();
				em.addEmployee(name, sal);
			}
			else if(in == 2) {
				System.out.println("Enter the Employee ID: ");
				int eid = scan.nextInt();
				em.displayEmployee(eid);
			}
			else if(in == 3) {
				em.allEmployee();
			}
			else {
				System.out.println("Invalid Input.");
				b = false;
			}
		}
	}

}
