package fibonacciSeries;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Upto which number the series have to be printed..");
		int n=scan.nextInt();
		Series series=new Series();
		series.FibonacciSeries(n);
	}
}
