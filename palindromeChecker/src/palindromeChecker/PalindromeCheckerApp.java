package palindromeChecker;
import java.util.Scanner;

public class PalindromeCheckerApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter an Integer to check palindrome or not");
		int n=scan.nextInt();
		int orginal=n;
		PalindromeChecker palindrome=new PalindromeChecker();
		int res=palindrome.palindromecheker(n);
		System.out.println("The Reversed Number is: "+res);
		if(res==orginal) {
			System.out.println("The entered numbers is Palindrome");
		}
		else {
			System.out.println("The entered numbers is not Palindrome");
		}

	}

}
