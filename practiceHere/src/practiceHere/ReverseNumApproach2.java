package practiceHere;

import java.util.Scanner;

public class ReverseNumApproach2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Integer Number: ");
		int n=scan.nextInt();
	
		int revNum=0;
		while(n>0) {
			int lastDigit=n%10;
			revNum=revNum*10+lastDigit;
			n=n/10;
		}
		System.out.println(revNum);

	}

}
