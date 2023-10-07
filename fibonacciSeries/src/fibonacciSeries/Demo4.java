package fibonacciSeries;
import java.util.*;
public class Demo4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        double num1 = scanner.nextDouble();
	        double num2 = scanner.nextDouble();
	        char operator = scanner.next().charAt(0);
	        switch (operator){
	            case '+':
	                    System.out.println(num1+num2);
	                    break;
	            case '-':
	                    System.out.println(num1-num2);
	                    break;
	            case '*':
	                    System.out.println(num1*num2);
	                    break;
	            case '/':
	                    System.out.println(num1/num2);
	                    break;
	            default:
	                    System.out.println(num1+num2);
	        }

	        // write your code here
	    }

}
