package practiceHere;

public class PrintEvenOddString {

	public static void main(String[] args) {
		String s = "ABCDEF";
		String even = "";
		String odd  = "";
		for(int i=0;i<=s.length()-1;i++) {
			if(i % 2 == 0) {
				even = even+s.charAt(i);
			}
			else {
				odd = odd+s.charAt(i);
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
