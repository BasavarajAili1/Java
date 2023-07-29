package sumofNaturalNum;
import java.util.Scanner;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter N");
			int n=scan.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++)
			{
			sum=sum+i;
			}
			System.out.println("Sum is "+sum);
	}
}
