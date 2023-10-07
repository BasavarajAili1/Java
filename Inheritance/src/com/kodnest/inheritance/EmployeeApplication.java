package com.kodnest.inheritance;

public class EmployeeApplication {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name = "Sharath";
		employee.sallary = 25000;
		System.out.println(employee.name+" --> "+employee.sallary);
		employee.work();
		System.out.println();
		
		Manager manager = new Manager();
		manager.name = "Akhil";
		manager.sallary = 100000;
		System.out.println(manager.name+" --> "+manager.sallary);
		manager.work();
		System.out.println();
		
		Developer developer = new Developer();
		developer.name = "Mark";
		developer.sallary = 50000;
		System.out.println(developer.name+" --> "+developer.sallary);
		developer.work();
		System.out.println();
		
		Tester tester = new Tester();
		tester.name = "Lohit";
		tester.sallary = 30000;
		System.out.println(tester.name+" --> "+tester.sallary);
		tester.work();
		System.out.println();
		
		TeamLead teamLead = new TeamLead();
		teamLead.name = "Khan";
		teamLead.sallary = 70000;
		System.out.println(teamLead.name+" --> "+teamLead.sallary);
		teamLead.work();
	}
}
