package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.entities.Person;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Application-context.xml");
		Person p1 = (Person) context.getBean("person");
		System.out.println(p1);
	}

}
