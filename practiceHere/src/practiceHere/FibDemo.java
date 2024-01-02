package practiceHere;
import java.util.Scanner;
public class FibDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number up to which you want the Fibonacci series: ");
		int num = scanner.nextInt();
		int fib1 = 0;
		int fib2 = 1;
		int nextNo;

		System.out.println("Fibonacci series up to " + num + ":");
		System.out.print(fib1 + " " + fib2 + " ");
		do {
			nextNo = fib1 + fib2;
			if (nextNo <= num) {
				System.out.print(nextNo + " ");
			}
			fib1 = fib2;
			fib2 = nextNo;
		} while (nextNo <= num);
	}
}