package printingNumbers;
import java.util.Scanner;
//1. Display all numbers divisible by 2 
//And Enter n>100 as per the Question

public class Solution1 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Until where the Numbers which Divisible by 2 are Displayed");
		int n=scan.nextInt();
		dispNumbersDivBy2(n);
	}
	public static void dispNumbersDivBy2(int n) {
		for(int i=1;i<n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}

