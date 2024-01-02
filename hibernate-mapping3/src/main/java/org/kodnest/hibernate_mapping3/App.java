package org.kodnest.hibernate_mapping3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Technology t1 = new Technology();
        Technology t2 = new Technology();
        Technology t3 = new Technology();
        Technology t4 = new Technology();
        
        List<Technology> techList1 = new ArrayList<>();
        techList1.add(t1);
        techList1.add(t3);
        techList1.add(t4);
        
        List<Technology> techList2 = new ArrayList<>();
        techList2.add(t2);
        techList2.add(t3);
        
        List<Technology> techList3 = new ArrayList<>();
        techList3.add(t1);
        techList3.add(t2);
        techList3.add(t3);

        List<Technology> techList4 = new ArrayList<>();
        techList4.add(t3);
        techList4.add(t4);
        
        List<Technology> techList5 = new ArrayList<>();
        techList5.add(t1);        
        techList5.add(t2);        
        techList5.add(t3);
        techList5.add(t4);
        
        Employee e1 = new Employee(01, "Amit", "C", techList1);
        Employee e2 = new Employee(02, "Ankit", "B", techList2);
        Employee e3 = new Employee(03, "Akash", "A", techList3);
        Employee e4 = new Employee(04, "Ankur", "C", techList4);
        Employee e5 = new Employee(05, "Anjali", "A", techList5);

// 		Adding Employees to each Technology
        List<Employee> empList1 = new ArrayList<>();
        empList1.add(e1);
        empList1.add(e3);
        empList1.add(e5);
        List<Employee> empList2 = new ArrayList<>();
        empList2.add(e2);
        empList2.add(e3);
        empList2.add(e5);
        List<Employee> empList3 = new ArrayList<>();
        empList3.add(e1);
        empList3.add(e2);
        empList3.add(e3);
        empList3.add(e4);
        empList3.add(e5);
        List<Employee> empList4 = new ArrayList<>();
        empList4.add(e1);
        empList4.add(e4);
        empList4.add(e5);
        
        // Set Technology details
        t1.setTech_Id(111);
        t1.setTech_Name("Java");
        t1.setEmployee(empList1);
        
        t2.setTech_Id(222);
        t2.setTech_Name("Python");
        t2.setEmployee(empList2);
        
        t3.setTech_Id(333);
        t3.setTech_Name("MySQL");
        t3.setEmployee(empList3);
        
        t4.setTech_Id(444);
        t4.setTech_Name("React");
        t4.setEmployee(empList4);
 

        Configuration conf = new Configuration();
        conf.configure();
        
        SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();
        
        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(e4);
        session.save(e5);
        session.save(t1);
        session.save(t2);
        session.save(t3);
        session.save(t4);
        
        txn.commit();
        
    }
}
