package com.kodnest.inheritance;

public class Son extends Father {
	public Son () {
		super("Arjun", "1234", "54321");
	}

	public void display() {
		// Error coz accNo and password are private members
		System.out.println(name+" "+accNo+" "+password);
	}

}

