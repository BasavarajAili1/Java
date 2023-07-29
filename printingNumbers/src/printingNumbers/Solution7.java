package printingNumbers;
import java.util.Scanner;
//7. Display all even numbers divisible by 3
//And Enter n>100 as per the Question

public class Solution7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Until where the all even numbers divisible by 3 are Displayed");
		int n=scan.nextInt();
		evenDivBy3(n);
	}
	public static void evenDivBy3(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0 && i%3==0) {
				System.out.println(i);
			}
		}
	}

}
