package com.privalia.condiciones.dao;

import java.util.List;

import com.privalia.condiciones.model.Employee;
import com.privalia.condiciones.util.DataSource;

public class EmployeeDAO {
	private DataSource datasource;
	public EmployeeDAO (DataSource datasource){
		this.datasource = datasource;
	}
	
	public List<Employee> getEmployeeDetails(){
		return datasource.getEmployeeDetails();
	}

}
