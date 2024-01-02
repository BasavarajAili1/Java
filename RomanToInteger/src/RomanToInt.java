import java.util.Scanner;

public class RomanToInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int sum = 0;
//		s = s.toUpperCase();
		for(int i=0;i<s.length();i++) {
			int value = getValue(s.charAt(i));
			if(i+1 < s.length() && value >= getValue(s.charAt(i+1))) {
				
				sum = sum + value;
			}
			else {
				sum = sum - value;
			}
		}
		System.out.println(sum);
	}
	public static int getValue(char ch) {
		switch(ch) {
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'M': return 1000;
		default:
			return 0;
		}
	}

}
