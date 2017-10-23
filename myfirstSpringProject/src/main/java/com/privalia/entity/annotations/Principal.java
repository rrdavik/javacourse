package com.privalia.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annotationContext = 
				new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.privalia.entity.annotation");
		annotationContext.refresh();
		
		Student student = annotationContext.getBean(Student.class);
		System.out.println(student.getIdStudent() + student.getName() + student.getSurname() + student.getAge()
		+ student.getAddress().toString());
		annotationContext.close();
	}

}
