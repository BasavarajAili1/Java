package armstrongNumberChecker;

public class ArmStrongChecker {
	public int armStrongCheck(int n, int count) {
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			int num=(int) Math.pow(rem, count);
			sum=sum+num;
			n=n/10;
		}
		return sum;
	}
}
	
		
