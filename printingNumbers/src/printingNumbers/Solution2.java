package printingNumbers;
import java.util.Scanner;
//2. Display all numbers divisible by 3 
//And Enter n>100 as per the Question

public class Solution2 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Until where the Numbers which Divisible by 3 are Displayed");
		int n=scan.nextInt();
		numbersDivBy3(n);

	}
	public static void numbersDivBy3(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
}
