package org.kodnest.hibernate_mapping3;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Technology {

	@Id
	int tech_Id;
	String tech_Name;
	
	@ManyToMany
	List<Employee> employee;

	public Technology() {
		super();
	}

	public Technology(int tech_Id, String tech_Name, List<Employee> employee) {
		super();
		this.tech_Id = tech_Id;
		this.tech_Name = tech_Name;
		this.employee = employee;
	}

	public int getTech_Id() {
		return tech_Id;
	}

	public void setTech_Id(int tech_Id) {
		this.tech_Id = tech_Id;
	}

	public String getTech_Name() {
		return tech_Name;
	}

	public void setTech_Name(String tech_Name) {
		this.tech_Name = tech_Name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Technology [tech_Id=" + tech_Id + ", tech_Name=" + tech_Name + ", employee=" + employee + "]";
	}
	
	
}
