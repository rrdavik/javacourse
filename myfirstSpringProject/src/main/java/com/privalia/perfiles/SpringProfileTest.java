package com.privalia.perfiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringProfileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("prod");
		ctx.scan("com.privalia.perfiles");
		ctx.refresh();
		User user = ctx.getBean(User.class);
		System.out.println("user"+user.toString());
		
		ctx.close();
	}

}
