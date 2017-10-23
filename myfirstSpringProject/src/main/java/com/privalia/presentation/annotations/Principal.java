package com.privalia.presentation.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Principal {

	// Forma programativa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext appContext =
				new AnnotationConfigApplicationContext(
						SpringConfiguration.class);
		
		HelloWorld helloWorld = 
				(HelloWorld)appContext.getBean("helloWorld");
		
		System.out.println(helloWorld.getHello());
		
		appContext.close();
		
	}

}
