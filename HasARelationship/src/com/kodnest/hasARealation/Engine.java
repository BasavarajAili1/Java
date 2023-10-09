package com.kodnest.hasARealation;

public class Engine {
	String type;
	int BHP;
	public Engine(String type, int bHP) {
		super();
		this.type = type;
		BHP = bHP;
	}
	
	public String getType() {
		return type;
	}
	public int getBHP() {
		return BHP;
	}
}
