package org.kodnest.hibernate_mapping3;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	int empId;
	String empName;
	String empteam;
	
	@ManyToMany
	List<Technology> technology;

	public Employee(int empId, String empName, String empteam, List<Technology> technology) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empteam = empteam;
		this.technology = technology;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpteam() {
		return empteam;
	}

	public void setEmpteam(String empteam) {
		this.empteam = empteam;
	}

	public List<Technology> getTechnology() {
		return technology;
	}

	public void setTechnology(List<Technology> technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empteam=" + empteam + ", technology="
				+ technology + "]";
	}

	
	
	
}
