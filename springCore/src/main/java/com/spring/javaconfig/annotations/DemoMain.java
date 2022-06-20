package com.spring.javaconfig.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/spring/javaconfig/annotations/config.xml");
		
		Student student = context.getBean("student", Student.class);
		
		System.out.println(student);
	}

}
