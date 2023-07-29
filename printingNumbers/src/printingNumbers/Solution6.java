package printingNumbers;
import java.util.Scanner;
//6. Display all Prime numbers
//And Enter n>100 as per the Question

public class Solution6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Until where the Prime Numbers are Displayed");
		int n=scan.nextInt();
		int count=0;
		for(int i=3;i<=n;i++) {
			int res=checkPrime(i);
			if(res!=0) {
				System.out.println(res);
				count++;
			}
			
		}System.out.println("Total Numbers are "+count);

	}
	public static int checkPrime(int number) {
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return 0;
			}
		}
		return number;
	}

}
