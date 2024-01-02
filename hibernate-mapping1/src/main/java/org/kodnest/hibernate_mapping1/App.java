package org.kodnest.hibernate_mapping1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
//		Bike b1 = new Bike(111, "KTM", 100000);
//		Bike b2 = new Bike(222, "Yamaha", 150000);
//		Bike b3 = new Bike(333, "Royal Enfield", 200000);
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		Bike b3 = new Bike();
		
		Student s1 = new Student(1, "Rohit", 67, b3);
		Student s2 = new Student(2, "Navin", 40, b1);
		Student s3 = new Student(3, "Mohan", 50, b2);
		
		b1.setRegNumber(111);
		b1.setModel("KTM");
		b1.setPrice(100000);
		b1.setStudent(s2);
		
		b2.setRegNumber(222);
		b2.setModel("Yamaha");
		b2.setPrice(150000);
		b2.setStudent(s3);
		
		b3.setRegNumber(333);
		b3.setModel("Royal Enfield");
		b3.setPrice(200000);
		b3.setStudent(s1);

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
