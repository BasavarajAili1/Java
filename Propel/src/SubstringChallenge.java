
import java.util.HashMap;
import java.util.Map;

public class SubstringChallenge {

    public static String longestSubstringWithKUniqueCharacters(String str) {
        int k = Character.getNumericValue(str.charAt(0));
        if (k <= 0 || k > 6) {
            return "Invalid k value";
        }

        Map<Character, Integer> charCount = new HashMap<>();
        int start = 1, end = 1, uniqueCount = 0;
        int maxLength = 0;
        String longestSubstring = "";

        while (end < str.length()) {
            char currentChar = str.charAt(end);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0)+1);

            if (charCount.get(currentChar) == 1) {
                uniqueCount++;
            }

            while (uniqueCount > k) {
                char startChar = str.charAt(start);
                charCount.put(startChar, charCount.get(startChar) - 1);

                if (charCount.get(startChar) == 0) {
                    uniqueCount--;
                }

                start++;
            }

            int currentLength = end - start + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestSubstring = str.substring(start, end + 1);
            }
            end++;
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        String input1 = "2aabbacbaa";
        String input2 = "3aabacbebebe";
        String result = longestSubstringWithKUniqueCharacters(input1);
        String result2 = longestSubstringWithKUniqueCharacters(input2);
        System.out.println(result);
        System.out.println(result2);
    }
}

