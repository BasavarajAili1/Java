package com.kodnest.complexobjectssorting2;

import java.util.Comparator;

public class SortEmpById implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.empID > e2.empID) {
			return 1;
		}else if(e1.empID < e2.empID) {
			return -1;
		}else {
			return 0;
		}	
	}
	
	
}
