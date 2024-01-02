import java.util.ArrayList;
import java.util.List;

public class CommandLineLengths {

    public static String CommandLine(String str) {
        String[] splitStringAtEqualSign = str.split("=");
        List<Integer> argumentsArray = new ArrayList<>();
        StringBuilder argumentsString = new StringBuilder();

        for (int i = 0; i < splitStringAtEqualSign.length; i++) {
            if (i == 0 || i == splitStringAtEqualSign.length - 1) {
                argumentsArray.add(splitStringAtEqualSign[i].length());
            } else {
                int lastIndexOfSpace = splitStringAtEqualSign[i].lastIndexOf(" ");
                argumentsArray.add(splitStringAtEqualSign[i].substring(0, lastIndexOfSpace).length());
                argumentsArray.add(splitStringAtEqualSign[i].substring(lastIndexOfSpace + 1).length());
            }
        }

        for (int i = 0; i < argumentsArray.size(); i++) {
            if (i % 2 != 0) {
                argumentsString.append("=");
            }
            argumentsString.append(argumentsArray.get(i));
            if (i % 2 != 0) {
                argumentsString.append(" ");
            }
        }
        return argumentsString.toString().trim();
    }

    public static void main(String[] args) {
//        System.out.println("Enter the string:");
        String input1 = "SampleNumber=3234 provider=Dr. M. Welby patient=John Smith priority=High";
        String input2 = "letters=A B Z T numbers=1 2 26 20 combine=true";
        String output1 = CommandLine(input1);
        String output2 = CommandLine(input2);
        
        
        System.out.println(output1);
        System.out.println(output2);
    }
}
