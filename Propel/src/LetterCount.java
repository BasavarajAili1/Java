import java.util.HashMap;
import java.util.Map;

public class LetterCount {

    public static String LetterCountI(String str) {
        String[] words = str.split(" ");
        String resultWord = "";
        int maxRepeatCount = 0;

        for (String word : words) {
            Map<Character, Integer> charCount = new HashMap<>();

            for (char ch : word.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
            }

            int repeatCount = 0;
            for (int count : charCount.values()) {
                if (count > 1) {
                    repeatCount += count;
                }
            }

            if (repeatCount > maxRepeatCount) {
                maxRepeatCount = repeatCount;
                resultWord = word;
            }
        }
        
        if(maxRepeatCount > 0) {
        	return resultWord;
        }
        else {
        	return "-1";
        }
//        return maxRepeatCount > 0 ? resultWord : "-1";
    }

    public static void main(String[] args) {
        String input1 = "Hello apple pie";
        String input2 = "No words";
        String input3 = "hiiiiiii words";

        System.out.println(LetterCountI(input1)); // Output: Hello
        System.out.println(LetterCountI(input2)); // Output: -1
        System.out.println(LetterCountI(input3)); // Output: hiiiiiii
    }
}
