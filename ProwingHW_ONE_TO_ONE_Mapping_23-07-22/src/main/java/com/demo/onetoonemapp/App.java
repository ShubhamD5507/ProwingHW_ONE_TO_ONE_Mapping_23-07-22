package com.demo.onetoonemapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
 System.out.println( "Hello World!" );
        
        
        Laptop l1 = new Laptop();
       // l1.setLid(101);
        l1.setLname("Sony");
        l1.setPrice(11000);
        
        Laptop l2 = new Laptop();
        //l1.setLid(102);
        l2.setLname("Acer");
        l2.setPrice(12000);
        
        Laptop l3 = new Laptop();
        l3.setLname("Dell");
        l3.setPrice(12000);
        
        Student std1 = new Student();
        std1.setName("Shubham");
        std1.setLaptop(l1);
        
        Student std2 = new Student();
        std2.setName("Omkar");
        std2.setLaptop(l2);
        
        Student std3 = new Student();
        std3.setName("Vaibhav");
        std3.setLaptop(l3);
        
        Configuration con = new Configuration().configure(); //.addAnnotatedClass(Laptop.class)
        SessionFactory sf = con.buildSessionFactory();
        
        
        Session session1 =  sf.openSession();
        
        Transaction tx = session1.beginTransaction(); 
        
        session1.save(std1);
        session1.save(std2);
        session1.save(std3);
       
        tx.commit();
        session1.close();
       // System.out.println(ltop);
        sf.close();
        System.out.println("Done");
    }																																			
}
