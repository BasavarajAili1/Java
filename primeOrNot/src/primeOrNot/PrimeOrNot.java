package primeOrNot;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number...");
		int n=scan.nextInt();

		if(n==2) {
			System.out.println("Number is Prime");
		}
		else if(n<2)
		{
			System.out.println("Not a Prime Number");
		}
		else
		{
			for(int i=2;i*i<=n;)
			{
				if(n%i==0)
				{
					System.out.println("Not a Prime Number");
					break;
				}
				else {
					System.out.println("Prime Number");
					break;
				}
			}
		}	
	}
}
