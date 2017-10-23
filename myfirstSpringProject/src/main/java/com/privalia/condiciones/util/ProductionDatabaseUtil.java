package com.privalia.condiciones.util;

import java.util.ArrayList;
import java.util.List;

import com.privalia.condiciones.model.Employee;

public class ProductionDatabaseUtil implements DataSource{
	
	public List<Employee> getEmployeeDetails(){
		List<Employee> empDetails = new ArrayList<Employee>();
		Employee emp1 = new Employee(9001, "ramu", 45000);
		Employee emp2 = new Employee(9002, "Charan", 35000);
		Employee emp3 = new Employee(9003, "Joe", 55000);
		empDetails.add(emp1);
		empDetails.add(emp2);
		empDetails.add(emp3);
		
		return empDetails;
	}
}
