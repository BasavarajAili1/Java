package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Laptop;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Laptop l1 =  (Laptop) context.getBean("l1");
		Laptop l2 =  (Laptop) context.getBean("l2");
		System.out.println("First Object created by Spring---> "+l1);
		System.out.println("Second Object created by Spring---> "+l2);
	}

}
