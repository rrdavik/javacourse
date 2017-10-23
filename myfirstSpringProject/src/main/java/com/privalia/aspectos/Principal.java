package com.privalia.aspectos;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring-config.xml");
		Compra cp = (Compra) ctx.getBean("compra");
		
		try{
			System.out.println("invocamos sin problemas");
			cp.compra(false);
			System.out.println("invocamo apra que se produzca unas compra");
			cp.compra(true);
		} catch (Exception e){
			System.out.println("oibtenemos la excepion"+e);
		}
		
		
		ctx.close();
	}
}

