package factorsOfNumber;
import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number...");
		int n=scan.nextInt();
		System.out.println("Factors of number are");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
