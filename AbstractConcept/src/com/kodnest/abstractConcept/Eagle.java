package com.kodnest.abstractConcept;

// Abstract class cannot be made as final.
// If a class is extending from abstract class then it should override
// abstract methods from parent class or should be declared as abstract
public abstract class Eagle extends Bird {

	// Abstract methods cannot be made as final
	public final abstract void eat();
	public void hunt() {
		
	}
}
