package fibonacciSeries;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.print("Enter the text: ");
		String inputText = scanner.nextLine();

		int[] charCounts = new int[128]; // Assuming ASCII characters

		for (char c : inputText.toCharArray()) {
			charCounts[c]++;
		}
		
		for (int i = 0; i < charCounts.length; i++) {
			if (charCounts[i] > 0 && i != ' ') {
				System.out.println((char) i + ": " + charCounts[i]);
			}
		} 
	}
}




