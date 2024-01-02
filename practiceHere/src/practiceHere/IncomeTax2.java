package practiceHere;
import java.util.Scanner;
public class IncomeTax2 {

	public static double calculateTax(double income) {
		if (income <= 250000) {
			return 0; // No tax for income upto 2.5 lakhs
		} else if (income <= 500000) {
			return (income - 250000) * 0.05; // 5% tax for income between 2.5 lakhs and 5 lakhs
		} else if (income <= 1000000) {
			return (income - 500000) * 0.2 + 12500; // 5% + 20% tax for income between 5 lakhs and 10 lakhs
		} else {
			return (income - 1000000) * 0.3 + 112500; // 5% + 20% + 30% tax for income above 10 lakhs
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double income = scan.nextDouble();
		double tax = calculateTax(income);
		System.out.println("Tax for income " + income + " is: " +tax);
	}
}