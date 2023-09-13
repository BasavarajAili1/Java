import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many objects you want to create");
		int noo = scan.nextInt();
		Student arr[] = new Student[noo];
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter ID");
			int id = scan.nextInt();
			System.out.println("Enter name");
			String name = scan.next();
			System.out.println("Enter marks");
			int marks=scan.nextInt();
			
			arr[i] = new Student(id, name, marks);
		}
		
		
		
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i].id+" "+arr[i].name+" "+arr[i].marks+" | ");
		}

	}

}
