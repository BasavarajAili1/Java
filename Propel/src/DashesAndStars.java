
public class DashesAndStars {
	public static void main(String[] args) {
		String token = "f4rmu89a1?";
		String input1 = "98234925928";
		String input2 = "2397492834092";
		System.out.println(inserStartAndHyphen("99946", token));
		System.out.println(inserStartAndHyphen(input1, token));
		System.out.println(inserStartAndHyphen(input2, token));
	}
	
	public static String inserStartAndHyphen(String s, String token){
		// Stores resulting string.

		StringBuilder sb = new StringBuilder();
		StringBuilder res = new StringBuilder();
		// Start with the first character
		sb.append(s.charAt(0));

		for(int i = 0; i < s.length() - 1; i++){

			int v1 = Integer.parseInt("" + s.charAt(i));
			int v2 = Integer.parseInt("" + s.charAt(i + 1));


			// Check if both or even numbers then appen '*'
			if(v1 != 0 && v2 != 0 && v1 % 2 == 0 && v2 % 2 == 0) {
				sb.append('*');
			} 
			// Check if both are odd numbers then append '-'
			else if(v1 % 2 != 0 && v2 % 2 != 0){
				sb.append('-');
			}
			//put next character in result.
			sb.append(s.charAt(i + 1));
		}
		
		// Removing chars that are same in token
		String output = sb.toString();
		char[] outputArr = output.toCharArray();
		char[] tokenArr = token.toCharArray();
//		boolean present = false;
		
		for(int i=0;i<outputArr.length;i++) {
			char outChar = outputArr[i];
			boolean present = false;
			for(int j=0;j<tokenArr.length;j++) {
				if(outChar == tokenArr[j]) {
					present = true;
					break;
				}
				
			}
			if(present != true) {
				res.append(outChar);
			}
			
		}
		return res.toString();
	}
}
