
public class DashesAndStars1 {

	public static void main(String[] args) {
		String input1 = "98234925928";
		String input2 = "2397492834092";
		String input3 = "99946";
		String token = "f4rmu89a1?";
		
		System.out.println(insertDashesAndStars(input3, token));
		System.out.println(insertDashesAndStars(input1, token));
		System.out.println(insertDashesAndStars(input2, token));
	}

	public static String insertDashesAndStars(String str, String token) {
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		
		for(int i=0;i<str.length()-1;i++) {
			
			int v1 = Integer.parseInt(""+str.charAt(i));
			int v2 = Integer.parseInt(""+str.charAt(i+1));
			
			if(v1 != 0 && v2 != 0 && v1%2==0 && v2%2==0) {
				sb.append("*");
			}
			else if(v1%2 != 0 && v2%2 != 0) {
				sb.append("-");
			}
			
			sb.append(str.charAt(i+1));
		}
		
		String outputStr = sb.toString();
		StringBuilder res = new StringBuilder();
		char[] outputArr = outputStr.toCharArray();
		char[] tokenArr = token.toCharArray();
		
		
		for(int i=0;i<outputArr.length;i++) {
			char currentChar = outputArr[i];
			
			boolean present = false;
			for(int j=0;j<tokenArr.length;j++) {
				if(currentChar == tokenArr[j]) {
					present = true;
					break;
				}
			}
			
			if(!present) {
				res.append(currentChar);
			}
		}
		
		return res.toString();
	}
}
