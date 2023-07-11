package theJourneyCalculator;
import java.util.Scanner;
public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Speed as real num");
		double speed=scan.nextDouble();
		System.out.println("Enter the Time as real num");
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		System.out.printf("%.2f",journeyCalculator.calculateDistance(speed, time));
		scan.close();
	}
}
