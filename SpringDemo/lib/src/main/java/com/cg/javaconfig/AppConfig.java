package com.cg.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cg.javaconfig")
public class AppConfig {
	
	@Bean
	public Employee employee() {
		return new Employee();
	}
	
	@Bean
	public Address address() {
		return new Address();
	}

}