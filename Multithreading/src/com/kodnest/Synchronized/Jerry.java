package com.kodnest.Synchronized;

public class Jerry implements Runnable {
	Hospital2 h;
	
	public Jerry(Hospital2 h) {
		super();
		this.h = h;
	}
	
	@Override
	public void run() {
		h.treatJerry();
		
	}
	

}
