package com.privalia.condiciones.condicion;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DevDataSourceCondition implements Condition{
	
	public boolean matches(ConditionContext ctx, AnnotatedTypeMetadata meta){
		String dbname= ctx.getEnvironment().getProperty("database.name");
		return dbname.equalsIgnoreCase("dev");
	}

}
