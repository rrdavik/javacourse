package com.privalia.condiciones.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.privalia.condiciones.condicion.DevDataSourceCondition;
import com.privalia.condiciones.condicion.ProdDataSourceCondition;
import com.privalia.condiciones.util.DataSource;
import com.privalia.condiciones.util.DevDatabaseUtil;
import com.privalia.condiciones.util.ProductionDatabaseUtil;

@Configuration
public class EmployeeDatasourceConfig {
	
	@Bean(name="dataSource")
		@Conditional (value=DevDataSourceCondition.class)
		public DataSource getDevDataSource(){
			return new DevDatabaseUtil();
	
	}
	
	@Bean(name="dataSource")
	@Conditional (value=ProdDataSourceCondition.class)
	public DataSource getProdDataSource(){
		return new ProductionDatabaseUtil();

}

}
