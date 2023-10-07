package practiceHere;
import java.util.Scanner;
public class CountNums {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Integer Number: ");
		int num=scan.nextInt();
		System.out.println("Enter which digit have to be counted? ");
		int digit=scan.nextInt();
		
		int count=0;
		while(num>0) {
			int lastDigit=num%10;
			if (lastDigit==digit) {
				count++;
			}
			num=num/10;
		}
		
		System.out.println("So count of "+digit+" is "+count);
	}

}
