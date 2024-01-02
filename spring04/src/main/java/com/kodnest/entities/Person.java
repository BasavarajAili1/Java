package com.kodnest.entities;

public class Person {

	Mobile mobile;

	public Person(Mobile mobile) {
		super();
		this.mobile = mobile;
	}

	public Person() {
		super();
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [mobile=" + mobile + "]";
	}
	
	
	
}
