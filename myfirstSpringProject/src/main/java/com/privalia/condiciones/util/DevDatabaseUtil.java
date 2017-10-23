package com.privalia.condiciones.util;

import java.util.ArrayList;
import java.util.List;

import com.privalia.condiciones.model.Employee;

public class DevDatabaseUtil implements DataSource{
	
	public List<Employee> getEmployeeDetails(){
		List<Employee> empDetails = new ArrayList<Employee>();
		Employee emp1 = new Employee(111, "Abc", 11000);
		Employee emp2 = new Employee(222, "Cde", 2000);
		empDetails.add(emp1);
		empDetails.add(emp2);
		
		return empDetails;
	}
}
