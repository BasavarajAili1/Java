package com.kodnest.mutablestirngs;

public class Demo {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Rama");
		System.out.println(sb1);
		sb1.append("Sita");
		System.out.println(sb1);
		
		StringBuilder strb=new StringBuilder("Ravana");
		System.out.println(strb);
		strb.append("Asura");
		System.out.println(strb);

	}

}
