package com.kodnest.practice;
import java.util.Scanner;

public class EmployeeManager{
	Scanner scan = new Scanner(System.in);
	private Employee[] e;
	private int size = 0;
	private int capacity;


	public EmployeeManager(int capacity) {
		super();
		this.capacity = capacity;
		e = new Employee[capacity];
		size = 0;

	}

	public void addEmployee(String name, int sal) {
		if(size < this.capacity) {
			e[size] = new Employee(name, sal);
			System.out.println("Employee ID for the given employee: "+e[size].getID());
			size++;
		}
		else {
			System.out.println("No vacancy in the company.");
		}
	}
	public void displayEmployee(int eid) {
		//System.out.println(size);
		for(int i=0;i<size;i++)
		{
			if( eid == e[i].getID())
			{
				System.out.println("Employee Details");
				System.out.println("Employee ID: "+e[i].getID());
				System.out.println("Employee Name: "+e[i].getName());
				System.out.println("Employee Salary: "+e[i].getSalary());
				System.out.println();
			}
		}

	}
	public void allEmployee() {
		for(int i=0;i<size;i++)
		{
			System.out.println("Employee Details");
			System.out.println("Employee ID: "+e[i].getID());
			System.out.println("Employee Name: "+e[i].getName());
			System.out.println("Employee Salary: "+e[i].getSalary());
			System.out.println("===================");
		}
	}


}
