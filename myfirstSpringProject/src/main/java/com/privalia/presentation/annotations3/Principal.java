package com.privalia.presentation.annotations3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annotationContext = 
				new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.privalia.presentation.annotations3");
		annotationContext.refresh();
		
		HelloWorld helloWorld = 
				annotationContext.getBean(HelloWorld.class);
		// Cojera el constructor que tenga el autowire
		
		System.out.println(helloWorld.getHello());
		
		
		annotationContext.close();
		
	}

}
