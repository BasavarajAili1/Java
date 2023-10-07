package gradeCheck;
import java.util.Scanner;
/**
 * @author Basavaraj Aili
 * @version 1.0
 */
public class Main {
	/**
	 * 
	 * @param grade In this method the int type grade parameter is passing
	 */
		public static void checkGrade(int grade)
	{
		if(grade>50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
/**
 * This is main method 
 * @param args Here the Call method is done
 */
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student Grade");
		int grade=scan.nextInt();
		checkGrade(grade);
	}

}
