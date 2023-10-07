package practiceHere;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 nums");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int max=a;
		if(b>max) {
			max=b;
		}
		if(c>max){
			max=c;
		}
		System.out.println("Largest is: "+max);
	}

}
