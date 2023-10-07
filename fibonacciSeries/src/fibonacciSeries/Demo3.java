package fibonacciSeries;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        scanner.close();
        
        Map<Character, Integer> charFrequency = new HashMap<>();
        
        for (char c : text.toCharArray()) {
            if (c != ' ') {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }
        
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
	
