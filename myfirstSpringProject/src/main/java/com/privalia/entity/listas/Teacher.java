package com.privalia.entity.listas;

import org.springframework.stereotype.Component;

@Component("address")
public class Teacher {
   private int idTeacher;
   private String name;
   
   public Teacher(){
	   
   }

public int getIdTeacher() {
	return idTeacher;
}

public void setIdTeacher(int idTeacher) {
	this.idTeacher = idTeacher;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
   
   
   
}
