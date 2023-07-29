package printingNumbers;
import java.util.Scanner;
//8. Display all odd numbers divisible by 5
//And Enter n>100 as per the Question

public class Solution8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Until where the all odd numbers divisible by 5 are Displayed");
		int n=scan.nextInt();
		oddDivBy5(n);
	}
	public static void oddDivBy5(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2!=0 && i%5==0) {
				System.out.println(i);
			}
		}

	}

}
