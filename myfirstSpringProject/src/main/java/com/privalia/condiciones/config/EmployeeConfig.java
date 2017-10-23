package com.privalia.condiciones.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.privalia.condiciones.dao.EmployeeDAO;
import com.privalia.condiciones.service.EmployeeService;
import com.privalia.condiciones.util.DataSource;

@Configuration
public class EmployeeConfig {
	@Autowired
	private DataSource dataSource;
	
	@Bean 
	public EmployeeService employeeService() {
		return new EmployeeService(employeeDAO());
	}
	
	@Bean
	public EmployeeDAO employeeDAO(){
		System.out.println("EmployeeDAO employeeDAO()");
		return new EmployeeDAO(dataSource);
	}

}
