package practiceHere;

import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int len = scan.nextInt();
		
		for(int i=0;i<=s.length()-len;i++) {
			System.out.println(s.substring(i,i+len));
		}
	}

}
