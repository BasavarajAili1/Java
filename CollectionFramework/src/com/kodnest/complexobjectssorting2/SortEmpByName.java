package com.kodnest.complexobjectssorting2;

import java.util.Comparator;

public class SortEmpByName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.empName.compareTo(e2.empName);
	}

}
