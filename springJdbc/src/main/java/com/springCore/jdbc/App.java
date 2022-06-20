package com.springCore.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springCore.jdbc.dao.StudentDao;
import com.springCore.jdbc.dao.StudentDaoImplementation;
import com.springCore.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/jdbc/config.xml");
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        //******Catch****** here is we make reference variable of the interface and object of the implementing class
        StudentDao studentObject = context.getBean("studentDaoImplementation", StudentDao.class);        
        
//        /****************************INSERT******************************/
//        Student student = new Student(4, "Shyam", "Udaipur");
//        int res = studentObject.insert(student);
//        System.out.println("Rows updated:"+res);
        
//      /****************************UPDATE******************************/
//      Student student = new Student(3, "Raghav", "Hamirpur");
//      int res = studentObject.update(student);
//      System.out.println("Rows updated:"+res);
        
//      /****************************DELETE******************************/
//        int res = studentObject.delete(3);
//        System.out.println("Rows updated:"+res);
        
//        Student student = studentObject.getStudent(2);
//        System.out.println(student);
        List<Student> resuList = studentObject.getAllStudent();
        System.out.println(resuList);
        
    }
}
