package com.kodnest.hasARealation;

public class Students extends Human {
	Books ref;
	public void hasA(Books ref) {
		this.ref = ref;
		System.out.println(ref.getName());
		System.out.println(ref.getAuthor());
		System.out.println(ref.getPrice());
	}
	
	Car ref2;
	public void hasA(Car ref2) {
		this.ref2 = ref2;
		System.out.println(ref2.getBrand());
		System.out.println(ref2.getColor());
		System.out.println(ref2.getCost());
	}
	
}
