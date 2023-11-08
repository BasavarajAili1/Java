package com.kodnest.multithreading5;

public class InstagramApp {

	public static void main(String[] args) {
		
		System.out.println("Instagram Application started");
		Chatting chat = new Chatting();
		Reels reels = new Reels();
		
		chat.start();
		reels.start();
		
		try {
			chat.join();
			reels.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Instagram Application ended");
	}

}
