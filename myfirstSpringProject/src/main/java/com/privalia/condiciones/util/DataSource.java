package com.privalia.condiciones.util;

import java.util.List;

import com.privalia.condiciones.model.Employee;

public interface DataSource {
	List <Employee> getEmployeeDetails();
}
