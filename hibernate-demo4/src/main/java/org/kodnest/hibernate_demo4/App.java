package org.kodnest.hibernate_demo4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Employees e1 = new Employees(100, "Manvit", 50000);
    	Employees e2 = new Employees(101, "Lohit", 25000);
    	Employees e3 = new Employees(103, "Karthik", 50000);
    	
    	Department d1 = new Department(1, "IT");
    	Department d2 = new Department(2, "BD");
    	Department d3 = new Department(3, "Operations");
    	
        Configuration conf = new Configuration();
        conf.configure();
        SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();
        
        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(d1);
        session.save(d2);
        session.save(d3);
        
        txn.commit();
        System.out.println("Completed !");
        
        
    }
}
