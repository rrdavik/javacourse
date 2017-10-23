package com.privalia.presentation.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "helloWorld")
public class HelloWorld {
	
	public String hello;
	
	public HelloWorld(){
		
	}


	public HelloWorld(String hello) {
		this.hello = hello;
	}

	@Autowired
	@Value("Hello World from annotsations2!")
	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	

}
