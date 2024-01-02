public class MinWindowSubstring {

    public static String minWindowSubstring(String[] strArr) {
        String str = strArr[0];
        String needle = strArr[1];

        for (int i = needle.length(); i <= str.length(); i++) {
            for (int j = 0; j <= str.length() - i; j++) {
                String mySlice = str.substring(j, j + i);
                if (isContained(mySlice, needle)) {
                    return mySlice;
                }
            }
        }
        return "Not in string";
    }

    public static boolean isContained(String str, String needle) {
        StringBuilder arr = new StringBuilder(str);
        for (int i = 0; i < needle.length(); i++) {
            int place = arr.indexOf(String.valueOf(needle.charAt(i)));
            if (place == -1) {
                return false;
            } else {
                arr.delete(place, place + 1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(minWindowSubstring(new String[]{"aaffhkksemckelloe", "fhea"}));
        System.out.println(isContained("affhkkse", "fhea"));
    }
}