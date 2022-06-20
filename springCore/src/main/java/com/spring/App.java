package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/config.xml");
        
        Student student = con.getBean("student", Student.class);
        
        System.out.println(student);
    }
}
