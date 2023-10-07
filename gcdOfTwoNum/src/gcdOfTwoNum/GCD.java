package gcdOfTwoNum;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers to find GCD");
		int m=scan.nextInt();
		int n=scan.nextInt();
		int res=FindGCD(m,n);
		System.out.println("GCD: "+res);
	}
	public static int FindGCD(int m, int n) {
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}
		return m;
	}
}
