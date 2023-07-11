package ttePowerofSquares;
import java.util.Scanner;

public class PowersqApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number to be squared");
		int num=scan.nextInt();
		System.out.println(Powersq.squareNumber(num));
		scan.close();
	}

}
