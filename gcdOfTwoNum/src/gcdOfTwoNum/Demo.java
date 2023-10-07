package gcdOfTwoNum;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		while(n!=0) {
			int rem=m%n;
			m=n;
			n=rem;
		}
		System.out.println("GCD: "+m);
	}
}
