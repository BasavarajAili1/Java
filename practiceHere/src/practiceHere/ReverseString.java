package practiceHere;
import java.util.Scanner;;
public class ReverseString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//String input = "Hello World!";
		String input=scan.nextLine();
		String reversed = reverseString(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + reversed);
	}

	public static String reverseString(String str) {
		char[] characters = str.toCharArray();
		int left = 0;
		int right = characters.length - 1;

		while (left < right) {
			char temp = characters[left];
			characters[left] = characters[right];
			characters[right] = temp;

			left++;
			right--;
		}

		return new String(characters);
	}
}
