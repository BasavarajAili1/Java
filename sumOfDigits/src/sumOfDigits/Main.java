package sumOfDigits;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an Integer N");
		int n=scan.nextInt();
		calculateSumOfDigits(n);
	}
	public static void calculateSumOfDigits(int n) {
		int sum=0;
		while (n!=0) {
			int rem=n%10;//Access last digit by taking remainder
			sum=sum+rem;
			n=n/10;//To remove last digit take quotient
		}
		System.out.println("The Sum of all Digits is: "+sum);
	}
}
