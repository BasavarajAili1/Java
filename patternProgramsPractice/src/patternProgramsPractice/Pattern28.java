package patternProgramsPractice;

public class Pattern28 {
	//PYRAMID ALPHABET PATTERN	
	public static void main(String[] args) {
		int n =6; 
		char ch='A'; 

		for(int i=0;i<n;i++) {
			// printing spaces
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			// printing alphabets
			for (int k=0;k<2*i+1;k++) {
				System.out.print((char)(ch+k));
			}
			System.out.println();
		}
	}
}
