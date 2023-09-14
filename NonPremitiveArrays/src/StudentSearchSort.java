

public class StudentSearchSort {

	public static void printStudentArray(Student arr[]) {
		for(int i=0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i].id+" "+arr[i].name+" "+arr[i].marks+" | ");
		}

	}

	public static boolean nameLinearSearch(Student arr[], String nameKey) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i].name.equals(nameKey)) {
				//System.out.println("Student Found");
				return true;
			}
		}
		return false;
	}

	public static void bubbleSort(Student arr[]) {
		int n = arr.length;
		for (int i=0; i<=n-2; i++)
		{
			for (int j=0; j<=n-2-i; j++)
			{
				if (arr[j].id > arr[j+1].id)
				{
					//swap
					Student temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void selectionSort(Student arr[]) {

		 for(int i=0; i<=arr.length-2; i++) {
			 int min = arr[i].id;
			 int pos = i;
			 
			 for(int j = i+1; j<=arr.length-1; j++) {
				 if (arr[j].id < min) {
					 min = arr[j].id;
					 pos = j;
				 }
			 }
			 //swap arr[i].id and arr[pos]
			 Student temp = arr[i];
			 arr[i] = arr[pos];
			 arr[pos] = temp;
			 
		 }
	}

	public static void insertionSort(Student arr[]) {
		for (int i=1; i<=arr.length-1; i++) {
			int item =arr[i].id;
			Student item2 =arr[i];
			int j = i-1;
			
			while (j>=0 && arr[j].id>item) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item2;
		}
	}

	public static boolean binarySearch(Student arr[], int idKey) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid].id == idKey )
			{
				System.out.println("Student ID is found and name is "+arr[mid].name);
				return true;
			}
			else if(idKey > arr[mid].id)
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		return false;
	}

	public static void rateOurAPP(int stars) {
		for(int i=1;i<=stars;i++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}
