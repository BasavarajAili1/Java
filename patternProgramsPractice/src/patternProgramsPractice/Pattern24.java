package patternProgramsPractice;

public class Pattern24 {
	//RIGHT ANGLE PASCAL'S PATTERN
	public static void main(String[] args) {
		int n=5;
		// There are two outer for loops in this program
		// This is Outer Loop prints the first half of
		// The Right Pascal triangle pattern
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//This Outer Loop Prints second half of the triangle
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<=i-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
