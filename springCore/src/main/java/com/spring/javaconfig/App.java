package com.spring.javaconfig;
//import java.util.*;
//import java.io.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext con= new AnnotationConfigApplicationContext(Config.class);
		
		StudentClass student = con.getBean("studentClass", StudentClass.class);
		
		System.out.println(student.study());

	}
		
	
}
