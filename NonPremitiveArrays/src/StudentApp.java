import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--WELOCOME TO STUDENT APPLICATION--");
		System.out.println("How many objects you want to create");
		int noo = scan.nextInt();
		Student arr[] = new Student[noo];
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.println("Enter student ID");
			int id = scan.nextInt();
			System.out.println("Enter student name");
			String name = scan.next();
			System.out.println("Enter student marks");
			int marks=scan.nextInt();

			arr[i] = new Student(id, name, marks);
		}

		StudentSearchSort.printStudentArray(arr);
		System.out.println();
		System.out.println("------------------------------------------------");

		System.out.println("Do you want to search student name? true/false");
		boolean userInput = scan.nextBoolean();
		if (userInput) {
			System.out.println("Enter name to search in student array");
			String nameKey = scan.next();
			boolean result = StudentSearchSort.nameLinearSearch(arr, nameKey);
			if(result) System.out.println("Student Found");
			else System.out.println("Student Not Found");
		}
		System.out.println("------------------------------------------------");

		System.out.println("Do you want to sort this array? (true/false)");
		userInput = scan.nextBoolean();
		if(userInput) {
			System.out.println("Ok, Now please choose your option to sort the array");
			System.out.println("1 --> Bubble Sort");
			System.out.println("2 --> Selection Sort");
			System.out.println("3 --> Insertion Sort");
			System.out.println("Default --> Selection sort");
			int choice =scan.nextInt();
			switch (choice) {
			case 1:
				StudentSearchSort.bubbleSort(arr);
				StudentSearchSort.printStudentArray(arr);
				System.out.println();
				break;

			case 2:
				StudentSearchSort.selectionSort(arr);
				StudentSearchSort.printStudentArray(arr);
				System.out.println();
				break;

			case 3:
				StudentSearchSort.insertionSort(arr);
				StudentSearchSort.printStudentArray(arr);
				System.out.println();
				break;
			default:
				StudentSearchSort.selectionSort(arr);
				StudentSearchSort.printStudentArray(arr);
				System.out.println();
				break;
			}
		}
		System.out.println("------------------------------------------------");


		System.out.println("Enter ID to be searched");
		int idKey = scan.nextInt();
		boolean result = StudentSearchSort.binarySearch(arr, idKey);
		if(result==false) {
			System.out.println("Student ID not found");
		}
		System.out.println("------------------------------------------------");

		System.out.println("Thank you. Rate our application out of 10!");
		int stars = scan.nextInt();
		StudentSearchSort.rateOurAPP(stars);

		scan.close();
	}
}
