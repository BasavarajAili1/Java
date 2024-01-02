package org.kodnest.hibernate_demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf = new Configuration();
    	conf.configure();// By default-> configure(hibernate.cfg.xml)
    	SessionFactory factory = conf.buildSessionFactory();
    	System.out.println("Hibernate started working successfully "+factory.toString());
    	
    	Session session = factory.openSession();
    	System.out.println("Session Created Successfully. "+session.toString());
    }
}
