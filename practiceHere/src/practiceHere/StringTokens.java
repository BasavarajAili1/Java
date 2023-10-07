package practiceHere;
import java.util.*;
public class StringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s.trim();
        
        String st[]=s.split(" !,._'?");
        System.out.println(st.length);
        for(String x: st){
            System.out.println(x);
        }
        
        scan.close();

	}

}
