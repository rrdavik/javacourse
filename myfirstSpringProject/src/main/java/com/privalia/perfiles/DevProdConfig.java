package com.privalia.perfiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class DevProdConfig {

	@Bean
	public User user(){
		return new User(111,"Prod user");
	}
}
