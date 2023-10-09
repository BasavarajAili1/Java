package com.kodnest.hasARealation;

public class Books {
	String name;
	String author;
	int price;
	public Books(String name, String author, int price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
}
