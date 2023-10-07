package practiceHere;
import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Income");
		double income=scan.nextDouble();
		double res=calculateTax(income);
		System.out.println(res);

	}
	public static double calculateTax(double income) {
		if(income<=250000) {
			double tax=0;
			return tax;
		}
		else if (income>250000 && income<=500000) {
			double tax=(income-250000)*0.05;
			return tax;
		}
		else if (income>500000 && income<=1000000) {
			double tax=(income-500000)*0.2+12500;
			return tax;
		}
		else {
			double tax=(income - 1000000) * 0.3 +112500;
			return tax;
		}
	}
}
