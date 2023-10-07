package com.kodnest.projectsession;

public class CheckMultipleLogic {
	public void check3and5 (int num) {
		if(num%3==0 && num%5==0) {
			System.out.println("Yes! "+num+" is Div by 3 and 5");
		}
		else {
			System.out.println("No! "+num+" is not Div by 3 and 5");
		}
	}

	void check2345(int num) {
		if(num%2==0 && num%3==0 && num%4==0 && num%5==0) {
			System.out.println("Yes! "+num+" is Div by 2,3,4 and 5");
		}
		else {
			System.out.println("No! "+num+" is not Div by 2,3,4 and 5");
		}
	}
}
