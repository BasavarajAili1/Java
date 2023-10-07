package fibonacciSeries;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printFibonacciSeries(n);

	}

	public static void printFibonacciSeries(int n) {
		int fib1=0;
		int fib2=1;
		if(n==1) {
			System.out.print(fib1);
		}
		else if(n==2) {
			System.out.print(fib1+" "+fib2+" ");
		}
		else {
			System.out.print(fib1+" "+fib2+" ");
			for(int i=3;i<=n;i++) {
				int nextNo=fib1+fib2;
				System.out.print(nextNo+" ");
				fib1=fib2;
				fib2=nextNo;
			}
		}
	}
}
