package com.spring.javaconfig.annotation.bean;
//import java.util.*;
//import java.io.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext con= new AnnotationConfigApplicationContext(Config.class);
		
		StudentClassWithBeanAnnot student = con.getBean("getStudent", StudentClassWithBeanAnnot.class);
		
		System.out.println(student.study());
		
		Department department = con.getBean("getDepartmentDetails", Department.class);
		System.out.println(department);
	}
}
