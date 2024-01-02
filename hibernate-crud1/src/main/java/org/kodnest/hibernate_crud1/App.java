package org.kodnest.hibernate_crud1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//      create();
//    	read();
//    	update();
    	delete();
        
    }

	public static void create() {
		Laptop laptop = new Laptop(100, "Dell", 40000);
		Configuration conf = new Configuration().configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(laptop);
		
		txn.commit();
		System.out.println("Laptop details created - "+laptop);
	}
	
	public static void read() {
		Configuration conf = new Configuration().configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Laptop laptop = session.get(Laptop.class, 100);
		
		txn.commit();
		System.out.println("Laptop fetched from database - "+laptop);
	}
	
	public static void update() {
		Configuration conf = new Configuration().configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Laptop laptop = session.get(Laptop.class, 100);
		System.out.println("Before updating -->"+laptop);
		laptop.setBrandName("HP");
		laptop.setPrice(65000);
		session.save(laptop);
		
		txn.commit();
		System.out.println("Laptop details updated - "+laptop);
	}
	
	public static void delete() {
		Configuration conf = new Configuration().configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		Laptop laptop = session.get(Laptop.class, 100);
		
		session.delete(laptop);
		
		session.save(laptop);
		txn.commit();
		System.out.println("Laptop deleted - "+laptop);
	}
}
