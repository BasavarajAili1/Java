package com.kodnest.hasARealation;

public class MobileApp {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		System.out.println(mobile.os.name);
		System.out.println(mobile.os.type);
		
		Charger charger = new Charger("Samsung", "Black", "C-type");
		mobile.hasA(charger);
		System.out.println("=================================");
		
		// assume mobile object made null or destroyed
		System.out.println("Mobile Lost..");
		mobile = null; 
		// below line through an exception coz once Enclosing object is not accessible
		//the composite object also will not be accessible but we can access Aggregation object
//		mobile.hasA(charger);
		System.out.println(charger.getBrand());
		System.out.println(charger.getColor());
		System.out.println(charger.getType());
	}
}
