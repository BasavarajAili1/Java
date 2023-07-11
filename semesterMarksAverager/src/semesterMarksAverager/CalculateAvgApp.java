package semesterMarksAverager;
import java.util.Scanner;

public class CalculateAvgApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the all eight Marks:");
		int sem1=scan.nextInt();
		int sem2=scan.nextInt();
		int sem3=scan.nextInt();
		int sem4=scan.nextInt();
		int sem5=scan.nextInt();
		int sem6=scan.nextInt();
		int sem7=scan.nextInt();
		int sem8=scan.nextInt();
		//CalculateAvg cg=new CalculateAvg();
		System.out.printf("%.2f",CalculateAvg.calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8));
		scan.close();
	}

}
