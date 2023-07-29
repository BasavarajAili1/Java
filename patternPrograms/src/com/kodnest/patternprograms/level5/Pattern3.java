package com.kodnest.patternprograms.level5;

public class Pattern3 {

	public static void main(String[] args) {
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if((i+j==2) || (j-i==2) || (i==2 && i%1==0))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
}
}
