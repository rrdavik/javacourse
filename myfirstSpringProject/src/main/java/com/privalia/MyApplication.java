package com.privalia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyApplication {
	private static Logger logger = LoggerFactory.getLogger(MyApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}
}
