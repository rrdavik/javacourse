package com.privalia.presentation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		HelloWorld helloworld = 
				(HelloWorld)context.getBean("helloWorld");

		
		System.out.println(helloworld.getHello());
		
		HelloWorld helloWorldConstructor =
				(HelloWorld) context.getBean("helloWorldConstructor");
		
		System.out.println(helloWorldConstructor.getHello());
		
		context.close();
	}

}
