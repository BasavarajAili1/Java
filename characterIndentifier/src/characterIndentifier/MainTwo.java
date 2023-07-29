package characterIndentifier;
import java.util.Scanner;

public class MainTwo {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter an Character to be Identified...");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	}

	public static void identifyCharacter(char ch) {
		if(Character.isDigit(ch)) {
			System.out.println("Character "+ch+" is Digit");
		}
		else if(Character.isLetter(ch)==false) {
			System.out.println("Character "+ch+" is Special Character");
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch)) {
					System.out.println("Character "+ch+" is Lower-Case Vowel");
				}
				else {
					System.out.println("Character "+ch+" is Upper-Case Vowel");
				}
				break;
			default:
				if(Character.isUpperCase(ch)) {
					System.out.println("Character "+ch+" is Upper-Case Consonant");
				}
				else {
					System.out.println("Character "+ch+" is Upper-Case Consonant");
				}
					
			}
			
		}
	}
}
