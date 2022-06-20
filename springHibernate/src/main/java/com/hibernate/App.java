package com.hibernate;

//import javax.transaction.HeuristicMixedException;
//import javax.transaction.HeuristicRollbackException;
//import javax.transaction.RollbackException;
//import javax.transaction.SystemException;
//import javax.transaction.Transaction;

import org.hibernate.Transaction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        
        Configuration config = new Configuration();
        
        config.configure("hibernateConfig.xml"); /*path of xml file from root folder*/ 
        
        SessionFactory factory= config.buildSessionFactory();
        
//        System.out.println(factory.isClosed());
        
//        Student student = new Student();
//        
//        student.setId(202);
//        student.setCity("Jaipur");
//        student.setName("Shashank");
//        
//        System.out.println(student);
        
        Address address = new Address();
        
//        address.setAddressID(not set because auto);
        address.setCity("Delhi");
        address.setStreet("Street1");
        address.setOpen(true);
        address.setX(10);
        address.setAddedDate(new java.util.Date());
        
        FileInputStream fis = new FileInputStream("src/main/java/2020-02-14.png");
        byte [] data =  new byte[fis.available()];
        fis.read(data);
        address.setImage(data);
        
        Session session = factory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        //instead of save you can use persist method
//        session.save(student);
//        session.save(address);
        
        transaction.commit();
        
        session.close();
        
        
        
    }
}
