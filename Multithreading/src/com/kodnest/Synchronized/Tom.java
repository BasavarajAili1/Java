package com.kodnest.Synchronized;

public class Tom implements Runnable{
	Hospital2 h;
	
	public Tom(Hospital2 h) {
		super();
		this.h = h;
	}
	
	@Override
	public void run() {
		h.treatTom();
		
	}

	
	
}
