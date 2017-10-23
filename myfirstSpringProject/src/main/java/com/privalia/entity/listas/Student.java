package com.privalia.entity.listas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("Student")
@PropertySource("classpath:config.properties")
public class Student {
	@Autowired
	@Value("$student.idStudent")
	private int idStudent;
	@Autowired
	@Value("$student.name")
	private String name;
	@Autowired
	@Value("$student.surname")
	private String surname;
	@Autowired
	@Value("$student.age")
	private int age;
	
	private List<Teacher> teachers;
	
	public Student(){
		
	}
	
@Autowired
	public Student(int idStudent,  String name,  String surname,  int age) {
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	
	
	
	
	
	
}
