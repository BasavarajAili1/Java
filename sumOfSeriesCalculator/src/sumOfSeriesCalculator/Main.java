package sumOfSeriesCalculator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		calculateSumOfSeries(n);
	}
	
	public static void calculateSumOfSeries(int n)
	{
		double sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+(1.0/i);
		}
		System.out.println("The sum of series upto given number is "+sum);
	}
}
