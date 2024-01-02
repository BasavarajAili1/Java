package org.kodnest.hibernate_demo3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Student s1 = new Student(1, "Martin", 45);
    	Student s2 = new Student(2, "Lohit", 69);
    	Student s3 = new Student(3, "Navin", 80);
    	
    	Bike b1 = new Bike(3305,"BMW",400000);
    	Bike b2 = new Bike(8888, "KTM", 250000);
    	Bike b3 = new Bike(5692, "Royal Enfield",210000);
    	
        Configuration conf = new Configuration();
        conf.configure();
        
        SessionFactory factory = conf.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Transaction txn = session.beginTransaction();
        
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(b1);
        session.save(b2);
        session.save(b3);
        
        txn.commit();
        System.out.println("Completed !");
    }
}
