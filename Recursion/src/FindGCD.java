import java.util.Scanner;

public class FindGCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int m=scan.nextInt();
		int n=scan.nextInt();
		GCDOfNumbers gcd = new GCDOfNumbers();
		int res=gcd.GCD(m, n);
		System.out.println(res);

	}

}
