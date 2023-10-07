package practiceHere;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Integer Number: ");
		int n=scan.nextInt();
		
		String s="";
		while(n>0) {
			int lastDigit=n%10;
			s=s+lastDigit;
			n=n/10;
		}
		int revNum=Integer.valueOf(s);
		System.out.println(revNum);
	}

}
