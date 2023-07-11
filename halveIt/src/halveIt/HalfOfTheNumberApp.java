package halveIt;
import java.util.Scanner;

public class HalfOfTheNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to be Halved as Real Num:");
		double num=scan.nextDouble();
		System.out.println(HalfOfTheNumber.halveTheNumber(num));
		scan.close();
	}

}
