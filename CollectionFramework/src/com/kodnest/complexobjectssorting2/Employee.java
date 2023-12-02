package com.kodnest.complexobjectssorting2;

public class Employee{
	int empID;
	String empName;
	double salary;
	public Employee(int empID, String empName, double salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee[ID = "+empID+",Name = "+empName+",Salary = "+salary+"]";
	}

}
