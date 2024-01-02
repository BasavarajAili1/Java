package org.kodnest.hibernate_demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Student s1 = new Student(1, "Abhishek", 95);
    	Student s2 = new Student(1, "Karthik", 45);
    	
    	//1. Configure the hibernate.cfg.xml file
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	
    	//2. Build SessionFactory using configuration
    	SessionFactory factory =  cfg.buildSessionFactory();
    	
    	//3. Open Session using SessionFactory
    	Session session =  factory.openSession();
    	
    	//4. Begin Transaction using session
    	Transaction txn =  session.beginTransaction();
    	
//    	session.save(s1);
    	session.save(s2);
    	
    	//5. Commit the Transaction
    	txn.commit();
    	System.out.println("-----> " + s1 + " has been stored in Database !");
    }
}
 