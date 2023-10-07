import java.util.Scanner;

public class FactorialApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		Factorial factorial = new Factorial();
		int res=factorial.fact(n);
		System.out.println(res);
	}

}
