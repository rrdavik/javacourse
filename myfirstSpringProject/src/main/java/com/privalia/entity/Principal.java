package com.privalia.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		Student student = 
				(Student)context.getBean("student");

		
//		StringBuilder stringbuilder = new StringBuilder();
//		stringbuilder.append(student.getIdStudent());
//		stringbuilder.append(" ");
//		...
		
		System.out.println(student.getIdStudent() + student.getName() + student.getSurname() + student.getAge()
		+ student.getAddress().toString());
		
		Student studentConstructor = 
				(Student)context.getBean("studentConstructor");
		
		System.out.println(studentConstructor.getIdStudent() + studentConstructor.getName() + studentConstructor.getSurname() + studentConstructor.getAge()
		+ studentConstructor.getAddress().toString());

		context.close();
	}

}
