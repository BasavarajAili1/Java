package com.kodnest.mutablestirngs;

public class Demo2 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("Sachin is an Bataman");
		System.out.println(sb1.capacity());
		sb1.append("He lives in Mumbai");
		System.out.println(sb1.capacity());
		
		System.out.println("++++++++++++++++++++++++++");
		
		StringBuilder strb = new StringBuilder();
		System.out.println(strb.capacity());
		strb.append("Saurav is an Batsman");
		System.out.println(strb.capacity());
		strb.append("He lives in Mumbai");
		System.out.println(strb.capacity());
		
	}

}
