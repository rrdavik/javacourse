package com.privalia.condiciones.service;

import java.util.List;

import com.privalia.condiciones.dao.EmployeeDAO;
import com.privalia.condiciones.model.Employee;

public class EmployeeService {
	private EmployeeDAO employeeDAO;
	public EmployeeService(EmployeeDAO employeeDAO){
		this.employeeDAO = employeeDAO;
	}
	
	public List<Employee> getEmployeeDetails(){
		return employeeDAO.getEmployeeDetails();
	}

}
