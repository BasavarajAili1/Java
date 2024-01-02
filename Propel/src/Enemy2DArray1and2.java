
public class Enemy2DArray1and2 {

    public static String ArrayChallenge(String[] strArr, String token) {
        int rows = strArr.length;
        int cols = strArr[0].length();

        // Finding the position of '1' and '2'
        int oneRow = -1, oneCol = -1, twoRow = -1, twoCol = -1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (strArr[i].charAt(j) == '1') {
                    oneRow = i;
                    oneCol = j;
                } else if (strArr[i].charAt(j) == '2') {
                    twoRow = i;
                    twoCol = j;
                }
            }
        }

        // If '2' is not present, return 0
        if (twoRow == -1 || twoCol == -1) {
            return "0";
        }

        // Calculate the minimum distance considering wrapping around the matrix
        int distance1 = Math.min(Math.abs(oneRow - twoRow), rows - Math.abs(oneRow - twoRow));
        int distance2 = Math.min(Math.abs(oneCol - twoCol), cols - Math.abs(oneCol - twoCol));
        
        int res = Math.max(distance1, distance2);
        System.out.println(res);
        
        StringBuilder sb = new StringBuilder(token);
        String revToken = sb.reverse().toString();
        
        StringBuilder finalRes = new StringBuilder();
        
        return finalRes.append(res).append(":").append(revToken).toString();
    }

    public static void main(String[] args) {
        String[] input1 = {"0000", "1000", "0002", "0002"};
        String[] input2 = {"000", "100", "200"};
        String[] input3 = {"0000", "2010", "0000", "2002"};
        String token = "f7cqkbo5960d";

        String output1 = ArrayChallenge(input1, token);
        String output2 = ArrayChallenge(input2, token);
        String output3 = ArrayChallenge(input3, token);
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
    }
}

