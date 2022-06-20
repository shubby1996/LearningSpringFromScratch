package com.spring.javaconfig.annotation.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public StudentClassWithBeanAnnot getStudent() {
		return new StudentClassWithBeanAnnot();
	}	
	
	@Bean
	public Department getDepartmentDetails() {
		return new Department();
	}
	
	
	
}
