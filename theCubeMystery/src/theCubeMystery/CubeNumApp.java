package theCubeMystery;
import java.util.Scanner;

public class CubeNumApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		System.out.println(CubeNum.cubeNumber(num));
		scan.close();
	}

}
