package com.privalia.entity.listas;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.privalia.entity.listas.Student;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		Student student = 
				(Student)context.getBean("StudentWithTeacher");
		
		System.out.println(student.getIdStudent() + student.getName() + student.getSurname() + student.getAge()
		+ student.getTeachers().toString());
		

	}

}
