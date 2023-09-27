package com.kodnest.weeklyTest;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee em = new Employee();
		
		em.setId(scan.nextInt());
		em.setName(scan.next());
		em.setSalary(scan.nextDouble());
		em.setTeamName();
		System.out.println("Employee Information: ");
		System.out.println("ID: "+em.getId());
		System.out.println("Name: "+em.getName());
		System.out.println("Salary: "+em.getSalary());
		System.out.println("Team Name: "+em.getTeamName());

	}

}
