package patternProgramsPractice;

public class Pattern25 {
	//LEFT ANGLE PASCAL'S PATTERN
	public static void main(String[] args) {
		int n=5;
		//There are two outer for loops in this program
		//This Outer Loop prints the first half of
		// the Left Pascal triangle pattern
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			//Prints the stars of each row
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//This Outer Loop Prints second half of the triangle
		for(int i=n;i>=1;i--)
		{

			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}

			for(int k=1;k<i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
