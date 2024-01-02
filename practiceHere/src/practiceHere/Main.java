package practiceHere;

import java.util.Scanner;
public class Main {
	public static long calculateFactorial(int number) {
		long fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number=scanner.nextInt();
		System.out.println(calculateFactorial(number));
		scanner.close();
	}
}
