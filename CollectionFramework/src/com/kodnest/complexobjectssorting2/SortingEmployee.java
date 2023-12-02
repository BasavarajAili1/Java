package com.kodnest.complexobjectssorting2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingEmployee{

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Rohit", 25000);
		Employee emp2 = new Employee(103, "Karthik", 55000);
		Employee emp3 = new Employee(100, "Lohit", 40000);

		ArrayList<Employee> empList1 = new ArrayList<Employee>();
		empList1.add(emp1);
		empList1.add(emp2);
		empList1.add(emp3);

		//		System.out.println("------Sorting based on Emp ID------");
		//		System.out.println("Before Sorting-->");
		//		System.out.println(empList1);
		//		System.out.println("After Sorting-->");
		//		SortEmpById sortId = new SortEmpById();
		//		Collections.sort(empList1, sortId);
		//		System.out.println(empList1);
		//		System.out.println();
		//		
		//		System.out.println("------Sorting based on Emp Name------");
		//		System.out.println("Before Sorting-->");
		//		System.out.println(empList1);
		//		System.out.println("After Sorting-->");
		//		SortEmpByName sortName = new SortEmpByName();
		//		Collections.sort(empList1, sortName);
		//		System.out.println(empList1);
		//		System.out.println();
		//		
		//		System.out.println("------Sorting based on Emp Salary------");
		//		System.out.println("Before Sorting-->");
		//		System.out.println(empList1);
		//		System.out.println("After Sorting-->");
		//		SortEmpBySalary sortSalary = new SortEmpBySalary();
		//		Collections.sort(empList1, sortSalary);
		//		System.out.println(empList1);

		//-----------------------------------------------------------------------------------

		System.out.println("------Sorting based on Emp ID------");
		System.out.println("Before Sorting-->");
		System.out.println(empList1);
		System.out.println("After Sorting-->");
		Collections.sort(empList1, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if(e1.empID > e2.empID) {
					return 1;
				}else if(e1.empID < e2.empID) {
					return -1;
				}else {
					return 0;
				}	
			}
		});
		System.out.println(empList1);
		System.out.println();

		System.out.println("------Sorting based on Emp Name------");
		System.out.println("Before Sorting-->");
		System.out.println(empList1);
		System.out.println("After Sorting-->");
		Collections.sort(empList1, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.empName.compareTo(e2.empName);
			}
		});
		System.out.println(empList1);
		System.out.println();

		System.out.println("------Sorting based on Emp Salary------");
		System.out.println("Before Sorting-->");
		System.out.println(empList1);
		System.out.println("After Sorting-->");
		Collections.sort(empList1, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.salary > e2.salary) {
					return 1;
				}else if(e1.salary < e2.salary) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		System.out.println(empList1);
	}
}
