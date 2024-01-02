public class PermutationsChallenge {
    public static int permutationsStep(int num) {
        String string = Integer.toString(num);
        if (string.length() == 1) {
            return -1;
        }
        for (int i = string.length() - 2; i >= 0; i--) {
            if (string.charAt(i) < string.charAt(i + 1)) {
                String nextPermutation = string.substring(0, i) + string.charAt(i + 1) + string.substring(i + 2) + string.charAt(i);
                String challengeToken = "bk1f4zv9n0e";
                String finalOutput = nextPermutation + challengeToken;

                // Replace every fourth character with an underscore
                StringBuilder sb = new StringBuilder(finalOutput);
                for (int j = 3; j < sb.length(); j += 4) {
                    sb.setCharAt(j, '_');
                }

                System.out.println("Input: " + string);
                System.out.println("Output: " + nextPermutation);
                System.out.println("Final Output: " + sb.toString());
                return Integer.parseInt(nextPermutation);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int res = permutationsStep(11121);
        System.out.println();
        res = permutationsStep(41352);
    }
}
