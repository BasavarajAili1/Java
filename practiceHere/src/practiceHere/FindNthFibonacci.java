package practiceHere;

import java.util.Scanner;

public class FindNthFibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num");
		int n=scan.nextInt();
		
		int a=0;
		int b=1;
		int count=2;
		while(count<=n) {
			int temp=b;
			b=b+a;
			a=temp;
			count++;
		}
		System.out.println(b);

	}

}
