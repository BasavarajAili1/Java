package theFinanceCalculator;
import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Principal as Real number");
		double principal=scan.nextDouble();
		System.out.println("Enter the Rate of Interest as Real number");
		double rate=scan.nextDouble();
		System.out.println("Enter the Time as Real number");
		double time=scan.nextDouble();
		FinanceCalculator calculator=new FinanceCalculator();
		System.out.println(calculator.calculateSimpleInterest(principal, rate, time));
		scan.close();
	}

}
