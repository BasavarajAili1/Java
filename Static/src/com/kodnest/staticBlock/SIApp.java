package com.kodnest.staticBlock;

public class SIApp {

	public static void main(String[] args) {
		BusinessMan b1 = new BusinessMan("Mallya");
		BusinessMan b2 = new BusinessMan("Modi");
		BusinessMan b3 = new BusinessMan("Adhani");
		
		b1.takeInput();
		b1.calculateSI();
		b1.display();
		
		b2.takeInput();
		b2.calculateSI();
		b2.display();

		b3.takeInput();
		b3.calculateSI();
		b3.display();
	}
}
